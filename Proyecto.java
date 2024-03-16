/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

import java.util.logging.Logger;

/**
 *
 * @author rarta
 */
public class Proyecto {
    
    // Attributes
    private String nombre;
    private String codigo;
    private String fechaInicio; //formato "mm/dd/yyyy"
    private String fechaFinalizacion; //formato "mm/dd/yyyy"
    private int duracionMeses;  //duration in months or days  
    private int duracionDias;  //duration in months or days  
    private String lugar;
    private String personaEncargada;
    private double presupuesto;
    private String estado;
    private int costoProyecto;

    //Constructors 
    public Proyecto(String nombre, int costoProyecto, String codigo, String fechaInicio, String fechaFinalizacion, int duracionMeses, int duracionDias, String lugar, String personaEncargada, double presupuesto, String estado) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.duracionMeses = duracionMeses;
        this.duracionDias = duracionDias;
        this.lugar = lugar;
        this.personaEncargada = personaEncargada;
        this.presupuesto = presupuesto;
        this.costoProyecto = costoProyecto;
        this.estado = estado;
    }
    //Empty Constructor
    public Proyecto() {
        this.nombre = "";
        this.codigo = "";
        this.fechaInicio = "";
        this.fechaFinalizacion = "";
        this.duracionMeses = 0;
        this.duracionDias = 0;
        this.lugar = "";
        this.personaEncargada = "";
        this.presupuesto = 0;
        this.estado = "";
        this.costoProyecto = 0;
    }

    //Setters and Getters
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public int getDuracionMeses() {
        return duracionMeses;
    }

    public int getDuracionDias() {
        return duracionDias;
    }

    public String getLugar() {
        return lugar;
    }

    public String getPersonaEncargada() {
        return personaEncargada;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public String getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public void setDuracionMeses(int duracionMeses) {
        this.duracionMeses = duracionMeses;
    }

    public void setDuracionDias(int duracionDias) {
        this.duracionDias = duracionDias;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setPersonaEncargada(String personaEncargada) {
        this.personaEncargada = personaEncargada;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

 
    public int getCostoProyecto() {
        return costoProyecto;
    }

    public void setCostoProyecto(int costoProyecto) {
        this.costoProyecto = costoProyecto;
    }
    

    //Methods 
    
    //This changes status of progress of the project, through method attributes
    public void cambiarEstado(String nuevoEstado) {
       
        if ("En Progreso".equals(nuevoEstado) || "Completado".equals(nuevoEstado) || "Sin Iniciar".equals(nuevoEstado)) {
            this.estado = nuevoEstado;
            System.out.println("Estado cambiado a: " + nuevoEstado);
        } else {
            System.out.println("Estado no válido. No se realizó ningún cambio.");
        }
    }
    
    
    //This changes the person in charge of the project, pass person through the attributes of the method
     public void cambiarPersonaEncargada(String nuevaPersonaEncargada) {
        this.personaEncargada = nuevaPersonaEncargada;
        System.out.println("Persona encargada cambiada a: " + nuevaPersonaEncargada);
    }
     
   
   
    public void mostrarCaracteristicas() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Fecha de inicio: " + fechaInicio);
        System.out.println("Fecha de finalización: " + fechaFinalizacion);
        System.out.println("Lugar: " + lugar);
        System.out.println("Persona encargada: " + personaEncargada);
        System.out.println("Presupuesto: " + presupuesto);
        System.out.println("Estado: " + estado);
        
        if (duracionMeses != 0){
            System.out.println("Duración: " + duracionMeses + " días");

        }else{
            System.out.println("Duración: " + duracionDias + " días");
        }
    }

  
    
    
    
    
}
