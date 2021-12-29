import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Random;

public class Main
{
    private static Futbal futbal;
    private static Tribuna tribuna;
    private static Scanner scanner;
    private static Scanner scanner2;
    private static Tribunka tribunka;
    private static Random random;
    private static Zapis listok;
    private static Divak ja;
    //private static int input;

    public static void main(String[] args) throws InterruptedException, IOException {
        System.out.print('\u000c');
        
        String inf = ("Vitajte na Futbalovom zápase!" + "\n" + "1. Zakupenie listka na tribunu dospelych" + "\n" 
        + "2. Rezervovanie/Kupenie si listka na tribunu mladych" + "\n" +
        "3. Ukaz moj listok" + "\n" +
        "4. Zistite kto dnes hrá" + "\n" +
        "5. Pozrite si zápas č.1" + "\n" +
        "6. Pozrite si zápas č.2" + "\n" +
        "0. Ukoncenie navstevy");
        
        String v = ("Zadajte svoj vek : ");
        String m = ("Zadajte svoje meno : ");
        String p = ("Zadajte kolko mas penazi : ");
        
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        futbal = new Futbal();
        tribuna = new Tribuna();
        tribunka = new Tribunka();
        random = new Random();
        
        int avek;
        String meno;
        int peniaze;
        
        System.out.println(v);
        avek = scanner.nextInt();
            
        System.out.println(m);
        meno = scanner2.nextLine();
        
        System.out.println(p);
        peniaze = scanner.nextInt();
        
        ja = new Divak(meno, avek, peniaze);
        
        System.out.println(inf);
        
        int volba;
        do {
            volba = scanner.nextInt();
            switch (volba) {
                case 1: 
                    if(ja.getVek() >= 18) {
                        //tribuna.nahodneObsad();
                        tribuna.vypisTribunu();
                        int i = scanner.nextInt();
                        int j = scanner.nextInt();
                        tribuna.kupListok(i, j);
                        Thread.sleep(1500);
                        System.out.print('\u000c');
                        System.out.print(inf);
                        break;
                    } else {
                        System.out.println("Nemáš vek, vyber si druhú tribúnu pre mladistvých");
                        break;
                    }
                case 2:
                    System.out.println("Pre rezervovanie napis R , pre kupenie napis K");
                    String s = scanner2.nextLine();
                    if(s.toLowerCase().equals("r")) {
                        tribunka.vypisTribunu();
                        System.out.print("Zadajte miesto na rezervaciu" + "\n");
                        int b = scanner.nextInt();
                        int c = scanner.nextInt();
                        if(ja.getPeniaze() >= tribunka.getMiestoCena(b, c)) {
                            ja.setPeniaz(ja.getPeniaze() - tribunka.getMiestoCena(b, c));
                            ja.zapis(b, c);
                            tribunka.RezervujListok(b,c);
                            Thread.sleep(4000);
                            System.out.print('\u000c');
                            System.out.print(inf);
                            break;
                        }else {
                            System.out.println("Nemáš peniaze!");
                            Thread.sleep(4000);
                            System.out.print('\u000c');
                            System.out.print(inf);
                            break;
                        }
                    }else if(s.toLowerCase().equals("k")) {
                        tribunka.vypisTribunu();
                        System.out.println("Zadajte miesto na kúpu" + "\n");
                        int b = scanner.nextInt();
                        int c = scanner.nextInt();
                        if(ja.getPeniaze() >= tribunka.getMiestoCena(b, c)) {
                            ja.setPeniaz(ja.getPeniaze() - tribunka.getMiestoCena(b, c));
                            ja.zapis(b, c);
                            tribunka.kupListok(b, c);
                            Thread.sleep(4000);
                            System.out.print('\u000c');
                            System.out.print(inf);
                            break;
                        }else {
                            System.out.println("Nemáš peniaze!");
                            Thread.sleep(4000);
                            System.out.print('\u000c');
                            System.out.print(inf);
                            break;
                        }
                    }
                    
                case 3:
                    System.out.print('\u000c');
                    ja.read();
                    Thread.sleep(8000);
                    System.out.print("\n" + inf);
                    break;
                case 4:
                    System.out.print('\u000c');
                    futbal.dnesHraju();
                    Thread.sleep(5000);
                    System.out.print("\n" + inf);
                    break;
                
                case 5:
                    System.out.print('\u000c');
                    futbal.odohrajZapas();
                    Thread.sleep(3000);
                    System.out.print('\u000c');
                    System.out.println(inf);
                    break;
                case 6:
                    System.out.print('\u000c');
                    futbal.odohrajZapas2();
                    Thread.sleep(3000);
                    System.out.print('\u000c');
                    System.out.println(inf);
                    break;    
                case 0:
                    System.out.println("\n" + "Dovidenia");
                    break;
                    
                    
            }
            
            
            
        }while(volba != 0);
    }
    
    
    
}  
            
        
    

