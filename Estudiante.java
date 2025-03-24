package com.mycompany.tp1prog2;

public class Estudiante {
 
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + apellido + ", " + nombre + " | Curso: " + curso + " | Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (calificacion + puntos <= 10) {
            calificacion += puntos;
        } else {
            calificacion = 10;
        }
    }

    public void bajarCalificacion(double puntos) {
        if (calificacion - puntos >= 0) {
            calificacion -= puntos;
        } else {
            calificacion = 0;
        }
    }

    
}

    

