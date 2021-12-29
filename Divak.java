import java.util.Random;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Divak
{
    private String meno;
    private int vek;
    private int pocetPenazi;
    private int zostatok;
    private boolean listok;
    
    private Random random;
        
    
    public Divak()
    {
        this.random = new Random();
        this.vek = random.nextInt(80)+1;
        this.meno = "";
        this.pocetPenazi = this.vek = random.nextInt(50);
        this.zostatok = pocetPenazi;
        //this.maListok = false;
    }
    
    public Divak(String meno, int vek, int peniaze) {
        this.vek = vek;
        this.pocetPenazi = peniaze;
        this.zostatok = peniaze;
        this.meno = meno;
        this.listok = false;
    }

    public int getVek()
    {
        return this.vek;
    }
    
    public int getPeniaze() {
        return this.pocetPenazi;
    }
    
    public void setListok() {
        this.listok = true;
    }
    
    public boolean zistiListok() {
        if(this.listok != false)  {
            return true;
        }
        return false;
    }
    
    public String getMeno() {
        return this.meno;
    }
    
    public void setPeniaz(int novyPocet) {
        this.pocetPenazi = novyPocet;
    }
    
    public int getZostatok() {
        return this.zostatok;
    }
    
    public void zapis(int b, int c) throws IOException {
        File subor = new File("filename.txt");
        PrintWriter zapisovac = new PrintWriter(subor);
        
        zapisovac.println("Váš Lístok");
        zapisovac.println("-------------------");
        zapisovac.println("◄  " +"Meno - "+ this.getMeno() + "  ►" );
        zapisovac.println("◄  " +"Vek - "+ this.getVek() + "  ►");
        zapisovac.println("◄  " +"Zostatok - "+ this.getPeniaze() + "  ►");
        zapisovac.println("◄  " +"Vase miesto " + b + "││"+ c + "  ►");
        zapisovac.println("-------------------");
        
        zapisovac.close();
    }
    
    public void read() {
        try {
          File subor = new File("filename.txt");
          Scanner myReader = new Scanner(subor);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
               System.out.println(data);
      }
          myReader.close();
      } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
       }
    }
    
    
    
   
}
