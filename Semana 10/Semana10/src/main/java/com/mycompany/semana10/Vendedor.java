/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana10;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author saulp
 */
public class Vendedor extends Empleado {
    
    private String matricula;
    private String marca;
    private String modelo;
    private int celular;
    private String area;
    private int porcentaje;
    private ArrayList<String> clientes = new ArrayList<String>();
    private int cClientes = 0;
    
    
    public Vendedor(String nombre, String apellidos, String DNI, String direccion, int telefono, float salario,
            String matricula, String marca, String modelo, int celular, String area, int porcentaje) {
        super(nombre, apellidos, DNI, direccion, telefono, salario);
        this.setIncremento((float) 0.1);
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.celular = celular;
        this.area = area;
        this.porcentaje = porcentaje;
        
        char op;
        
        Scanner s = new Scanner(System.in);
        String cliente;
        System.out.println("Ingresar clientes");
        do{
            System.out.println("Nombre del cliente: ");
            cliente = s.nextLine();
            clientes.add(cliente);
            System.out.println("¿Ingresar un nuevo cliente? (Y/N)");
            op = s.next().charAt(0);  
        }while(op != 'N');
    }

    @Override
    public String cambiarSupervisor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
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
     * @return the celular
     */
    public int getCelular() {
        return celular;
    }

    /**
     * @param celular the celular to set
     */
    public void setCelular(int celular) {
        this.celular = celular;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * @return the porcentaje
     */
    public int getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param porcentaje the porcentaje to set
     */
    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    /**
     * @return the clientes
     */
    public ArrayList<String> getClientes() {
        return clientes;
    }

    /**
     * @param clientes the clientes to set
     */
    public void setClientes(ArrayList<String> clientes) {
        this.clientes = clientes;
    }

    @Override
    public void datosPrincipales() {
        System.out.println("\nDatos Principales\n");
        
        System.out.println("Celular: " +  this.getCelular());
        System.out.println("Área de Venta: " + this.getArea());
        System.out.println("Porcentaje de Venta: " + this.getPorcentaje());
        
        System.out.println("\nDatos del auto\n");
        System.out.println("Matrícula: " + this.getMatricula());
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        
        System.out.println("\nClientes\n");
        for (String c: this.clientes){
            System.out.println(c);
        }
    }
}
