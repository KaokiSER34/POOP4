/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author Issmael
 */
public class Pokemon {
    int ataque;
    int defensa;
    int defensaEsp;
    int ataqueEsp;
    float velocidad;
    
    public Pokemon(){}
    
    public Pokemon(int ataque, int defensa, int defensaEsp, int ataqueEsp, float velocidad){
        this.ataque=ataque;
        this.defensa=defensa;
        this.defensaEsp=defensaEsp;
        this.ataqueEsp=ataqueEsp;
        this.velocidad=velocidad;
    }
    public void atacar(){
        System.out.println("Te voy a atacar");
    }
    public void usarObjeto(String objeto){
        System.out.println("He usado el objeto "+objeto);
    }
    public void retirarse(){
        System.out.println("(Se retira)");
    }
    public void curarse(){
        System.out.println("Me voy a curar");
    }
    public void defender(){
        System.out.println("(Se defiende)");
    }
}
