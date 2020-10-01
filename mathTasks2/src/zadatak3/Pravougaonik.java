/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak3;

/**
 *
 * @author java
 */
public class Pravougaonik implements MatematickaOperacija{
    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

   
    @Override
    public double izracunajP(){
        return a*b;
    }
    @Override
    public double izracunajO(){
        return 2*a+2*b;
    }
    
}
