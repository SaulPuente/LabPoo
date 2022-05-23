/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana8;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author saulp
 */
public class RunSemana8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int i, j, k;
        String startString;
        int beginIndex;
        int endIndex;
        String newString;
        char[] characters = new char[5];
        String[] strings = new String[5];
        char c;
        int n;
        
        do { 
            System.out.println("");
            System.out.println("Seleccione una de las siguientes opciones");
            System.out.println("    1) Obtener substring de una cadena de carácteres");
            System.out.println("    2) Determinar si los elementos de un array son número, letra o espacio");
            System.out.println("    3) Convertir elementos de un array a minúsculas o mayúsculas");
            System.out.println("    4) Determinar cuantos strings comienzan con un caracter dado");
            System.out.println("    5) Determinar cuantos strings terminan con un caracter dado");
            System.out.println("    6) Salir");
            System.out.println("");
            i = s1.nextInt();
            
            switch (i){
                case 1:{
                    System.out.println("Ingrese un string: ");
                    startString = s.nextLine();
                    System.out.println("Ingrese el índice inicial: ");
                    beginIndex = s1.nextInt();
                    System.out.println("Ingrese el índice final: ");
                    endIndex = s1.nextInt();
                    System.out.println("El substring resultante es: ");
                    newString = startString.substring(beginIndex, endIndex);
                    System.out.println(newString);
                    break;
                }
                case 2:{
                    System.out.println("Ingrese 5 caracteres");
                    characters = s.nextLine().toCharArray();
                    
                    for (j = 0; j < 5; j++) {
                        if (Character.isLetter(characters[j])){ 
                            System.out.println("'" + characters[j] + "'" + " es una letra.");
                        } else if (Character.isDigit(characters[j])){
                            System.out.println("'" + characters[j] + "'" + " es un número");
                        } else if (Character.isWhitespace(characters[j])) {
                            System.out.println("'" + characters[j] + "'" + " es un espacio");
                        } else{
                            System.out.println("'" + characters[j] + "'" + " es otro tipo de caracter");
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Ingrese 5 caracteres");
                    characters = s.nextLine().toCharArray();
                    System.out.println("Ingrese 1 para convertir a mayúsculas o 2 para convertir a minúsculas");
                    k = s1.nextInt();
                    switch (k) {
                        case 1:
                            for (j = 0; j < 5; j++) {
                                System.out.println(characters[j] + " -> " +Character.toUpperCase(characters[j]));
                            }
                            break;
                        case 2:
                            for (j = 0; j < 5; j++) {
                                System.out.println(characters[j] + " -> " +Character.toLowerCase(characters[j]));
                            }
                            break;
                        default:
                            System.out.println("Ingrese una de las opciones disponibles");
                            break;
                    }
                    break;
                }
                case 4:{
                    n = 0;
                    System.out.println("Ingrese 5 cadenas caracteres");
                    for (j = 0; j < 5; j++) {
                        System.out.println("String " + (j + 1) + ": ");
                        strings[j] = s.nextLine();
                    }
                    System.out.println("Ingrese 1 caracter");
                    c = s.next().charAt(0); 
                    for (j = 0; j < 5; j++) {
                        if (c == strings[j].charAt(0)){
                            n++;
                        }
                    }
                    System.out.println(n + " strings comienzan con el caracter " + c);
                    break;
                }
                case 5:{
                    n = 0;
                    System.out.println("Ingrese 5 cadenas de caracteres");
                    for (j = 0; j < 5; j++) {
                        System.out.println("String " + (j + 1) + ": ");
                        strings[j] = s.nextLine();
                    }
                    System.out.println("Ingrese 1 caracter");
                    c = s.next().charAt(0); 
                    for (j = 0; j < 5; j++) {
                        if (c == strings[j].charAt(strings[j].length() - 1)){
                            n++;
                        }
                    }
                    System.out.println(n + " strings terminan con el caracter " + c);
                    break;
                }
                case 6:{
                    System.out.println("Hasta luego :)");
                }
            }
            
            System.out.println("");
            System.out.println("Presiona Enter para continuar.");
            try{System.in.read();}
            catch(Exception e){}
            System.out.println("");
            
        } while (i != 6);
    }
    
}
