/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package start;
import java.time.Clock;
import zadatak1.Niz;
import java.util.Scanner;
import zadatak3.Krug;
import zadatak3.Kvadrat;
import zadatak3.Pravougaonik;

/**
 *
 * @author java
 */
public class Strat {
    
    public  static void izbor(){
        Niz niz = new Niz();
        Scanner tastatura = new Scanner(System.in);
        int izbor = tastatura.nextInt();
      
        
        
        switch (izbor){
            case 1: System.out.println("Izabrao si  -zadatak1");
            System.out.println("Svi brojevi iz niza su:");
            niz.zd1Svi();
            System.out.println("");
            System.out.println("Brojevi na neparnim pozicijama iz niza su:");
            niz.zd1NeparPoz();
            System.out.println("");
            System.out.println("Najmanji broj iz niza je:" + niz.zd1Najmanji());
           
            System.out.println("Suma neparnih elemenata: " + niz.zd1SumaNeparnih());
            System.out.println("Srednja vrednost elemenata: " + niz.zd1SrednjaVrednost());
            System.out.println("broj elemenata niza vecih od srednje vrednosti: " + niz.zd1VeciOdSr());
           
            break;
            
            case 2: System.out.println("Izabrao si  -zadatak2 - U IZRADI");
            break;
            
            case 3: System.out.println("izaberi:");
                    System.out.println("1 Kvadrat");
                    System.out.println("2 Pravougaonik");
                    System.out.println("3 Krug");
        {
            int izbor2 = tastatura.nextInt();
            switch(izbor2){
                case 1:  System.out.println("izabrao si Kvadrat");
                System.out.println("Unesi dimenzije stranice a:");
                double aK = tastatura.nextDouble();
                Kvadrat k = new Kvadrat(aK);
                k.izracunajO();
                k.izracunajP();
                 System.out.print("O=");
                System.out.println(k.izracunajO());
                System.out.print("P=");
                System.out.println(k.izracunajP());
                
                break;
                case 2:  System.out.println("izabrao si Pravougaonik");
                        System.out.println("Unesi dimenzije stranice a i b:");  
                        double a = tastatura.nextDouble();
                        double b = tastatura.nextDouble();
                        Pravougaonik p = new Pravougaonik (a,b);
                        p.izracunajO();
                        p.izracunajP();
                        System.out.print("O=");
                        System.out.println(p.izracunajO());
                        System.out.print("P=");
                        System.out.println(p.izracunajP());
                        
                        break;
                        
                case 3:  System.out.println("izabrao si Krug");
                 System.out.println("Unesi dimenzije r");
                         double r = tastatura.nextDouble();
                         Krug kr = new Krug(r);
                         kr.izracunajO();
                         kr.izracunajP();
                          System.out.print("O=");
                         System.out.println(kr.izracunajO());
                         System.out.print("P=");
                         System.out.println(kr.izracunajP());
                 
                 break;
                        
                
            }
                
                
                ;break;}
                    case 4: System.out.println("Izabrao si Kraj");break;
            }
        }
        
    
    
    public static void main(String []args){
       
        System.out.println("IZABERI");
        System.out.println("Izaberi 1 -zadatak1");
        System.out.println("Izaberi 2 -zadatak2");
        System.out.println("Izaberi 3 -zadatak3");
        System.out.println("Izaberi 4 -KRAJ");
        izbor();
       
    }

   
}
