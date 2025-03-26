/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 * La clase Coche define un vehículo con características como la marca, el modelo,
 * el año y el color. Incluye métodos para simular acciones como encender, acelerar
 * y frenar.
 * @author Issmael
 */
public class Coche {
    /**
     * Marca del coche.
     */
    public String marca;

    /**
     * Modelo del coche.
     */
    public String modelo;

    /**
     * Año del coche.
     */
    public int anio;

    /**
     * Color del coche.
     */
    public String color;

    /**
     * Constructor vacío de la clase Coche.
     */
    public Coche() {
    }

    /**
     * Constructor de la clase Coche que inicializa todos los atributos.
     *
     * @param marca   Marca del coche.
     * @param modelo  Modelo del coche.
     * @param anio    Año del coche.
     * @param color   Color del coche.
     */
    public Coche(String marca, String modelo, int anio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.color = color;
    }

    /**
     * Simula el encendido o apagado del coche.
     *
     * @param encender Indica si el coche se enciende (true) o se apaga (false).
     */
    public void encender(Boolean encender) {
        if (encender) {
            System.out.println("El coche se ha encendido.");
        } else {
            System.out.println("El coche está apagado.");
        }
    }

    /**
     * Muestra un mensaje indicando la velocidad a la que el coche está acelerando.
     *
     * @param velocidad Velocidad en km/h a la que el coche acelera.
     */
    public void acelerar(int velocidad) {
        System.out.println("El coche está acelerando a " + velocidad + " km/h.");
    }

    /**
     * Simula el frenado del coche.
     *
     * @param frenar Indica si el coche está frenando (true) o no (false).
     */
    public void frenar(Boolean frenar) {
        if (frenar) {
            System.out.println("El coche está frenando.");
        } else {
            System.out.println("El coche no está frenando.");
        }
    }
}