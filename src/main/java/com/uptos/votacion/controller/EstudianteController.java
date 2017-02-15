package com.uptos.votacion.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
import com.uptos.votacion.model.Estudiante;
import com.uptos.votacion.dao.EstudianteDAO;
import java.util.List;
@ManagedBean
@ViewScoped
public class EstudianteController implements Serializable
{
    private Estudiante estudiante = null;
    private List<Estudiante> estudiantes = null;

    public EstudianteController()
    {
        estudiante = new Estudiante();
    }

    public Estudiante getEstudiante()
    {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante)
    {
        this.estudiante = estudiante;
    }

    public List<Estudiante> getEstudiantes()
    {
        estudiantes = EstudianteDAO.read();
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes)
    {
        this.estudiantes = estudiantes;
    }
    
    
    

}
