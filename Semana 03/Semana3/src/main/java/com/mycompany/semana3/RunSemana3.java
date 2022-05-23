/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana3;

import java.util.Scanner;
/**
 *
 * @author saulp
 */
public class RunSemana3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        String marca;
        String modelo;
        String color;
        
        System.out.println("***** TELEVISOR *****");
        
        System.out.println("Introduce la marca: ");
        marca = s.nextLine();
        
        System.out.println("Introduce el modelo: ");
        modelo = s.nextLine();
        
        System.out.println("Introduce el color: ");
        color = s.nextLine();
        
        Television televisor = new Television();
        televisor.setMarca(marca);
        televisor.setModelo(modelo);
        televisor.setColor(color);
        
        System.out.println();
        System.out.println("Propiedades del Televisor");
        System.out.println("Marca: " + televisor.getMarca());
        System.out.println("Modelo: " + televisor.getModelo());
        System.out.println("Color: " + televisor.getColor());
        System.out.println();
        
        televisor.encender();
        System.out.println();
        System.out.println();
        
        System.out.println("Introduzca el canal:");
        televisor.setCanal(s.nextLine());
        System.out.println("Introduzca el volumen:");
        televisor.setVolumen(s.nextLine());
        System.out.println("Canal: " + televisor.getCanal());
        System.out.println("Volumen: " + televisor.getVolumen());
        System.out.println();
        System.out.println(televisor.apagar());
        
        System.out.println();
        System.out.println();
        System.out.println("***** CALCULADORA *****");
        
        System.out.println("Introduce la marca: ");
        marca = s.nextLine();
        
        System.out.println("Introduce el modelo: ");
        modelo = s.nextLine();
        
        System.out.println("Introduce el color: ");
        color = s.nextLine();
        
        Calculadora calculadora = new Calculadora();
        calculadora.setMarca(marca);
        calculadora.setModelo(modelo);
        calculadora.setColor(color);
        System.out.println();
        
        System.out.println("Propiedades de calculadora");
        System.out.println("Marca: " + calculadora.getMarca());
        System.out.println("Modelo: " + calculadora.getModelo());
        System.out.println("Color: " + calculadora.getColor());
        System.out.println();
        
        calculadora.encender();
        System.out.println();
        System.out.println();
        
        System.out.println("Operaciones"); 
        System.out.println("Ingrese dos números");
        float a = s.nextFloat();  
        float b = s.nextFloat(); 
        System.out.println();
                
        
        System.out.println("Suma: " +a+ " + " +b+" = " + calculadora.suma(a, b));
        System.out.println("Resta: " +a+ " - " +b+" = "+ calculadora.resta(a, b));
        System.out.println("Multiplicación: " +a+ " * " +b+" = " + calculadora.multiplicacion(a,b));
        System.out.println("División: " +a+ " / " +b+" = "+ calculadora.division(a,b));
        System.out.println();
        
        System.out.println(calculadora.apagar());
    }
    
}
