import java.util.Random;
public class Miesto
{
    
    private int cena;
    private Divak divak;
    private TypyObsadeni typObsadenia;
    private Random generator;
    


    /**
     * Konštruktory objektov triedy Miesto.
     */
    public Miesto()
    {
        this.generator = new Random();
        this.cena = generator.nextInt(10) + 10;
        this.typObsadenia = TypyObsadeni.vygenerujNahodu();
        this.divak = new Divak();
    }
    

    public TypyObsadeni getTypObsadenia() {
        return this.typObsadenia;
    }
    
    public void setTypObsadenia(TypyObsadeni typObsadenia) {
        this.typObsadenia = typObsadenia;
    }
    
    public int getCena() {
        return this.cena;
    }
    
    
    
    


    
}
