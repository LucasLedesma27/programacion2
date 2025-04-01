

package com.mycompany.tp1prog2;


public class Tp1prog2 {

    public static void main(String[] args) {
        //  Kata 1: 
        Estudiante estudiante = new Estudiante("Lucas", "Ledesma", "Programacion2", 7.0);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(3); 
        estudiante.bajarCalificacion(1); 
        estudiante.mostrarInfo();

        //  Kata 2: 
        Mascota mascota = new Mascota("Orion", "Perro", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios(); 
        mascota.mostrarInfo();

        //  Kata 3:
        Libro libro = new Libro("El Quijote", "Miguel de Cervantes", 1605);
        libro.setAnioPublicacion(2020);  
        System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor() + ", Año: " + libro.getAnioPublicacion());

        //  Kata 4:
        Gallina gallina1 = new Gallina(1, 2);
        Gallina gallina2 = new Gallina(2, 3);
        gallina1.ponerHuevo();
        gallina2.ponerHuevo();
        gallina1.envejecer();
        gallina2.envejecer();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        // Kata 5:
        NaveEspacial nave = new NaveEspacial("Explorer", 50);
        nave.avanzar(60);  // tendria que fallar por falta de combustible
        nave.recargarCombustible(40); 
        nave.avanzar(60);  // Ahora debería funcionar
        nave.mostrarEstado();
    }
}


