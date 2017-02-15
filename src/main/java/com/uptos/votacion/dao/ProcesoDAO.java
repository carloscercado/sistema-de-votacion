package com.uptos.votacion.dao;

import com.uptos.votacion.hibernate.HibernateUtil;
import com.uptos.votacion.model.Proceso;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
public class ProcesoDAO {
    
    public static boolean create(Proceso obj)
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

    public static List<Proceso> read()    
    {
        Session sesion=null;
        List<Proceso> lista=null;
        
        try{
            sesion=HibernateUtil.getSesion().openSession();
            sesion.beginTransaction().commit();
            lista=sesion.createQuery("from Proceso").list();
            
        } catch(Exception e){
           sesion.getTransaction().rollback();
           
        } finally{
            return lista;
        }
    }
    
    public static boolean update(Proceso obj)
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
    
    public static boolean delete(Proceso obj)
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
