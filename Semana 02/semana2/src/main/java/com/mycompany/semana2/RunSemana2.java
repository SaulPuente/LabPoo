/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana2;

import java.util.Scanner;
/**
 *
 * @author saulp
 */
public class RunSemana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Introduce la marca: ");
        String marca = s.nextLine();
        
        System.out.println("Introduce el modelo: ");
        String modelo = s.nextLine();
        
        CalculadoraBasica casio = new CalculadoraBasica();
        casio.setMarca(marca);
        casio.setModelo(modelo);
        System.out.println();
        
        System.out.println("Ingrese dos números");
        float a = s.nextFloat();  
        float b = s.nextFloat(); 
        System.out.println();
                
        System.out.println("Propiedades de calculadora");
        System.out.println("Marca: " + casio.getMarca());
        System.out.println("Modelo: " + casio.getModelo());
        
        System.out.println("Operaciones"); 
        System.out.println("Suma: " +a+ " + " +b+" = " + casio.suma(a, b));
        System.out.println("Resta: " +a+ " - " +b+" = "+ casio.resta(a, b));
        System.out.println("Multiplicación: " +a+ " * " +b+" = " + casio.multiplicacion(a,b));
        System.out.println("División: " +a+ " / " +b+" = "+ casio.division(a,b));
    }
    
}
