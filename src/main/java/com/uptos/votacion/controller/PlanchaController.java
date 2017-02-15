package com.uptos.votacion.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
import com.uptos.votacion.model.Plancha;
import com.uptos.votacion.dao.PlanchaDAO;
import java.util.List;
@ManagedBean
@ViewScoped
public class PlanchaController implements Serializable
{
    private Plancha plancha = null;
    private List<Plancha> planchas = null;

    public PlanchaController()
    {
        plancha = new Plancha();
    }

    public Plancha getPlancha()
    {
        return plancha;
    }

    public void setPlancha(Plancha plancha)
    {
        this.plancha = plancha;
    }

    public List<Plancha> getPlanchas()
    {
        planchas = PlanchaDAO.read();
        return planchas;
    }

    public void setPlanchas(List<Plancha> planchas)
    {
        this.planchas = planchas;
    }
    
    
    

}
