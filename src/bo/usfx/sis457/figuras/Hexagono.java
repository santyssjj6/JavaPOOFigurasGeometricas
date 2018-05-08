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
public class Hexagono {
   private double Lado4;
    private double Apotema;

    
    public Hexagono(double lado4, double apotema) {
        this.Lado4 = lado4;
        this.Apotema = apotema;
    }
    
    
    public Hexagono () {
        
        this(0, 0);
    }

    
    public double getLado4() {
        return Lado4;
    }

    public void setLado4(double lado4) {
        this.Lado4 = lado4;
    }

    
    public double getApotema() {
        return Apotema;
    }

    
    public void setApotema(double apotema) {
        this.Apotema = apotema;
    }
    
    
    public double getArea() {
        return (6*this.Lado4*this.Apotema)/2;
    }
    
    
    public double getPerimetro() {
        return 6*this.Lado4;
    } 
}
