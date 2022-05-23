/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana5;

/**
 *
 * @author saulp
 */
public abstract class Transporte {
    private String marca;

    private String modelo;
    
    private Double gasolina;
    
    public abstract String encender(double gasolina);

    public abstract String apagar(double gasolina);

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
     * @return the gasolina
     */
    public Double getGasolina() {
        return gasolina;
    }

    /**
     * @param gasolina the gasolina to set
     */
    public void setGasolina(Double gasolina) {
        this.gasolina = gasolina;
    }
}
