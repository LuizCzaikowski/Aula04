package classes;
/**
 *
 * @author lczaikowski
 */
public class Impar extends Numero{
    
    private int impar ;
    
    public Impar(int n) {
        super(n);
    }

    public int getImpar() {
        return impar;
    }
    
    @Override
    public String toString() {
        return "Impar, nº " + super.toString();
    }
}
