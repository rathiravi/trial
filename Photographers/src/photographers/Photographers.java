/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographers;

/**
 *
 * @author rathravi
 */
public class Photographers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Photographer[] obj = {
            new parentCamera(),
            new trafficCamera(),
            new spyCamera()
        };
        for(int i=0; i<obj.length;i++){
            obj[i].prepareScene();
            System.out.println(obj[i].takePhotograph());
        }
    }
    
}
interface Photographer{
    void prepareScene();
    String takePhotograph();
}

class parentCamera implements Photographer{
    public void prepareScene(){
        System.out.println("Cheese kids!");
    }
    public String takePhotograph(){
        return "Playful kids diving in the pool";
    }
}

class trafficCamera implements Photographer{
    public void prepareScene(){
        System.out.println("Go slow");
    }
    public String takePhotograph(){
        return "Speeding car";
    }
    
}

class spyCamera implements Photographer{
    public void prepareScene(){
        System.out.println("Aha I know the secret");
    }
    public String takePhotograph(){
        return "The enemies are drawing a plan";
    }
    
}