package main;

import classes.Impar;
import classes.Numero;
import classes.Par;
import java.util.ArrayList;
/**
 *
 * @author lczaikowski
 */
public class Principal {

    public static void main(String[] args) {
        
        ArrayList<Impar> NumImp = new  ArrayList<>();
        ArrayList<Par> NumPar = new  ArrayList<>();
        ArrayList<Numero> NumAmbos = new  ArrayList<>();
        
        NumImp.add(new Impar(7));
        NumImp.add(new Impar(91));
        NumPar.add(new Par(8));
        NumPar.add(new Par(534));
        NumAmbos.add(new Impar(765));
        NumAmbos.add(new Impar(35));
        NumAmbos.add(new Par(542));
        
        NumImp.forEach((i) -> {
            System.out.println(i);
        });
        
        NumPar.forEach((p) -> {
            System.out.println(p);
        });
        NumAmbos.forEach((n) -> {
            System.out.println(n);
        });
        
    }
    
}
