package Futbal;

import java.util.Random;
import java.util.ArrayList;
import java.io.IOException;
import java.io.*;

/**
 * Trieda Futbal slúži na odohranie futbaloveho zapasu, vypise informacie o zapase/och, 
 * nasledne zapisanie do suboru a vypisanie vitaza ligy
 * »…
 * obsahuje ArrayList tímov
 *
 * @author   «Vladimir Danko»
 * @version  «6.1.2022»
 */
public class Futbal
{
    private Random random;
    private int goly;
    private int goly2;
    private int goly3;
    private int goly4;
    private ArrayList <Timy> timy;
    private Timy tim1;
    

    public Futbal()
    /** Konštruktor triedy futbal,
    *Nastavíme počiatočné goly na nulu, 
    *vytvorime ArrayList do ktoreho vložime tim1, a nasledne generujeme tímy
    */
    {
        
        this.goly = 0;
        this.goly2 = 0;
        this.goly3 = 0;
        this.goly4 = 0;
        
        this.timy = new ArrayList <> ();
        
        this.tim1 = new Timy();
        
        this.timy.add(tim1);
        
        this.random = new Random();
        
        this.generujTimy();
        
        
    }
    
    public void generujTimy() {
    /** Generuje tímy a uklada do ArrayListu, treba zabezpečiť
     * aby sa tímy neopakovali
     * 
     */
    for(int i = 0; i <= 3; i++) {
            Timy novyTim = new Timy();
            if(novyTim.getNazov().equals(this.timy.get(i).getNazov())) {
                i--;
            }else if(novyTim.getNazov() != this.timy.get(i).getNazov()) {
                this.timy.add(novyTim);
            }
        }
    }
    
    public void vypisTimy() {
        for(int i = 0; i < this.timy.size(); i++){
            System.out.println(this.timy.get(i).getNazov());
            System.out.println("-------");
        }
    }
    
    public void vypisSpecialnyHrac() {
        for(int i = 0; i < this.timy.size(); i++) {
            System.out.println(this.timy.get(i).getSpecialnyHrac());
            System.out.println("-------");
        }
        
    }
    
    public void odohrajZapas() 
    /** 
     * // Víťazny tím získa 3 body, pokial je 
     * remiza ziskavaju oba tímy 1 bod, 
     * pokial tím prehrá získa 0 bodov
     */
    
    {
       int goly1 = random.nextInt(5);
       int goly2 = random.nextInt(5);
       
       
       if(goly1 > goly2) {
           this.timy.get(0).pridajBody(3);
       }else if(goly1 == goly2) {
           this.timy.get(0).pridajBody(1);
           this.timy.get(1).pridajBody(1);
       }else {
           this.timy.get(1).pridajBody(3);
       }
       
       
       
       this.goly = goly1;
       this.goly2 = goly2;
       
       
       this.vypisInfoZapas();
    }
    
    public void odohrajZapas2() {
    /** 
     * Víťazny tím získa 3 body, pokial je 
     * remiza ziskavaju oba tímy 1 bod, 
     * pokial tím prehrá získa 0 bodov
     */
        int goly3 = random.nextInt(5);
       int goly4 = random.nextInt(5);
       
         if(goly3 > goly4) {
           this.timy.get(2).pridajBody(3);
       }else if(goly3 == goly4) {
           this.timy.get(2).pridajBody(1);
           this.timy.get(3).pridajBody(1);
       }else {
           this.timy.get(3).pridajBody(3);
       }
       
       this.goly3 = goly3;
       this.goly4 = goly4;
       
       this.vypisInfoZapas2();
    }
    
    public void dnesHraju() {
        System.out.println(this.toString());
    }
    
    public String toString() {
        return "Dnes hra zapas: "+ "\n" + "\n" +  timy.get(0).getNazov()  + 
         " vs " + timy.get(1).getNazov() +"   " + "1. Zapas"+ "\n" 
        + "--------------" + "\n" + timy.get(2).getNazov() +  " vs " + timy.get(3).getNazov() + "     "+ "2.Zapas" +
        "\n" +"\n" + "Specialny hrac prveho timu je " + timy.get(0).getSpecialnyHrac() +
        "\n" + "Specialny hrac druheho timu je " + timy.get(1).getSpecialnyHrac() +
        "\n" + "Specialny hrac tretieho timu je " + timy.get(2).getSpecialnyHrac() +
        "\n" + "Specialny hrac štvrtého timu je " + timy.get(3).getSpecialnyHrac() ;
        
    }
    
    public void vypisInfoZapas() {
        //spravit cez switch golov nech to neznie maďarsky
        System.out.println ("Tim " + timy.get(0).getNazov() + " strelil v tomto zapase " + goly + " golov" + " a má " + this.timy.get(0).getBody() + " bodov ");
        System.out.println("-----------------------------------");
        System.out.println ("Tim " + timy.get(1).getNazov() + " strelil v tomto zapase " + goly2 + " golov " + " a má " + this.timy.get(1).getBody() + " bodov");
        System.out.println("-----------------------------------");
        
    }
    
    public void vypisInfoZapas2() {
        //spravit cez switch golov
        System.out.println ("Tim " + timy.get(2).getNazov() + " strelil v tomto zapase " + goly3 + " golov" + " a má " + this.timy.get(2).getBody() + " bodov ");
        System.out.println("-----------------------------------");
        System.out.println ("Tim " + timy.get(3).getNazov() + " strelil v tomto zapase " + goly4 + " golov " + " a má " + this.timy.get(3).getBody() + " bodov");
        System.out.println("-----------------------------------");
        
    }
    
    
    public void vypis() {
        System.out.println(goly);
    }
   
}
