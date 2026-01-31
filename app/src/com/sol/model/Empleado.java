package com.sol.model;

public class Empleado {

    private static int contadorId = 0;
    private int id;
    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.id = contadorId ++;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
