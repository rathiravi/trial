/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author rathravi
 */


class inValid extends Exception{
    public inValid(){
    System.out.println("in valid fields!");
    }
}

class Target{
    
    void Target(){
        
    }
    
    private int FieldA;
    private String FieldB, FieldC;
    private float FieldD, FieldE;
    
    private void isValid() throws inValid{
        
        
        try{
            if(FieldA == 0 || (FieldB == FieldC) || (FieldD <= FieldE)){
                throw new inValid();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static class targetBuilder{
        private int FieldA;
        private String FieldB, FieldC;
        private float FieldD, FieldE;
        private Target t;
        
        public targetBuilder FieldA(int A){
            this.FieldA = A;
            return this;
        };
        public targetBuilder FieldB(String B){
            this.FieldB = B;
            return this;
        };
        public targetBuilder FieldC(String C){
            this.FieldC = C;
            return this;
        };
        public targetBuilder FieldD(float D){
            this.FieldD = D;
            return this;
        };
        public targetBuilder FieldE(float E){
            this.FieldE = E;
            return this;
        };
        public Target build() throws inValid{
            t = new Target(this);
            t.isValid();
            return t;
        }
        public static targetBuilder factoryBuilder(){
            return new targetBuilder();
        }
    }
    private Target(targetBuilder b) {
        this.FieldA = b.FieldA;
        this.FieldB = b.FieldB;
        this.FieldC = b.FieldC;
        this.FieldD = b.FieldD;
        this.FieldE = b.FieldE;
    }
}

public class Builder {

    /**
     * @param args the command line arguments
     */
//    private Target t;
//    Builder(){t = new Target();}
//    public void FieldA(int A){};
//    public void FieldB(String B){};
//    public void FieldC(String C){};
//    public void FieldD(float D){};
//    public void FieldE(float E){};
//    public void build() throws inValid{
//        t.isValid();
//    }
//    
//    public static Builder factoryBuilder(){
//        return new Builder();
//    }
    
    public static void main(String[] args) throws inValid {
        // TODO code application logic here
        Target.targetBuilder t = Target.targetBuilder.factoryBuilder();
        t.FieldA(10).FieldB("hi").FieldC("we").FieldD(10.2f).FieldE(4.2f).build();
        t.FieldA(10).FieldB("hi").FieldC("we").FieldD(1.2f).FieldE(4.2f).build();
        t.FieldA(10).FieldB("hi").FieldC("we").FieldD(0.2f).FieldE(4.2f).build();
        
    }
    
}


