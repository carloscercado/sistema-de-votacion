package com.uptos.votacion.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
import com.uptos.votacion.model.Proceso;
import com.uptos.votacion.dao.ProcesoDAO;
import java.util.List;
@ManagedBean
@ViewScoped
public class ProcesoController implements Serializable
{
    private Proceso proceso = null;
    private List<Proceso> procesos = null;

    public ProcesoController()
    {
        proceso = new Proceso();
    }

    public Proceso getProceso()
    {
        return proceso;
    }

    public void setProceso(Proceso proceso)
    {
        this.proceso = proceso;
    }

    public List<Proceso> getProcesos()
    {
        procesos = ProcesoDAO.read();
        return procesos;
    }

    public void setProcesos(List<Proceso> procesos)
    {
        this.procesos = procesos;
    }
    
    
    

}
