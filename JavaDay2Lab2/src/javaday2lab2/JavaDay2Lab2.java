/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaday2lab2;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author RATHRAVI
 */
public class JavaDay2Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of data items");
        int num = input.nextInt();

        int array[] = new int[num];

        System.out.println("Enter the " + num + " numbers");

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = input.nextInt();
        }
        System.out.println("These are the numbers you have entered.");
        int n = array.length;

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double mean = sum / array.length;
        
        System.out.println("Mean = " + mean);
        
        Arrays.sort(array);
        System.out.println("minimum: " + array[0]);
       
    }
    
}
