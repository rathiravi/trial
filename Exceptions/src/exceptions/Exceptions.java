/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;
import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;
/**
 *
 * @author RATHRAVI
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner fileInput = new Scanner(System.in);
        
        File inFile = null;
        File outFile = null;
        FileChannel in = null;
        FileChannel out = null;
        
        String userFile;
        boolean tryAgain = true;
        while(tryAgain){
            try{
                tryAgain = false;
                System.out.println("Enter input file");
                userFile = fileInput.nextLine();
                inFile = new File(userFile);
                in = new FileInputStream(inFile).getChannel();
            }catch(Exception e){
                System.out.println("Exception 1: " + e.getMessage());
//                e.printStackTrace();
                tryAgain = true;
            }
        }
        try{
            System.out.println("Enter output file");
            userFile = fileInput.nextLine();
            outFile = new File(userFile);
            outFile.createNewFile();
            out = new FileOutputStream(outFile).getChannel();
            in.transferTo(0,inFile.length(),out);
        }catch(IOException e){
            System.out.println("Exception 2: " + e.getMessage());
            e.printStackTrace();
        } finally {
            close(in);
            close(out);
        }      
    }
    public static void close(Closeable stream){
        try{
            if(stream != null)
                stream.close();
        }catch(IOException e){
            System.out.println("Exception 3: " + e.getMessage());
        }
    }
}
