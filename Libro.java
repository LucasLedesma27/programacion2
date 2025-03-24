package com.mycompany.tp1prog2;

public class Libro {
    
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int nuevoAnio) {
        int anioActual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        if (nuevoAnio >= 1900 && nuevoAnio <= anioActual) {
            anioPublicacion = nuevoAnio;
        } else {
            System.out.println("Anio invalido");
        }
    }

   
}


