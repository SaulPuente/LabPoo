/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana6;

import java.util.Scanner;
/**
 *
 * @author saulp
 */
public class RunSemana6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        String marca;
        String modelo;
        String color;
        
        System.out.println("***** TELEVISORES *****");
        System.out.println();
        Television[] tvs = new Television[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Televisor " + (i+1));
            tvs[i] = new Television();
       
            System.out.println("Introduce la marca:");
            marca = s.nextLine();
        
            System.out.println("Introduce el modelo: ");
            modelo = s.nextLine();
        
            System.out.println("Introduce el color: ");
            color = s.nextLine();
        
            tvs[i].setMarca(marca);
            tvs[i].setModelo(modelo);
            tvs[i].setColor(color);
            tvs[i].colorConf();
            tvs[i].resolConf();
            tvs[i].WifiConf();
        
            System.out.println();
        }
        
        System.out.println();
        for (Television element : tvs){
            System.out.println("Propiedades del Televisor");
            System.out.println("Marca: " + element.getMarca());
            System.out.println("Modelo: " + element.getModelo());
            System.out.println("Color: " + element.getColor());
            System.out.println("Resolución: " + element.getResolucionConf());
            System.out.println("Configuración de color: " + element.getColorConf());
            System.out.println("Nombre de la red de wifi: " + element.getNombreWifi());
            System.out.println("Contraseña del wifi: " + element.getPassWifi());
            System.out.println();
        
            element.encender();
            System.out.println();
            System.out.println();
        
            System.out.println("Configuración del televisor");
            System.out.println("Introduzca el canal:");
            element.setCanal(s.nextLine());
            System.out.println("Introduzca el volumen:");
            element.setVolumen(s.nextLine());
            element.colorConf();
            element.resolConf();
            element.WifiConf();
        
            System.out.println();
            System.out.println();
            System.out.println("Canal: " + element.getCanal());
            System.out.println("Volumen: " + element.getVolumen());
            System.out.println("Resolución: " + element.getResolucionConf());
            System.out.println("Configuración de color: " + element.getColorConf());
            System.out.println("Nombre de la red de wifi: " + element.getNombreWifi());
            System.out.println("Contraseña del wifi: " + element.getPassWifi());
            System.out.println();
            System.out.println(element.apagar());
            
            System.out.println();
            System.out.println();
        }
        
        System.out.println();
        
        
        
        System.out.println("***** CALCULADORAS BÁSICAS*****");
        System.out.println();
        Calculadora[] calculadoras = new Calculadora[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Calculadora Básica " + (i+1));
            calculadoras[i] = new Calculadora();
       
            System.out.println("Introduce la marca: ");
            marca = s.nextLine();
        
            System.out.println("Introduce el modelo: ");
            modelo = s.nextLine();
        
            System.out.println("Introduce el color: ");
            color = s.nextLine();
        
            calculadoras[i].setMarca(marca);
            calculadoras[i].setModelo(modelo);
            calculadoras[i].setColor(color);
        
            System.out.println();
            
        }
        
        float a;  
        float b; 
            
        System.out.println();
        for (Calculadora element : calculadoras){
            System.out.println("Propiedades de la calculadora");
            System.out.println("Marca: " + element.getMarca());
            System.out.println("Modelo: " + element.getModelo());
            System.out.println("Color: " + element.getColor());
            System.out.println();
        
            element.encender();
            System.out.println();
            System.out.println();
        
            System.out.println("Operaciones"); 
            System.out.println("Ingrese dos números");
            a = s.nextFloat();  
            b = s.nextFloat(); 
            System.out.println();
                
        
            System.out.println("Suma: " +a+ " + " +b+" = " + element.suma(a, b));
            System.out.println("Resta: " +a+ " - " +b+" = "+ element.resta(a, b));
            System.out.println("Multiplicación: " +a+ " * " +b+" = " + element.multiplicacion(a,b));
            System.out.println("División: " +a+ " / " +b+" = "+ element.division(a,b));
            System.out.println();
        
            System.out.println(element.apagar());
        
            System.out.println();
            System.out.println();
        }
        
        System.out.println();
        System.out.println("***** CALCULADORAS CIENTIFICAS*****");
        
        System.out.println();
        CalculadoraCientifica[] calculadorasC = new CalculadoraCientifica[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Calculadora Cientifica " + (i+1));
            calculadorasC[i] = new CalculadoraCientifica();
       
            System.out.println("Introduce la marca: ");
            marca = s.nextLine();
        
            System.out.println("Introduce el modelo: ");
            modelo = s.nextLine();
        
            System.out.println("Introduce el color: ");
            color = s.nextLine();
        
            calculadorasC[i].setMarca(marca);
            calculadorasC[i].setModelo(modelo);
            calculadorasC[i].setColor(color);
        
            System.out.println();
        }
        
        System.out.println();
        for (CalculadoraCientifica element : calculadorasC){
            System.out.println("Propiedades de la calculadora cientifica");
            System.out.println("Marca: " + element.getMarca());
            System.out.println("Modelo: " + element.getModelo());
            System.out.println("Color: " + element.getColor());
            System.out.println();
        
            element.encender();
            System.out.println();
            System.out.println();
        
            System.out.println("Operaciones"); 
            System.out.println("Ingrese dos números");
            a = s.nextFloat();  
            b = s.nextFloat(); 
            System.out.println();
                
        
            System.out.println("Suma: " +a+ " + " +b+" = " + element.suma(a, b));
            System.out.println("Resta: " +a+ " - " +b+" = "+ element.resta(a, b));
            System.out.println("Multiplicación: " +a+ " * " +b+" = " + element.multiplicacion(a,b));
            System.out.println("División: " +a+ " / " +b+" = "+ element.division(a,b));
            System.out.println("Raiz: " +a+ " ^1/2  = "+ element.raiz(a));
            System.out.println("Porcentaje: " +b+ "% de " +a+" = "+ element.porcentaje(a,b));
            System.out.println("Seno: sen(" +a+ ") = "+ element.seno(a));
            System.out.println("Coseno: cos(" +a+ ") = "+ element.coseno(a));
            System.out.println();
        
            System.out.println(element.apagar());
            
            System.out.println();
            System.out.println();
        }
        
    }
    
}
