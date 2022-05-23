/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana5;

/**
 *
 * @author saulp
 */

import java.util.Scanner;

public class RunSemana5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        String marca;
        String modelo;
        Double gasolina;
        
        System.out.println("*** AUTO Clase Hija ***");
        Automovil auto = new Automovil();
        
        System.out.println("Introduce la marca: ");
        marca = s.nextLine();
        
        System.out.println("Introduce el modelo: ");
        modelo = s.nextLine();
        
        System.out.println("Introduce la gasolina: ");
        gasolina = s.nextDouble();
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setGasolina(gasolina);
        
        System.out.println();
        System.out.println("Caracteristicas del auto ");
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modelo: " + auto.getModelo());
        
        System.out.println(auto.encender(auto.getGasolina()));
        System.out.println(auto.avanzar(auto.getGasolina()));
        System.out.println(auto.reversa(auto.getGasolina()));
        System.out.println(auto.encenderLuces());
        System.out.println(auto.apagarLuces());
        System.out.println(auto.avanzar(auto.getGasolina()));
        System.out.println(auto.frenar());
        System.out.println(auto.apagar(auto.getGasolina()));
        
        System.out.println();
        Transporte autoGuia = new Automovil();
        System.out.println("*** AUTO Clase Padre ***");
        
        System.out.println("Introduce la marca: ");
        marca = s.nextLine();
        
        System.out.println("Introduce el modelo: ");
        modelo = s.nextLine();
        
        System.out.println("Introduce la gasolina: ");
        gasolina = s.nextDouble();
        
        autoGuia.setMarca(marca);
        autoGuia.setModelo(modelo);
        autoGuia.setGasolina(gasolina);
        
        System.out.println();
        System.out.println("Caracteristicas del auto ");
        System.out.println("Marca: " + autoGuia.getMarca());
        System.out.println("Modelo: " + autoGuia.getModelo());
        
        System.out.println(autoGuia.encender(autoGuia.getGasolina()));
        System.out.println(autoGuia.apagar(autoGuia.getGasolina()));
        
        System.out.println();
        ISistemaElectrico autoF = new Automovil();
        System.out.println("*** AUTO Interfaz ***");
        
        System.out.println(autoF.encenderLuces());
        System.out.println(autoF.apagarLuces());
        
        System.out.println();
        System.out.println("*** AVION Clase Hija ***");
        Avion avion = new Avion();
        
        System.out.println("Introduce la marca: ");
        marca = s.nextLine();
        
        System.out.println("Introduce el modelo: ");
        modelo = s.nextLine();
        
        System.out.println("Introduce la gasolina: ");
        gasolina = s.nextDouble();
        
        avion.setMarca(marca);
        avion.setModelo(modelo);
        avion.setGasolina(gasolina);
        
        System.out.println();
        System.out.println("Caracteristicas del avion ");
        System.out.println("Marca: " + avion.getMarca());
        System.out.println("Modelo: " + avion.getModelo());
        
        System.out.println(avion.encender(avion.getGasolina()));
        System.out.println(avion.despegar());
        System.out.println(avion.volar());
        System.out.println(avion.encenderLuces());
        System.out.println(avion.apagarLuces());
        System.out.println(avion.volar());
        System.out.println(avion.frenar());
        System.out.println(avion.apagar(avion.getGasolina()));
        
        System.out.println();
        System.out.println("*** AVION Clase Padre ***");
        Transporte avionGuia = new Avion();
        
        System.out.println("Introduce la marca: ");
        marca = s.nextLine();
        
        System.out.println("Introduce el modelo: ");
        modelo = s.nextLine();
        
        System.out.println("Introduce la gasolina: ");
        gasolina = s.nextDouble();
        
        avionGuia.setMarca(marca);
        avionGuia.setModelo(modelo);
        avionGuia.setGasolina(gasolina);
        
        System.out.println();
        System.out.println("Caracteristicas del avion ");
        System.out.println("Marca: " + avionGuia.getMarca());
        System.out.println("Modelo: " + avionGuia.getModelo());
        
        System.out.println(avionGuia.encender(avion.getGasolina()));
        System.out.println(avionGuia.apagar(avion.getGasolina()));
        
        System.out.println();
        System.out.println("*** AVION Interfaz ***");
        IVolar avionF = new Avion();
        
        System.out.println();
        
        System.out.println(avionF.volar());
        System.out.println(avionF.volar());
    }
    
}
