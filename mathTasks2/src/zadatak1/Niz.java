/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zadatak1;

/**
 *
 * @author java
 */
public class Niz {

    int[] brojevi = {10, 1, 2, 3, 5};
    int min = brojevi[0];
    int sumaNeparnih = 0;
    double srednjaVrednost = 0.0;
    // int n = brojevi.length;
    int suma = 0;

    public void zd1Svi() {
        for (int i = 0; i < brojevi.length; i++) {

            System.out.print(brojevi[i] + "  ");

        }
    }

    public void zd1NeparPoz() {

        for (int i = 0; i * 2 < brojevi.length; i++) {

            System.out.print(brojevi[i * 2] + "  ");

        }
    }

    public int zd1Najmanji() {

        for (int i = 0; i < brojevi.length; i++) {
            if (brojevi[i] < min) {
                min = brojevi[i];
            }

        }
        return min;
    }

    public int zd1SumaNeparnih() {
        for (int i = 0; i < brojevi.length; i++) {
            if (brojevi[i] % 2 == 1) {
                sumaNeparnih = sumaNeparnih + brojevi[i];
            }
        }
        return sumaNeparnih;

    }

    public double zd1SrednjaVrednost() {
        for (int i = 0; i < brojevi.length; i++) {
            suma = suma + brojevi[i];

        }
        srednjaVrednost = (double)suma / brojevi.length;
        return srednjaVrednost;
    }

    public int zd1VeciOdSr() {
            int brojac = 0;
        for (int i = 0; i < brojevi.length; i++) {
            {
                if (brojevi[i] > srednjaVrednost) {
                    brojac++;
                }

            }
        }
        return brojac;
    }
}
