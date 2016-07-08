/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabootcampday2zeller;
import java.util.Scanner;
/**
 *
 * @author RATHRAVI
 */
public class JavaBootcampDay2Zeller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        boolean timeToQuit = false;
        
        System.out.println("Enter quit if quit else any key");
        String inCmd = in.nextLine();
        timeToQuit = "quit".equalsIgnoreCase(inCmd);
            
        final String[] DAY_OF_WEEK = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
                    
        while(!timeToQuit){
            System.out.print("Enter the year (e.g., 2002): ");             
            int year = in.nextInt();

            System.out.print("Enter the month 1-12: ");  
            int month = in.nextInt();

            System.out.print("Enter the day 1-31: ");  
            int day = in.nextInt();

            if(month == 1 || month ==2){
                month += 12;
                year = year -1;
            }

            int a = ((13*(month + 1)) / 5);
            int b = year / 4;
            int j = year / 100;
            int c = 6*j;
            int d = year / 400;
            int sum = a + b + c + d + year + day;
            int rem = sum % 7;

            System.out.println("Day of the week is: " + DAY_OF_WEEK[rem]);

            System.out.println("Enter quit if quit else any key");
            inCmd = in.nextLine();
            timeToQuit = "quit".equalsIgnoreCase(inCmd);
        }
        System.out.println("Bye");
    }
    
}
