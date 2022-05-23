/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana3;

/**
 *
 * @author saulp
 */
public class Calculadora extends DispositivoElectronico {
    
    private String modelo;
    private String color;
    
    @Override
    public void encender() {
        System.out.println("Calculadora Enciende"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public double suma(double a, double b){
        return a + b;
    }
    
    public double resta(double a, double b){
        return a - b;
    }
    
    public double division(double a, double b){
        return a / b;
    }
    
    public double multiplicacion(double a, double b){
        return a * b;
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
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
    
}
