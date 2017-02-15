package com.uptos.votacion.model;  
// Generated 14-feb-2017 20:31:44 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Generado por Hibernate para Carlos Cercado
 */
public class Cargo  implements java.io.Serializable {


     private int id;
     private String nombre;
     private String descripcion;
     private Set procesos = new HashSet(0);

    public Cargo() {
    }

	
    public Cargo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    public Cargo(int id, String nombre, String descripcion, Set procesos) {
       this.id = id;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.procesos = procesos;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Set getProcesos() {
        return this.procesos;
    }
    
    public void setProcesos(Set procesos) {
        this.procesos = procesos;
    }




}


