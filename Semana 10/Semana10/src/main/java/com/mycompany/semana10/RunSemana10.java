/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.semana10;

import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author saulp
 */
public class RunSemana10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int op, op1;
        
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        
        String nombre; 
        String apellidos; 
        String DNI; 
        String direccion; 
        int telefono; 
        float salario;
        String matricula;
        String marca;
        String modelo;
        int celular;
        String area;
        int porcentaje;
        String cliente;
        String despacho;
        int fax;
        int i;
        
        do {
            System.out.println("");
            System.out.println("Seleccione una de las siguientes opciones");
            System.out.println("    1) Crear nuevo Secretario");
            System.out.println("    2) Crear nuevo Vendedor");
            System.out.println("    3) Crear nuevo Jefe de Zona");
            System.out.println("    4) Mostrar Empleados");
            System.out.println("    5) Modificar Empleado");
            System.out.println("    6) Salir");
            System.out.println("");
            
            op = s1.nextInt();
            switch (op) 
            {
                case 1:  
                    System.out.println("\n\nCrear nuevo Secretario\n");
                    System.out.println("\nDatos Personales\n");
                    System.out.println("Ingrese los siguientes datos");
                    System.out.println("Nombre: ");
                    nombre = s.nextLine();
                    System.out.println("Apellidos: ");
                    apellidos = s.nextLine();
                    System.out.println("DNI: ");
                    DNI = s.nextLine();
                    System.out.println("Dirección: ");
                    direccion = s.nextLine();
                    System.out.println("Teléfono: ");
                    telefono = s1.nextInt();
                    System.out.println("Salario: ");
                    salario = s1.nextFloat();
                    
                    System.out.println("Despacho: ");
                    despacho = s.nextLine();
                    System.out.println("Número de fax: ");
                    fax = s1.nextInt();
                    
                    empleados.add(new Secretario(nombre, apellidos, DNI, direccion, telefono, salario, despacho, fax));
                    break;
                case 2:  
                    System.out.println("\n\nCrear nuevo Vendedor\n");
                    System.out.println("\nDatos Personales\n");
                    System.out.println("Ingrese los siguientes datos");
                    System.out.println("Nombre: ");
                    nombre = s.nextLine();
                    System.out.println("Apellidos: ");
                    apellidos = s.nextLine();
                    System.out.println("DNI: ");
                    DNI = s.nextLine();
                    System.out.println("Dirección: ");
                    direccion = s.nextLine();
                    System.out.println("Teléfono: ");
                    telefono = s1.nextInt();
                    System.out.println("Salario: ");
                    salario = s1.nextFloat();
                    
                    System.out.println("Matrícula: "); 
                    matricula = s.nextLine();
                    System.out.println("Marca: ");
                    marca = s.nextLine();
                    System.out.println("Modelo: ");
                    modelo = s.nextLine();
                    System.out.println("Celular: ");
                    celular = s1.nextInt();
                    System.out.println("Área: ");
                    area = s.nextLine();
                    System.out.println("Porcentaje: ");
                    porcentaje = s1.nextInt();
                    
                    empleados.add(new Vendedor(nombre, apellidos, DNI, direccion, telefono, salario, matricula, marca, modelo, celular, area, porcentaje));
                    break;
                case 3:  
                    System.out.println("\n\nCrear nuevo Jefe de Zona\n");
                    System.out.println("\nDatos Personales\n");
                    System.out.println("Ingrese los siguientes datos");
                    System.out.println("Nombre: ");
                    nombre = s.nextLine();
                    System.out.println("Apellidos: ");
                    apellidos = s.nextLine();
                    System.out.println("DNI: ");
                    DNI = s.nextLine();
                    System.out.println("Dirección: ");
                    direccion = s.nextLine();
                    System.out.println("Teléfono: ");
                    telefono = s1.nextInt();
                    System.out.println("Salario: ");
                    salario = s1.nextFloat();
                    
                    System.out.println("Matrícula: "); 
                    matricula = s.nextLine();
                    System.out.println("Marca: ");
                    marca = s.nextLine();
                    System.out.println("Modelo: ");
                    modelo = s.nextLine();
                    System.out.println("Despacho: ");
                    despacho = s.nextLine();
                    
                    empleados.add(new JefeDeZona(nombre, apellidos, DNI, direccion, telefono, salario, matricula, marca, modelo, despacho));
                    break;
                case 4:
                    System.out.println("\n\nEmpleados registrados: \n");
                    i = 0;
                    for (Empleado emp: empleados){
                        System.out.println("\nID: " + i++);
                        emp.datosPersonales();
                        emp.datosPrincipales();
                    }
                    break;
                case 5:
                    System.out.println("\n\nModificar Empleado: \n");
                    System.out.println("Ingrese el ID del empleado: ");
                    i = s1.nextInt();
                    if (empleados.get(i) instanceof Secretario){
                        System.out.println("Secretario");
                        
                        System.out.println("");
                        System.out.println("Seleccione una de las siguientes opciones");
                        System.out.println("    1) Incrementar Salario");
                        System.out.println("    2) Cambiar Supervisor");
                        System.out.println("    3) Salir");
                        System.out.println("");
                        
                        op1 = s1.nextInt();
                        
                        switch (op1){
                            case 1:
                                Empleado emp = empleados.get(i);
                                System.out.println("Salario actual: " + emp.getSalario());
                                emp.incrementarSalario();
                                System.out.println("Nuevo salario: " + emp.getSalario());
                                break;
                            case 2:
                                break;
                            case 3:
                                System.out.println("Hasta luego");
                                break;
                            default:
                                System.out.println("Seleccione una opción válida");
                                break;
                        }
                    } else if (empleados.get(i) instanceof Vendedor){
                        System.out.println("Vendedor");
                        
                        System.out.println("");
                        System.out.println("Seleccione una de las siguientes opciones");
                        System.out.println("    1) Incrementar Salario");
                        System.out.println("    2) Cambiar Supervisor");
                        System.out.println("    3) Dar de alta un nuevo Cliente");
                        System.out.println("    4) Dar de baja un Cliente");
                        System.out.println("    5) Cambiar de Coche");
                        System.out.println("    6) Salir");
                        System.out.println("");
                        
                        op1 = s1.nextInt();
                        
                        switch (op1){
                            case 1:
                                Empleado emp = empleados.get(i);
                                System.out.println("Salario actual: " + emp.getSalario());
                                emp.incrementarSalario();
                                System.out.println("Nuevo salario: " + emp.getSalario());
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                System.out.println("Hasta luego");
                                break;
                            default:
                                System.out.println("Seleccione una opción válida");
                                break;
                        }
                    } else if (empleados.get(i) instanceof JefeDeZona){
                        System.out.println("Jefe de Zona");
                        
                        System.out.println("");
                        System.out.println("Seleccione una de las siguientes opciones");
                        System.out.println("    1) Incrementar Salario");
                        System.out.println("    2) Cambiar Supervisor");
                        System.out.println("    3) Dar de alta un nuevo Vendedor");
                        System.out.println("    4) Dar de baja un Vendedor");
                        System.out.println("    5) Cambiar de Coche");
                        System.out.println("    6) Cambiar de Secretario");
                        System.out.println("    7) Salir");
                        System.out.println("");
                        
                        op1 = s1.nextInt();
                        
                        switch (op1){
                            case 1:
                                Empleado emp = empleados.get(i);
                                System.out.println("Salario actual: " + emp.getSalario());
                                emp.incrementarSalario();
                                System.out.println("Nuevo salario: " + emp.getSalario());
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                            case 7:
                                System.out.println("Hasta luego");
                                break;
                            default:
                                System.out.println("Seleccione una opción válida");
                                break;
                        }
                    } else {
                        System.out.println("El empleado no está registrado");
                    }
                    break;
                case 6:  
                    System.out.println("\n\nHasta luego\n\n");
                    break;
                default:  
                    System.out.println("\n\nSeleccione una opción válida\n\n");
                    break;
            }
        } while(op != 6);
        
    }
    
}
