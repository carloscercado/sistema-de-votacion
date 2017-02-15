package com.uptos.votacion.dao;

import com.uptos.votacion.hibernate.HibernateUtil;
import com.uptos.votacion.model.Estudiante;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public class EstudianteDAO {
    
    public static boolean create(Estudiante obj)
    {
        Session sesion=null;
        boolean state=false;
       
        
        try{
            sesion = HibernateUtil.getSesion().openSession();
            sesion.beginTransaction();
            sesion.save(obj);
            sesion.getTransaction().commit();
            state=true;
            
        } catch (Exception e){
            sesion.getTransaction().rollback();
            state=false;
            System.out.println(e.getMessage());  
           
        } finally{
            if (sesion != null){
                sesion.close();
            }
            return state;
        }        
    }

    public static List<Estudiante> read()    
    {
        Session sesion=null;
        List<Estudiante> lista=null;
        
        try{
            sesion=HibernateUtil.getSesion().openSession();
            sesion.beginTransaction().commit();
            lista=sesion.createQuery("from Estudiante").list();
            
        } catch(Exception e){
           sesion.getTransaction().rollback();
           
        } finally{
            return lista;
        }
    }
    
    public static boolean update(Estudiante obj)
    {
        Session sesion=null;
        boolean state=false;
        
        try{ 
            sesion=HibernateUtil.getSesion().openSession();
            sesion.beginTransaction();
            sesion.update(obj);
            sesion.getTransaction().commit();
            state=true;
            
        } catch (Exception e){
            sesion.getTransaction().rollback();
            state=false;
            
        } finally{
            if(sesion!=null){
                sesion.close();
            }            
            return state;
        }
    }
    
    public static boolean delete(Estudiante obj)
    {
        Session sesion=null;
        boolean state=false;
       
        try{
            sesion = HibernateUtil.getSesion().openSession();
            sesion.beginTransaction();
            sesion.delete(obj);
            sesion.getTransaction().commit();
            state=true;
            
        } catch (Exception e){
            sesion.getTransaction().rollback();
            state=false;
            
        } finally{
            if (sesion != null){
                sesion.close();
            }
            return state;
        }        
    }

}
