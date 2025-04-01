package com.mycompany.tp1prog2;

public class Gallina {
   
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
    }

    public void envejecer() {
        edad++;
    }

    public void mostrarEstado() {
        System.out.println("ID: " + idGallina + " | Edad: " + edad + " años | Huevos puestos: " + huevosPuestos);
    }

    

}
