/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 * Clase Alumno que representa a un estudiante con atributos
 * como número de cuenta, carrera y promedio, y métodos para
 * simular actividades típicas de un alumno.
 *
 * @author Issmael
 */
public class Alumno {
    /**
     * Número de cuenta del alumno.
     */
    int numeroCuenta;

    /**
     * Carrera que cursa el alumno.
     */
    String carrera;

    /**
     * Semestre en el que se encuentra el alumno.
     */
    int semestre;

    /**
     * Promedio actual del alumno.
     */
    double promedio;

    /**
     * Nombre del alumno.
     */
    String nombre;

    /**
     * Constructor vacío de la clase Alumno.
     */
    public Alumno() {
    }

    /**
     * Constructor de la clase Alumno con todos los atributos.
     *
     * @param numeroCuenta  Número de cuenta del alumno.
     * @param carrera       Carrera que cursa el alumno.
     * @param semestre      Semestre en el que se encuentra.
     * @param promedio      Promedio actual del alumno.
     * @param nombre        Nombre del alumno.
     */
    public Alumno(int numeroCuenta, String carrera, int semestre, double promedio, String nombre) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
        this.nombre = nombre;
    }

    /**
     * Muestra un mensaje indicando que el alumno está estudiando.
     */
    public void estudiar() {
        System.out.println(nombre + " esta estudiando");
    }

    /**
     * Muestra un mensaje indicando que el alumno está haciendo tarea.
     */
    public void hacerTarea() {
        System.out.println(nombre + " esta haciendo tarea");
    }

    /**
     * Muestra un mensaje indicando que el alumno se ha inscrito en sus materias.
     */
    public void inscribirse() {
        System.out.println(nombre + " se ha inscrito en sus materias");
    }

    /**
     * Muestra un mensaje indicando que el alumno está haciendo exámenes.
     */
    public void hacerExamenes() {
        System.out.println(nombre + " esta haciendo examenes");
    }

    /**
     * Muestra un mensaje indicando que el alumno está tomando apuntes.
     */
    public void tomarApuntes() {
        System.out.println(nombre + " esta tomando apuntes");
    }
}
