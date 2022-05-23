/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana5;

/**
 *
 * @author saulp
 */
public class Automovil extends Transporte implements ISistemaElectrico, ISistemaFrenos{

    /**
     *
     * @param gasolina
     * @return
     */
    public String avanzar(double gasolina){
        if (gasolina > 10){
            return "Avanzando..";
        } else {
            return "No hay suficiente gasolina";
        }
    };

    /**
     *
     * @param gasolina
     * @return
     */
    public String reversa(double gasolina){
        if (gasolina > 10){
            return "Retrocediendo..";
        } else {
            return "No hay suficiente gasolina";
        }
    };

    /**
     *
     * @return
     */

    @Override
    public java.lang.String encenderLuces() {
        return "Luces encedidas"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public java.lang.String apagarLuces() {
        return "Luces apagadas"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String frenar() {
        return "Frenando..."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String encender(double gasolina) {
        if (gasolina > 10){
           return "Auto encendido" ;
        } else{
            return "No hay suficiente gasolina";
        }// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String apagar(double gasolina) {
        if (gasolina > 10){
           return "Auto apagado" ;
        } else{
            return "No hay suficiente gasolina";
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
