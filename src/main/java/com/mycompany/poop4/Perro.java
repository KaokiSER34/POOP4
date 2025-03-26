/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 * La clase Perro representa a una mascota con atributos como nombre, raza,
 * color de pelaje y color de ojos, así como métodos que simulan acciones
 * típicas de un perro.
 * @author Issmael
 */
public class Perro {
    /**
     * Nombre del perro.
     */
    public String nombre;

    /**
     * Raza del perro.
     */
    public String raza;

    /**
     * Color del pelaje del perro.
     */
    public String colorPelo;

    /**
     * Color de ojos del perro.
     */
    public String colorOjos;

    /**
     * Edad del perro.
     */
    public int edad;

    /**
     * Constructor de la clase Perro con todos los atributos.
     *
     * @param nombre    Nombre del perro.
     * @param raza      Raza del perro.
     * @param colorPelo Color del pelaje del perro.
     * @param colorOjos Color de ojos del perro.
     * @param edad      Edad del perro.
     */
    public Perro(String nombre, String raza, String colorPelo, String colorOjos, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.colorOjos = colorOjos;
        this.edad = edad;
    }

    /**
     * Muestra un mensaje indicando que el perro está ladrando o no.
     *
     * @param ladrar Indica si el perro ladra (true) o no (false).
     */
    public void ladrar(boolean ladrar) {
        if (ladrar) {
            System.out.println(nombre + " esta ladrando");
        } else {
            System.out.println(nombre + " no quiere ladrar");
        }
    }

    /**
     * Muestra un mensaje indicando si el perro está durmiendo o no.
     *
     * @param dormir Indica si el perro duerme (true) o no (false).
     */
    public void domir(boolean dormir) {
        if (dormir) {
            System.out.println(nombre + " esta durmiendo");
        } else {
            System.out.println(nombre + " no quiere dormir");
        }
    }

    /**
     * Muestra un mensaje indicando si el perro está jugando o no.
     *
     * @param jugar Indica si el perro juega (true) o no (false).
     */
    public void jugar(boolean jugar) {
        if (jugar) {
            System.out.println(nombre + " esta jugando");
        } else {
            System.out.println(nombre + " no quiere jugar");
        }
    }

    /**
     * Muestra un mensaje indicando si el perro está comiendo o no.
     *
     * @param comer Indica si el perro come (true) o no (false).
     */
    public void comer(boolean comer) {
        if (comer) {
            System.out.println(nombre + " esta comiendo");
        } else {
            System.out.println(nombre + " no quiere comer");
        }
    }
}
