/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author Issmael
 */

public class Punto {
    int x;
    int y;
    /*
    public Punto(){
        x=0;
        y=0;
    }*/
//Constructores
    public Punto(){}
    
    public Punto(int x, int y){
        this.x=x;
        this.y=y;
    }
//Métodos
    public void imprimePunto(){
        System.out.println("x="+x+",y="+y);
    }
}