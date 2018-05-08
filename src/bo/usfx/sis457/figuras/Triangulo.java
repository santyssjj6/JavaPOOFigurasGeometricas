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
public class Triangulo {
    private double Base3;
    private double Altura3;

    /**
     * Método constructor, crea el Triangulo con las propiedades Base y Altura
     * @param base3 Valor tipo double
     * @param altura3 Valor tipo double
     */
    public Triangulo(double base3, double altura3) {
        this.Base3 = base3;
        this.Altura3 = altura3;
    }
    
    /**
     * Método constructor, crea el Triangulo con valores por defecto
     */
    public Triangulo () {
        // Llama al método constructor anterior
        this(0, 0);
    }

    /**
     * Método que retorna el valor de la Base 
     * @return Retorna el valor de la Base en tipo double
     */
    public double getBase3() {
        return Base3;
    }

    /**
     * Método que modifica el valor de la Base
     * @param base Valor de tipo double
     */
    public void setBase3(double base3) {
        this.Base3 = base3;
    }

    /**
     * Método que retorna el valor de la Altura3 
     * @return Retorna el valor de la Altura3 en tipo double
     */
    public double getAltura3() {
        return Altura3;
    }

    /**
     * Método que modifica el valor de la Altura
     * @param altura3 Valor de tipo double
     */
    public void setAltura3(double altura3) {
        this.Altura3 = altura3;
    }
    
    /**
     * Método que retorna el area del Triangulo
     * @return Retorna el valor del Area de tipo double
     */
    public double getArea() {
        return (this.Base3 * this.Altura3)/2;
    }
    
    /**
     * Método que retorna el perimetro del Triangulo
     * @return Retorna el valor del Perímetro de tipo double
     */
    public double getPerimetro() {
        return 3*this.Base3;
    }
}

