import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Zapis
{
    private String fileName;
    private Scanner citac;
    private PrintWriter zapisovac;
    //private Futbal futbal;
    
    public Zapis(String fileName)
    {
        //File subor = new File(fileName);
    }
    
    public void zapisDivak(String meno, int vek, int peniaze) throws IOException {
        /** Vytvori, zapíše udaje(meno tímu, počet golov),
         * 
         */
        File subor = new File(fileName);
        PrintWriter zapisovac = new PrintWriter(subor);
        
        zapisovac.println("Váš Lístok");
        zapisovac.println("-------------------");
        zapisovac.println("◄  " + meno + "  ►" );
        zapisovac.println("◄  " + vek + "  ►");
        zapisovac.println("◄  " + peniaze + "  ►");
        zapisovac.println("-------------------");
        
        zapisovac.close();
    }
    
    public void readDivak() {
        
    }
    

}
