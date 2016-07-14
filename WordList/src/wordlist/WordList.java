/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordlist;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.*;
import java.util.TreeSet;
import java.util.Iterator;
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
        TreeSet<String> a = new TreeSet<String>();
        try {

                String sCurrentLine;

                br = new BufferedReader(new FileReader("C:\\Users\\rathravi\\Documents\\NetBeansProjects\\trial\\WordList\\pg1342.txt"));

                while ((sCurrentLine = br.readLine()) != null) {
                        String[] s = sCurrentLine.split("\\W+");
                        for(int i = 0; i<s.length; i++){
                            a.add(s[i]);
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
        Iterator it1 =a.iterator();
 
        while(it1.hasNext()){
            Object o1 = it1.next();
            System.out.println(o1);
        }
    }
    
}
