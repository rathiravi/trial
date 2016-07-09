/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weather;
import java.io.BufferedReader;
import java.util.*;
import java.nio.file.*;

/**
 *
 * @author RATHRAVI
 */

class Reading{
    String Day;
    int Hour;
    int Temperature;
    int WindSpeed;
    
    public Reading(String line){
        String[] elements = line.split(", ");
        Day = elements[0];
        Hour = Integer.valueOf(elements[1]);
        Temperature = Integer.valueOf(elements[2]);
        WindSpeed = Integer.valueOf(elements[3]);
    }
    
    public String rateTemperature(){
        final String[] tempRate = {"cold", "mild", "warm", "hot"};
        int i = 3;
        if(Temperature < 55)
            i = 0;
        else if(Temperature <65)
            i = 1;
        else if(Temperature <80)
            i=2;
        return tempRate[i];
    }
    
    public String getTime(){
        final String[] time = {"morning", "afternoon", "evening"};
        int j = 2;
        if(Hour == 9)
            j = 0;
        if(Hour == 15)
            j = 1;
        String dayTime = Day + " " + time[j];
        return dayTime;
    }
}
public class Weather {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Throwable {    
        BufferedReader br = Files.newBufferedReader(
            Paths.get("weather.csvx"));
        Reading[] readings = new Reading[12];
        String line;
        for (int i = 0; i < readings.length; i++) {
            readings[i] = new Reading(br.readLine());
        }
        // remaining code here
        for(int i = 0; i< readings.length; i++){
            String op = readings[i].getTime() + " was " + readings[i].rateTemperature();
            System.out.println(op);
        }
    }
}
