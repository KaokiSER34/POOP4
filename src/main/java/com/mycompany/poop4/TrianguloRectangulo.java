/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 * La clase TrianguloRectangulo representa un triángulo rectángulo definido
 * por su base y su altura. Ofrece métodos para calcular la hipotenusa y el área.
 * @author Issmael
 */
public class TrianguloRectangulo {
    /**
     * Base del triángulo rectángulo.
     */
    public double base;

    /**
     * Altura del triángulo rectángulo.
     */
    public double altura;

    /**
     * Constructor vacío de la clase TrianguloRectangulo.
     */
    public TrianguloRectangulo() {
    }

    /**
     * Constructor de la clase TrianguloRectangulo que inicializa la base y la altura.
     *
     * @param base   Base del triángulo.
     * @param altura Altura del triángulo.
     */
    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * Calcula y muestra la hipotenusa del triángulo usando el teorema de Pitágoras.
     */
    public void calcularHipotenusa() {
        double hipotenusa = Math.sqrt((base * base) + (altura * altura));
        System.out.println("La hipotenusa del triángulo con base " + base 
            + " y altura " + altura + " es: " + hipotenusa);
    }

    /**
     * Calcula y muestra el área del triángulo rectángulo.
     */
    public void calcularArea() {
        double area = (base * altura) / 2.0;
        System.out.println("El área del triángulo con base " + base 
            + " y altura " + altura + " es: " + area);
    }
}