/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comluizczaikowski;

/**
 *
 * @author lczaikowski
 */
public class ComLuizCzaikowski {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 10;  //teste
        
        for(int i = 0; i< args.length; i++){
            num += Integer.parseInt(args[i]);
        }
        
        System.out.println(num);
        
    }
    
}
