/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions2;

import java.util.Scanner;

/**
 *
 * @author rathravi
 */

class BadMonth extends Exception{
    public BadMonth(){
        System.out.println("Invalid Month");
    }
}

class BadDay extends Exception{
    public BadDay(){
        System.out.println("Invalid Day");
    }
}

enum Months {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};

public class Exceptions2 {

    static int numDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    /**
     * @param s
     * @param args the command line arguments
     */
     public static void convert(String s, int i) throws BadMonth, BadDay{
        int monthNum;
         try {
            monthNum = Months.valueOf(s).ordinal();
//            System.out.println(Months.valueOf(s) + " " + numDays[monthNum]);
        }catch(Exception e){
            throw new BadMonth();
        }
        if(numDays[monthNum] < i){
            throw new BadDay();
        }else{
            System.out.println("Valid Month and Day");
        }
        
        
    }
    
    public static void main(String[] args) throws BadMonth,BadDay{
        Scanner in = new Scanner(System.in);
        
        while(true){
            System.out.println("Enter Month or to quit enter Quit");
            String month = in.nextLine();
            if("quit".equalsIgnoreCase(month))
                break;
            System.out.println("Enter day");
            String sDay = in.nextLine();
            int day = Integer.parseInt(sDay);
            
            try{
                convert(month,day);
            }catch(Exception e){
                System.out.println(e);
            }
    }

        }
            
   
}

