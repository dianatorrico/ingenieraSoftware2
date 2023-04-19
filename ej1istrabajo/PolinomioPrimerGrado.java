/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1istrabajo;

/**
 *
 * @author dianatorrico
 */
public class PolinomioPrimerGrado {
    
    private double b;
    private double c;

    //constructor 
    public PolinomioPrimerGrado(double b, double c) {
        this.b = b;
        this.c = c;
    }
    
    public PolinomioPrimerGrado(double b){
        this.b= b;
        this.c = 0;
    }
    
    
    //métodos básicos
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }
    
    //calcular valor del polinomio
    public double calcularValor(double x) {
        double resultado = (this.getB()*x) + this.getC();
        return resultado; 
    }

    @Override
    public String toString() {
        return "PolinomioPrimerGrado{" + "b=" + b + ", c=" + c + '}';
    }
    

}
