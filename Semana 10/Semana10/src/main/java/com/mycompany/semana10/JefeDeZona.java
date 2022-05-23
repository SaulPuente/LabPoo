/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana10;

import java.util.ArrayList;

/**
 *
 * @author saulp
 */
public class JefeDeZona extends Empleado {
    
    private String matricula;
    private String marca;
    private String modelo;
    private String despacho;
    private Secretario secretario;
    private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
    private int cVendedores = 0;
    
    public JefeDeZona(String nombre, String apellidos, String DNI, String direccion, int telefono, float salario,
            String matricula, String marca, String modelo, String despacho) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.setIncremento((float) 0.2);
        
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.despacho = despacho;
    }

    @Override
    public String cambiarSupervisor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
     * @return the secretario
     */
    public Secretario getSecretario() {
        return secretario;
    }

    /**
     * @param secretario the secretario to set
     */
    public void setSecretario(Secretario secretario) {
        this.secretario = secretario;
    }

    /**
     * @return the vendedores
     */
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    /**
     * @param vendedores the vendedores to set
     */
    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    /**
     * @return the cVendedores
     */
    public int getcVendedores() {
        return cVendedores;
    }

    /**
     * @param cVendedores the cVendedores to set
     */
    public void setcVendedores(int cVendedores) {
        this.cVendedores = cVendedores;
    }

    @Override
    public void datosPrincipales() {
        
        System.out.println("\nDatos Principales\n");
        
        System.out.println("Despacho: " +  this.getDespacho());
        
        System.out.println("\nDatos del auto\n");
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        
    }

}
