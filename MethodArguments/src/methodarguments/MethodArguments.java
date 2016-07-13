/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodarguments;

/**
 *
 * @author RATHRAVI
 */
public class MethodArguments {

    /**
     * @param args the command line arguments
     */
    
    public static int addUp(int... l){
        System.out.println("Executing int addition");
        int sum = 0;
        if(l.length == 0 || l.length ==1)
            sum = 0;
        else{
            for (int i = 0; i<l.length; i++){
                sum += l[i];
            }
        }
        return sum;
    }
    
    public static double addUp(double... l){
        System.out.println("Executing double addition");
        double sum = 0;
        if(l.length == 0 || l.length ==1)
            sum = 0;
        else{
            for (int i = 0; i<l.length; i++){
                sum += l[i];
            }
        }
        return sum;
    }
    
    public static int addUp(String... l){
        System.out.println("Executing double addition");
        int sum = 0;
        if(l.length == 0 || l.length ==1)
            sum = 0;
        else{
            for (int i = 0; i<l.length; i++){
                sum += toNumber(l[i]);
            }
        }
        return sum;
    }
    
    static String numString[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",};

    public static int toNumber(String numText){
        for(int i = 0; i< numString.length; i++){
            if(numString[i].equals(numText))
                return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        // TODO code application logic here
//        String arguments[] = {"one","three"};
//        System.out.println(addUp(arguments)); 
        System.out.println(addUp(1, 4));
        System.out.println(addUp("one", "three"));
        System.out.println(addUp(2, 3.5));
//        System.out.println(addUp(1, "three"));


//        public static int addUp(int i, int j){
//        System.out.println("Executing int addition");
//        return i+j;
//    }
//    
//    public static double addUp(double i, double j){
//        System.out.println("Executing double addition");
//        return i+j;
//    }
//    
//    public static int addUp(String i, String j){
//        System.out.println("Executing double addition");
//        return (toNumber(i) + toNumber(j));
//    }
    
    
    }
    
}
