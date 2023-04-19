/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1istrabajo;

/**
 *
 * @author dianatorrico
 */
public class PolinomioTercerGrado {
    
    private double a;
    private double b;
    private double c;
    private double d;

    //constructor
    
    //métodos básicos
    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
    
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

    //calcular valor del polinomio 
     public double calcularValor(double x){
        double resultado = (this.getA()*x*x*x) + (this.getB()*x*x) + (this.getC()*x) + this.getD();
        return resultado;  
        
    }
     
    
    
}
