/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author rarta
 * esto pertenece al modulo de gestion de proyectos 
 */


public class Tarea {
    // Atributos
    private String nombre;
    private String codigo;
    private String descripcion;
    private String estado;  // En Progreso, Terminada, En Cola, etc.
    private Proyecto proyectoPertenece;
    private String fechaEntrega; //formato mm/dd/yyyy
    private String personaEncargada;
    private String hito; //marca si la tarea es un hito del proyecto o no

    // Constructor
    public Tarea(String nombre, String codigo, String descripcion, String estado,
                 Proyecto proyectoPertenece, String fechaEntrega, String personaEncargada) {
       
        this.nombre = nombre;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.proyectoPertenece = proyectoPertenece;
        this.fechaEntrega = fechaEntrega;
        this.personaEncargada = personaEncargada;
        this.hito = "";
    }

    // Getters and Setters
    
     public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public Proyecto getProyectoPertenece() {
        return proyectoPertenece;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public String getPersonaEncargada() {
        return personaEncargada;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setProyectoPertenece(Proyecto proyectoPertenece) {
        this.proyectoPertenece = proyectoPertenece;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public void setPersonaEncargada(String personaEncargada) {
        this.personaEncargada = personaEncargada;
    }

    public String getHito() {
        return hito;
    }
   
     public void setHito(String hito) {
        this.hito = hito;
    }
    

    
    //Métodos
    public void actualizarEstado(String nuevoEstado) {
    this.estado = nuevoEstado;
    System.out.println("Estado de la tarea actualizado a: " + nuevoEstado);
}
    
    
    public void mostrarDetallesTarea() {
    System.out.println("Nombre de la tarea: " + nombre);
    System.out.println("Código de la tarea: " + codigo);
    System.out.println("Descripción de la tarea: " + descripcion);
    System.out.println("Estado de la tarea: " + estado);
    System.out.println("Proyecto al que pertenece: " + proyectoPertenece.getNombre());
    System.out.println("Fecha de entrega: " + fechaEntrega);
    System.out.println("Persona encargada: " + personaEncargada);
}
    
    
    public void asignarAProyecto(Proyecto nuevoProyecto) {
    this.proyectoPertenece = nuevoProyecto;
    System.out.println("Tarea asignada al proyecto: " + nuevoProyecto.getNombre());
}
    
   public void destacarHito(){
       this.hito = "milestone";
       
   }
   
   public void revisarHito(){
       if(hito != ""){
           System.out.println("Esta tarea " + this.codigo + " corresponde a un hito del proyecto");
       }else{
            System.out.println("Esta tarea no es un hito del proyecto");

       }
            
       
   }
   
}
