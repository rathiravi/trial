/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordlist;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Map;
/**
 *
 * @author rathravi
 */
public class WordList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BufferedReader br = null;
        int count = 0;
        Map<String,Integer> a = new HashMap<>();
        try {

                String sCurrentLine;

                br = new BufferedReader(new FileReader("C:\\Users\\rathravi\\Documents\\NetBeansProjects\\trial\\WordList\\pg1342.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                        String[] s = sCurrentLine.split("\\W+");
                        for(String str: s){
                            str = str.toLowerCase();
                            if(a.containsKey(str)){
                            a.put(str,a.get(str)+1);
                            }else{
                            a.put(str,1);
                            }
                        }
//                                System.out.println(s[0]);
                }

        } catch (IOException e) {
                e.printStackTrace();
        } finally {
                try {
                        if (br != null)br.close();
                } catch (IOException ex) {
                        ex.printStackTrace();
                }
        }
       Iterator iterator = a.keySet().iterator();
  
        while (iterator.hasNext()) {
           String key = iterator.next().toString();
           String value = a.get(key).toString();

           System.out.println("Word "+key + " occurs " + value + " times");
        }


    }
    
}
