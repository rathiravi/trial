/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casinomachine;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author RATHRAVI
 */

enum Type {BAR, MEDAL, COIN, TRIPLEBAR, CHERRY};
public class CasinoMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int spin1 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
        int spin2 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
        int spin3 = ThreadLocalRandom.current().nextInt(0, 4 + 1);
        System.out.println(Type.values()[spin1] + " : " + Type.values()[spin2] + " : " + Type.values()[spin3]);
        
    }
    
}
