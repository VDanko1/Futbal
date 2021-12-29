import java.util.Random;
public enum TypyObsadeni
{
    OBSADENE,
    VOLNE,
    REZERVOVANE;  

    public static TypyObsadeni vygenerujNahodu() {
    Random nahoda = new Random();
    int nahodnaHodnota = nahoda.nextInt(3);
        
    if(nahodnaHodnota == 0 ) {
        return OBSADENE;
    }else if(nahodnaHodnota == 1) {
        return REZERVOVANE;
    }
    return VOLNE;
    }
    
} 
    

