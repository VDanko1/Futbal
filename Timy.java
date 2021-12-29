
import java.util.Random;
public class Timy
{
    private Random random;
    private String nazov;
    private int body;
    private String specialnyHrac;
    
    public Timy()
    {
        this.random = new Random();
        this.nazov = this.dnesHrajuTimy(this.random.nextInt(9));
        this.body = 0;
        this.specialnyHrac = this.specialnyHrac(this.random.nextInt(9));
        
    }

    public void pridajBody(int i)
    {
        this.body += i;
    }
    
    public int getBody() {
        return this.body;
    }
    
    public String getNazov() {
        return this.nazov;
    }
    
    public String getSpecialnyHrac() {
        return this.specialnyHrac;
    }
    
    public String dnesHrajuTimy(int i) {
        switch (i) {
            case 0:
                return "Manchester United";        
            case 1:
                return "FK Zarnovica";
            case 2:
                return "FK Zilina";
            case 3:
                return "FK Pohronie";
            case 4:
                return "AC Milano";
            case 5: 
                return "FK Uganda";
            case 6: 
                return "Barcelona";
            case 7: 
                return "FK FRI Uniza";
            case 8: 
                return "AS Roma";
            case 9: 
                return "Real Madrid";
            
        }
        return "Spatne Cislo";
    }
    
    public String specialnyHrac(int i ) {
        switch (i) {
            case 0:
                return "Mauro Icardi";        
            case 1:
                return "Jozef Oslanec";
            case 2:
                return "Marek Hamšík";
            case 3:
                return "Adam Nemec";
            case 4:
                return "Sadio Mane";
            case 5: 
                return "Robert Lewandowski";
            case 6: 
                return "Karim Benzema";
            case 7: 
                return "Martin Škrtel";
            case 8: 
                return "Lionel Messi";
            case 9: 
                return "Vladimir Danko";
        }
        return "Spatny index";
    }
    
}
