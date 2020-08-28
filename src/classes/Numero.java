package classes;
/**
 *
 * @author lczaikowski
 */
public class Numero {
    
    private final int n;
    
    public Numero(int n) {
       this.n = n;
    }
    
    @Override
    public String toString() {
     
        if(n % 2 == 0 ){
            return n + "Par";
        }
        
        return n + "Impar";
    }
}
