/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.menu;

public class Costo {

    private String descripcionCosto;
    private String idCosto;
    private double montoCosto;
    private String idProyecto;


    public Costo(String descripcionCosto, String idCosto, double montoCosto, String idProyecto) {
        this.descripcionCosto = descripcionCosto;
        this.idCosto = idCosto;
        this.montoCosto = montoCosto;
        this.idProyecto = idProyecto;
    }

    // Getters and Setters

    public String getDescripcionCosto() {
        return descripcionCosto;
    }

    public void setDescripcionCosto(String descripcionCosto) {
        this.descripcionCosto = descripcionCosto;
    }

    public String getIdCosto() {
        return idCosto;
    }

    public void setIdCosto(String idCosto) {
        this.idCosto = idCosto;
    }

    public double getMontoCosto() {
        return montoCosto;
    }

    public void setMontoCosto(double montoCosto) {
        this.montoCosto = montoCosto;
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    
    public void actualizarMonto(double nuevoMonto) {
        this.montoCosto = nuevoMonto;
        System.out.println("Monto del costo actualizado a: " + nuevoMonto);
}
    
    public void mostrarDetalles() {
        System.out.println("Descripción del costo: " + descripcionCosto);
        System.out.println("ID del costo: " + idCosto);
        System.out.println("Monto del costo: " + montoCosto);
        System.out.println("ID del proyecto asociado: " + idProyecto);
}
    
    public void asociarAProyecto(String nuevoIdProyecto) {
    this.idProyecto = nuevoIdProyecto;
    System.out.println("Costo asociado al proyecto con ID: " + nuevoIdProyecto);
}
    
}
