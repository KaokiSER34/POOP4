/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 * La clase Profesor representa a un maestro con ciertas características
 * como conocimiento, empatía e inteligencia, y acciones como exponer, 
 * dirigir, crear habilidades y evaluar.
 * @author Issmael
 */
public class Profesor {
    /**
     * Nombre del profesor.
     */
    String nombre;

    /**
     * Indica si el profesor posee cierto nivel de conocimiento.
     */
    boolean conocimiento;

    /**
     * Indica si el profesor es empático.
     */
    boolean empatia;

    /**
     * Un valor entero para representar un conteo o valor relacionado con el profesor (por ejemplo, cantidad de clases).
     */
    int cuento;

    /**
     * Indica si el profesor es inteligente.
     */
    boolean inteligencia;

    /**
     * Constructor vacío de la clase Profesor.
     */
    public Profesor() {
    }

    /**
     * Constructor de la clase Profesor con 4 parámetros.
     *
     * @param nombre        Nombre del profesor.
     * @param conocimiento  Indica si el profesor tiene conocimiento.
     * @param empatia       Indica si el profesor es empático.
     * @param cuento        Un valor entero (por ejemplo, número de clases).
     */
    public Profesor(String nombre, boolean conocimiento, boolean empatia, int cuento) {
        this.nombre = nombre;
        this.conocimiento = conocimiento;
        this.empatia = empatia;
        this.cuento = cuento;
        // Por defecto, asignamos un valor a inteligencia
        this.inteligencia = true;
    }

    /**
     * Constructor de la clase Profesor con 5 parámetros.
     *
     * @param nombre        Nombre del profesor.
     * @param conocimiento  Indica si el profesor tiene conocimiento.
     * @param empatia       Indica si el profesor es empático.
     * @param cuento        Un valor entero (por ejemplo, número de clases).
     * @param inteligencia  Indica si el profesor es inteligente.
     */
    public Profesor(String nombre, boolean conocimiento, boolean empatia, int cuento, boolean inteligencia) {
        this.nombre = nombre;
        this.conocimiento = conocimiento;
        this.empatia = empatia;
        this.cuento = cuento;
        this.inteligencia = inteligencia;
    }

    /**
     * Muestra un mensaje indicando que el profesor está exponiendo un tema.
     */
    public void exponer() {
        System.out.println("Tu tienes un vector...");
    }

    /**
     * Muestra un mensaje indicando que el profesor está dirigiendo la clase.
     */
    public void dirigir() {
        System.out.println("Deriven, deriven!");
    }

    /**
     * Muestra un mensaje indicando que el profesor está creando una nueva habilidad en sus alumnos.
     */
    public void crearHabilidad() {
        System.out.println("Estoy creando una nueva habilidad en mis alumnos.");
    }

    /**
     * Muestra un mensaje indicando que el profesor está creando exámenes.
     */
    public void crearExamenes() {
        System.out.println("Estoy creando examenes.");
    }

    /**
     * Muestra un mensaje indicando que el profesor está evaluando a los alumnos.
     */
    public void evaluar() {
        System.out.println("Estoy evaluando a los alumnos.");
    }
}
