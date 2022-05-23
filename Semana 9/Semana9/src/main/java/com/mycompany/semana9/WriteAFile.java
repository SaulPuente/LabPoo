/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana9;

/**
 *
 * @author saulp
 */
import java.io.*;
import java.util.Scanner;

public class WriteAFile {
    
    public WriteAFile(String fileN){
        this.leerArchivo(fileN);
        this.escribirArchivo(fileN);
        this.imprimir(fileN);
    }
    
    private void leerArchivo(String pathFile){
        FileReader fr;
        try
        {
            //Abro el stream, el fichero debe existir
            fr=new FileReader(pathFile);
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            
            System.out.println("\n\nEl archivo contiene el siguiente texto:\n");
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
            //Cerramos el stream
             fr.close();
        }
        catch(IOException ex) 
                {
            System.out.println(ex.getMessage());
        }
        finally
        {
       
        }
    }
    
    private void escribirArchivo(String pathFile){
        FileWriter fw;
        Scanner s = new Scanner(System.in);
        try
        {
            fw=new FileWriter(pathFile);
            System.out.println("\n\nIngrese el texto a escribir en el archivo:\n");
            fw.write(s.nextLine());
            fw.write("\n");
            fw.write(s.nextLine());
            
            //Cierro el stream
            fw.close(); 
        }
        catch(IOException ex) 
                {
            System.out.println(ex.getMessage());
        }
        finally
        {
       
        }
    }
    
    private void imprimir(String pathFile){
        FileReader fr;
        try
        {
            //Abro el stream, el fichero debe existir
            fr=new FileReader(pathFile);
            //Leemos el fichero y lo mostramos por pantalla
            int valor=fr.read();
            
            System.out.println("\n\nEl nuevo texto del archivo es el siguiente:\n");
            while(valor!=-1){
                System.out.print((char)valor);
                valor=fr.read();
            }
            //Cerramos el stream
             fr.close();
        }
        catch(IOException ex) 
                {
            System.out.println(ex.getMessage());
        }
        finally
        {
       
        }
    }
}
