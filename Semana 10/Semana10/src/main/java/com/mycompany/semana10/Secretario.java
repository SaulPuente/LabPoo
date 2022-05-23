/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana10;

/**
 *
 * @author saulp
 */
public class Secretario extends Empleado {
    
    private String despacho;
    private int fax;
    
    public Secretario(String nombre, String apellidos, String DNI, String direccion, int telefono, float salario, String despacho, int fax) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.setIncremento((float) 0.05);
        this.despacho = despacho;
        this.fax = fax;
    }


    @Override
    public String cambiarSupervisor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the despacho
     */
    public String getDespacho() {
        return despacho;
    }

    /**
     * @param despacho the despacho to set
     */
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    /**
     * @return the fax
     */
    public int getFax() {
        return fax;
    }

    /**
     * @param fax the fax to set
     */
    public void setFax(int fax) {
        this.fax = fax;
    }

    @Override
    public void datosPrincipales() {
        System.out.println("\nDatos Principales\n");
        
        System.out.println("Despacho: " + this.getDespacho());
        System.out.println("Número de Fax: " + this.getFax());
    }
}
