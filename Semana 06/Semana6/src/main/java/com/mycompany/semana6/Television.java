/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana6;

import java.util.Scanner;

/**
 *
 * @author saulp
 */
public class Television extends DispositivoElectronico implements Configuracion{
    
    private String modelo;
    private String color;
    
    private String volumen;
    private String canal;
    
    private String passWifi;
    private String nombreWifi;
    private String colorConf;
    private String resolucionConf;
    
    @Override
    public void encender() {
        System.out.print("Televisión Enciende"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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

    /**
     * @return the volumen
     */
    public String getVolumen() {
        return volumen;
    }

    /**
     * @param volumen the volumen to set
     */
    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    /**
     * @return the canal
     */
    public String getCanal() {
        return canal;
    }

    /**
     * @param canal the canal to set
     */
    public void setCanal(String canal) {
        this.canal = canal;
    }

    @Override
    public String resolConf() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la resolucion:");
        setResolucionConf(s.nextLine()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return getResolucionConf(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String colorConf() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca la configuracion de color:");
        setColorConf(s.nextLine()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return getColorConf();
    }

    @Override
    public String WifiConf() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la red wifi:");
        setNombreWifi(s.nextLine()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        System.out.println("Introduzca la contraseña del wifi");
        setPassWifi(s.nextLine()); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        return "done";
    }

    /**
     * @return the passWifi
     */
    public String getPassWifi() {
        return passWifi;
    }

    /**
     * @param passWifi the passWifi to set
     */
    public void setPassWifi(String passWifi) {
        this.passWifi = passWifi;
    }

    /**
     * @return the nombreWifi
     */
    public String getNombreWifi() {
        return nombreWifi;
    }

    /**
     * @param nombreWifi the nombreWifi to set
     */
    public void setNombreWifi(String nombreWifi) {
        this.nombreWifi = nombreWifi;
    }

    /**
     * @return the colorConf
     */
    public String getColorConf() {
        return colorConf;
    }

    /**
     * @param colorConf the colorConf to set
     */
    public void setColorConf(String colorConf) {
        this.colorConf = colorConf;
    }

    /**
     * @return the resolucionConf
     */
    public String getResolucionConf() {
        return resolucionConf;
    }

    /**
     * @param resolucionConf the resolucionConf to set
     */
    public void setResolucionConf(String resolucionConf) {
        this.resolucionConf = resolucionConf;
    }
    
}
