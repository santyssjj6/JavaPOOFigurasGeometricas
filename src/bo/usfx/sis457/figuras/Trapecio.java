/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo.usfx.sis457.figuras;

/**
 *
 * @author 2017
 */
public class Trapecio {
    private double Base1;
    private double Base2;
    private double Altura2;
    private double Lado;

    public Trapecio(double base1, double base2, double altura2,double lado) {
        this.Base1 = base1;
        this.Base2 = base2;
        this.Altura2 = altura2;
        this.Lado = lado;
    }

    public Trapecio() {
        // Llama al método constructor anterior
        this(0, 0, 0, 0);
    }

    /**
     * Método que retorna el valor de la Base 
     * @return Retorna el valor de la Base en tipo double
     */
    public double getBase1() {
        return Base1;
    }

    public void setBase1(double base1) {
        this.Base1 = base1;
    }

    public double getAltura2() {
        return Altura2;
    }

    public double getBase2() {
        return Base2;
    }

    public void setBase2(double base2) {
        this.Base2 = base2;
    }

    public double getLado() {
        return Lado;
    }

    public void setLado(double Lado) {
        this.Lado = Lado;
    }
    
    public void setAltura2(double altura2) {
        this.Altura2 = altura2;
    }
    
    public double getArea() {
        return ((this.Base1+this.Base2)*(this.Altura2))/2;
    }
    
    public double getPerimetro() {
        return (2 * (this.Base1+this.Base2 + 2*this.Lado));
    }
}
