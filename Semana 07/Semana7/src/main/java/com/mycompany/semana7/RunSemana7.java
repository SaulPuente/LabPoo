/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saulp
 */
public class RunSemana7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Transporte> tr = new ArrayList<Transporte>();
        tr.add(new Automovil(100,50));
        tr.add(new Avion(70,120));
        tr.add(new Autobus(200,80));
        tr.add(new Barco(120,100));
        tr.add(new Helicoptero(40,90));
        
        Scanner s = new Scanner(System.in);
        
        String marca;
        String modelo;
        int gasolina;
        
        for (Transporte tra: tr){
            System.out.println();
            System.out.println(tra.getClass().toString());
            System.out.println();
            tra.encender(tra.getGas());
            tra.acelerar();
            System.out.println();
            
            System.out.println("Introduce la marca: ");
            marca = s.nextLine();
        
            System.out.println("Introduce el modelo: ");
            modelo = s.nextLine();
        
            tra.setMarca(marca);
            tra.setModelo(modelo);
        
            System.out.println();
            System.out.println("Caracteristicas del auto ");
            System.out.println("Marca: " + tra.getMarca());
            System.out.println("Modelo: " + tra.getModelo());
            System.out.println(tra.avanzar(tra.getGas()));
            System.out.println(tra.reversa(tra.getGas()));
                
            if (tra instanceof Avion){
                Avion avion = (Avion) tra;
                System.out.println(avion.encenderLuces());
                System.out.println(avion.apagarLuces());
                System.out.println(avion.volar());
                System.out.println(avion.volar());
                System.out.println(avion.frenar());
            }
            
            if (tra instanceof Avion){
                Avion avion = (Avion) tra;
                System.out.println(avion.encenderLuces());
                System.out.println(avion.apagarLuces());
                System.out.println(avion.volar());
                System.out.println(avion.volar());
                System.out.println(avion.frenar());
            }
            if (tra instanceof Automovil){
                Automovil auto = (Automovil) tra;
                System.out.println(auto.encenderLuces());
                System.out.println(auto.apagarLuces());
                System.out.println(auto.frenar());
            }
            if (tra instanceof Helicoptero){
                Helicoptero helip = (Helicoptero) tra;
                System.out.println(helip.encenderLuces());
                System.out.println(helip.apagarLuces());
                System.out.println(helip.volar());
                System.out.println(helip.volar());
                System.out.println(helip.frenar());
            }
            if (tra instanceof Autobus){
                Autobus bus = (Autobus) tra;
                System.out.println(bus.encenderLuces());
                System.out.println(bus.apagarLuces());
                System.out.println(bus.frenar());
            }
            
            if (tra instanceof Barco){
                Barco ship = (Barco) tra;
                System.out.println(ship.encenderLuces());
                System.out.println(ship.apagarLuces());
                System.out.println(ship.frenar());
            }
            
            System.out.println(tra.avanzar(tra.getGas()));
            System.out.println(tra.apagar(tra.getGas()));
            System.out.println();
        }
    }
    
}
