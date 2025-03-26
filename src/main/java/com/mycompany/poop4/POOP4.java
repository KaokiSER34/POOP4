/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 * Clase principal que contiene el método main para ejecutar ejemplos
 * de las clases Profesor, Alumno, Perro, TrianguloRectangulo y Coche.
 * @author Issmael
 */
public class POOP4 {

    /**
     * Método principal (entry point) de la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // ================================
        // Ejemplo de Profesor
        // ================================
        Profesor profesor = new Profesor("Alicia Pineda", true, true, 2);
        System.out.println("=== Ejemplo de Profesor ===");
        System.out.println("Nombre del profesor: " + profesor.nombre);
        profesor.dirigir();
        profesor.crearHabilidad();
        profesor.crearExamenes();
        System.out.println();

        // ================================
        // Ejemplo de Alumno
        // ================================
        Alumno estudiante = new Alumno(31304140, "Ingenieria", 6, 9.0, "Diether");
        System.out.println("=== Ejemplo de Alumno ===");
        System.out.println("Nombre del alumno: " + estudiante.nombre);
        estudiante.hacerTarea();
        estudiante.hacerExamenes();
        estudiante.tomarApuntes();
        System.out.println();

        // ================================
        // Ejemplo de Perro
        // ================================
        Perro mascota = new Perro("Kirsha", "Cocker", "negro", "cafes", 3);
        System.out.println("=== Ejemplo de Perro ===");
        System.out.println("Nombre del perro: " + mascota.nombre);
        mascota.comer(true);
        mascota.domir(false);
        mascota.jugar(true);
        System.out.println();

        // ================================
        // Ejemplo de TrianguloRectangulo
        // ================================
        TrianguloRectangulo triangulo = new TrianguloRectangulo(3, 4);
        System.out.println("=== Ejemplo de TrianguloRectangulo ===");
        System.out.println("Base: " + triangulo.base);
        System.out.println("Altura: " + triangulo.altura);
        triangulo.calcularHipotenusa();
        triangulo.calcularArea();
        System.out.println();

        // ================================
        // Ejemplo de Coche
        // ================================
        Coche miCoche = new Coche("Toyota", "Corolla", 2022, "Blanco");
        System.out.println("=== Ejemplo de Coche ===");
        System.out.println("Marca: " + miCoche.marca);
        System.out.println("Modelo: " + miCoche.modelo);
        System.out.println("Año: " + miCoche.anio);
        System.out.println("Color: " + miCoche.color);
        miCoche.encender(true);
        miCoche.acelerar(60);
        miCoche.frenar(true);
    }
}
