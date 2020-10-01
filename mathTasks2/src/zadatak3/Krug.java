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
public class Krug implements MatematickaOperacija{
    double r ;

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Krug(double r) {
        this.r = r;
    }
    @Override
    public double izracunajO(){
        
      return 2*r*3.14;  
    }
    @Override
    public double izracunajP(){
        return r*r*3.14;
        
    }
}
