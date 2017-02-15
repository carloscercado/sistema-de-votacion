package com.uptos.votacion.controller;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Carlos Cercado
 * @email cercadocarlos@gmail.com
 */
import com.uptos.votacion.model.Cargo;
import com.uptos.votacion.dao.CargoDAO;
import java.util.List;
@ManagedBean
@ViewScoped
public class CargoController implements Serializable
{
    private Cargo cargo = null;
    private List<Cargo> cargos = null;

    public CargoController()
    {
        cargo = new Cargo();
    }

    public Cargo getCargo()
    {
        return cargo;
    }

    public void setCargo(Cargo cargo)
    {
        this.cargo = cargo;
    }

    public List<Cargo> getCargos()
    {
        cargos = CargoDAO.read();
        return cargos;
    }

    public void setCargos(List<Cargo> cargos)
    {
        this.cargos = cargos;
    }
    
    
    

}
