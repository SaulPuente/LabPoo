/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana7;

/**
 *
 * @author saulp
 */
public class Avion extends Transporte implements ISistemaFrenos, ISistemaElectrico, IVolar{
    public Avion(int velocidad, int gas){
        super(velocidad, gas);
    }
    
    /**
     *
     * @param gasolina
     * @return
     */
    @Override
    public String avanzar(int gasolina){
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
    @Override
    public String reversa(int gasolina){
        if (gasolina > 10){
            return "Retrocediendo..";
        } else {
            return "No hay suficiente gasolina";
        }
    };
    
    
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
    public String encender(int gas) {
        if (gas > 10){
            System.out.println("Gasolina: " + gas);
           return "Avion encendido" ;
        } else{
            System.out.println("Gasolina: " + gas);
            return "No hay suficiente gasolina";
        }// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String apagar(int gasolina) {
        if (gasolina > 10){
           return "Avion apagado" ;
        } else{
            return "No hay suficiente gasolina";
        } // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String volar() {
        return "Volando.."; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
