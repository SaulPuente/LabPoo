/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.semana10;

/**
 *
 * @author saulp
 */
public abstract class Empleado {
    private String nombre;
    private String apellidos;
    private String DNI;
    private String direccion;
    private float salario;
    private int telefono;
    private Empleado supervisor;
    private float incremento = 0;
    
    public void incrementarSalario(){
        this.setSalario(this.getSalario() * (1 + this.getIncremento()));
    }
    public abstract String cambiarSupervisor();
    public abstract void datosPrincipales();
    
    public Empleado(String nombre, String apellidos, String DNI, String direccion, int telefono, float salario){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * @param DNI the DNI to set
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the salario
     */
    public float getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(float salario) {
        this.salario = salario;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the supervisor
     */
    public Empleado getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }
    
    public void datosPersonales(){
        System.out.println("Datos Personales\n");
        
        if (this instanceof Secretario){
            System.out.println("Puesto: Secretario"); //this.getClass().toString());
        } else if (this instanceof Vendedor){
            System.out.println("Puesto: Vendedor"); //this.getClass().toString());
        } else if (this instanceof JefeDeZona){
            System.out.println("Puesto: Jefe de Zona"); //this.getClass().toString());
        }
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("DNI: " + this.getDNI());
        System.out.println("Dirección: " + this.getDireccion());
        System.out.println("Teléfono: " + this.getTelefono());
        System.out.println("Salario: " + this.getSalario());
    }

    /**
     * @return the incremento
     */
    public float getIncremento() {
        return incremento;
    }

    /**
     * @param incremento the incremento to set
     */
    public void setIncremento(float incremento) {
        this.incremento = incremento;
    }
    
}