/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase;

/**
 *
 * @author SERVIDOR
 */
public class Fraccionario {
    private int numerador;
    private int denominador;

    public Fraccionario (int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    
    public Fraccionario sumar (Fraccionario f2){
       Fraccionario f;
       int num, denm;
       
       num= this.numerador * f2.denominador + this.denominador * this.numerador;
       denm= this.denominador * f2.denominador;
       f = new Fraccionario (num,denm);
       return f;      
    }
    public Fraccionario restar (Fraccionario f2){
        Fraccionario f;
        int num, denm;
        
        num = this.numerador * f2.denominador - this.denominador * this.numerador;
        denm = this.denominador * f2.denominador;
        f = new Fraccionario (num,denm);
        return f;
    }
    public Fraccionario multiplicacion (Fraccionario f2){
        Fraccionario f;
        int num,denm;
        
        num= this.numerador * f2.numerador;
        denm= this.denominador * f2.denominador;
        f = new Fraccionario (num,denm);
        return f;
    }
    public Fraccionario division (Fraccionario f2){
        Fraccionario f;
        int num,denm;
        
        num = this.numerador * f2.denominador;
        denm = f2.numerador * this.denominador;
        f= new Fraccionario (num,denm);
        return f;
    }

}

