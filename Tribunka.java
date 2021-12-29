
import java.util.Random;
public class Tribunka
{
    private Random random;
    private Miesto[][] tribuna;
    private int stlpce = 5;
    private int riadky = 10;

    public Tribunka()
    {
        this.tribuna = new Miesto[stlpce][riadky];
        
        for(int i = 0; i <= stlpce -1; i++) {
            for(int j = 0; j <= riadky - 1; j++) {
                this.tribuna [i][j] = new Miesto();
            }
        }
    }
    
    public void vypisTribunu() {
        for(int i = 0; i <= stlpce - 1 ; i++) {
            for(int j = 0; j <= riadky - 1 ; j++) {
                if(j == riadky - 1) {
                    System.out.print("\n");
                }else {
                    switch (tribuna[i][j].getTypObsadenia()) {
                        case VOLNE:
                            System.out.print("V" + "" + "(" + tribuna[i][j].getCena() + "€)" + "  " );
                            break;
                        case REZERVOVANE:
                            System.out.print("R" + "  " );
                            break;
                        default:
                            System.out.print("O" + "  " );
                            break;
                    }
                    //if(this.tribuna[i][j].getTypObsadenia() == TypyObsadeni.VOLNE) {
                        //System.out.print("V" + "  ");
                    //}else if(this.tribuna[i][j].getTypObsadenia() == TypyObsadeni.REZERVOVANE) {
                        //System.out.print("R" + "  ");
                    //}else {
                        //System.out.print("O" + "  ");
                }
            }
        }
    }
    
    
    public void kupListok(int i, int j) { //obsadi nam miesto
        if(this.tribuna[i][j].getTypObsadenia() == TypyObsadeni.VOLNE) {
            this.tribuna[i][j].setTypObsadenia(TypyObsadeni.OBSADENE);
            System.out.println("Uspesne ste si zakupili listok!"+ "\n" + "Vase miesto je " + i + " " + j);
        }else {
            System.out.println("Obsadene miesto, vyberte si prosim ine.");
            
            
        }
    }
    
    public void RezervujListok(int i, int j ) {
        if(this.tribuna[i][j].getTypObsadenia() == TypyObsadeni.VOLNE) {
            this.tribuna[i][j].setTypObsadenia(TypyObsadeni.REZERVOVANE);
            System.out.println("Uspesne ste si rezervovali listok!" + "\n" + "Vase miesto je " + i + " " + j); 
        }else {
            System.out.println("Obsadene miesto, vyberte si prosim ine.");
        }
    }
    
    public int getMiestoCena(int i, int j) {
        return tribuna[i][j].getCena();
    }
    
    
     


}
