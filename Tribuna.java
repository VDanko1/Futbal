import java.util.Random;
import java.util.ArrayList;
public class Tribuna
{
    private boolean[][] tribuna;
    private int stlpec = 5;
    private int riadok = 10;
    
    private Random generator;
    
    public Tribuna()
    {
        this.tribuna = new boolean[stlpec][riadok];
        this.generator = new Random();
        
        for(int i = 0; i <= stlpec - 1; i++) {
            for(int j = 0; j <= riadok - 1; j++) {
                this.tribuna [i][j] = generator.nextBoolean();
            }
        }
    }


    public void vypisTribunu() { 
        for(int i = 0; i <= stlpec - 1 ; i++) {
            for(int j = 0; j <= riadok - 1 ; j++) {
                if(j == riadok - 1) {
                    System.out.print("\n");
                }else {
                    if(this.tribuna[i][j] == true) {
                        System.out.print("O" + "  ");
                    }else if(this.tribuna[i][j] == false) {
                        System.out.print("V" + "" + generator.nextInt(10) + 10);
                    }
                }
            }
        }
    }
    
    public void kupListok(int i, int j) { //obsadi nam miesto
        if(this.tribuna[i][j] == true) {
            System.out.println("Obsadene miesto, vyber ine!");
        }else {
            this.tribuna[i][j] = true;
            System.out.println("Uspesne ste si kupili listok!" + "\n" + "Vase miesto je " + i + " " + j);
            
        }
    }

}
