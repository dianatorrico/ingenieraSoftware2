/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1istrabajo;

/**
 *
 * @author dianatorrico
 */
public class PolinomioSegundoGrado {
    
    private double a;
    private double b;
    private double c;

    //Constructor 

    public PolinomioSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public PolinomioSegundoGrado(double a) {
        this.a = a;
        this.b = 0;
        this.c = 0;
    }

    public PolinomioSegundoGrado(double a, double b) {
        this.a = a;
        this.b = b;
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

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    
    //calcular valorpolinomio
    public double calcularValor(double x){
        double resultado = (this.getA()*x*x) + (this.getB()*x) + this.getC();
        return resultado;  
        
    }

    
}
