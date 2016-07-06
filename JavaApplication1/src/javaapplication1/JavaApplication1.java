/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author RATHRAVI
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        double FTemp;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter temp in Fahrenheit");
        String inTemp = in.nextLine();
        
        FTemp = Double.valueOf(inTemp);
        double CTemp = 5 * (FTemp - 32) / 9;
        
        System.out.println(CTemp);
        /*yo*/
    }
    
}
