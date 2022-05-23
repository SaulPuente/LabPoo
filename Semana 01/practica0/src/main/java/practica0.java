/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author saulp
 */

import java.util.Scanner;  // Import the Scanner class

public class practica0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingrese su nombre");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Hola " + userName + "!"); //agregar escaner// Output user input
    }
    
}
