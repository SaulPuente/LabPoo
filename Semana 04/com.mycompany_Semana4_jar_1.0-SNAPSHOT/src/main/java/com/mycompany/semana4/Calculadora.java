/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana4;

/**
 *
 * @author saulp
 */
public class Calculadora extends DispositivoElectronico implements IOperacionesEstandar{
    
    private String modelo;
    private String color;
    
    @Override
    public void encender() {
        System.out.println("Calculadora Básica Enciende"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public double suma(double a, double b){
        return a + b;
    }
    
    @Override
    public double resta(double a, double b){
        return a - b;
    }
    
    @Override
    public double division(double a, double b){
        return a / b;
    }
    
    @Override
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
