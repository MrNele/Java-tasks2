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
public class Kvadrat implements MatematickaOperacija{
    private double aK;

   
    public double getaK() {
        return aK;
    }

    public void setaK(double aK) {
        this.aK = aK;
    }

    public Kvadrat(double aK) {
        this.aK = aK;
    }

   
    @Override
    public double izracunajO(){
    return 4*aK;
}
    @Override
    public double izracunajP(){
        return aK*aK;
    }
}
