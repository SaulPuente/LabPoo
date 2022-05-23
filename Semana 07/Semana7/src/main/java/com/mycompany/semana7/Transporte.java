/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7;

/**
 *
 * @author saulp
 */
public abstract class Transporte {
    private int velocidad;
    private int gas;
    
    private String marca;
    private String modelo;
    
    public abstract String encender(int gas);

    public abstract String apagar(int gas);
    
    public abstract String avanzar(int gas);
    public abstract String reversa(int gas);
    
    public Transporte(int velocidad, int gas){
        this.velocidad = velocidad;
        this.gas = gas;
    }
    
    public void acelerar(){
        System.out.println("Velocidad: " + getVelocidad());
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    /**
     * @return the gas
     */
    public int getGas() {
        return gas;
    }

    /**
     * @param gas the gas to set
     */
    public void setGas(int gas) {
        this.gas = gas;
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
}
