/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listlike;

import java.util.Iterator;

/**
 *
 * @author rathravi
 */
public class ListLike {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Sequence s = new Sequence();
//        assert s.size() == 0;
//        s.add("Hello");
//        s.add("there");
//        assert s.size() == 2;
//        assert s.get(0).equals("Hello");
//        assert s.get(1).equals("there");
//        s.add("done");
//        assert s.size() == 3;
//        assert s.get(0).equals("Hello");
//        assert s.get(1).equals("there");
//        assert s.get(2).equals("done");

        Sequence s = new Sequence(10);
        s.add("Hello");
        s.add("there");
        s.add("done");
        Iterator i1 = s.iterator();
        Iterator i2 = s.iterator();
        assert i1.hasNext();
        assert i1.next().equals("Hello");
        assert i1.hasNext();
        assert i1.next().equals("there");
        assert i2.hasNext();
        assert i2.next().equals("Hello");
        assert i1.hasNext();
        assert i1.next().equals("done");
        assert i1.hasNext() == false;
        assert i2.next().equals("there");
        assert i2.next().equals("done");
        assert i2.hasNext() == false;
        for(Object o:s){System.out.println(o);}
    }
    
}

class Sequence<E> implements Iterable<E>{
    
     public Iterator<E> iterator() {
        return new SequenceIterator<E>();
    }
    public class SequenceIterator <T> implements Iterator<T>{
        
        private int progress  = 0;
        
        @Override
        public boolean hasNext() {
            if(progress < Count)
                return true;
            return false;
           }

        @Override
        public T next() {
            try{
            return (T) Sequence[progress++];
            }catch(Exception e){
            return (T) "You do not have any more storage left";
            }
           }
        public void remove(){
            
        }
        
    }
        int Count = 0;
        String[] Sequence;
        Sequence(int size){
        Sequence = new String[size];
        }
        void add(Object o){
             if(Count<Sequence.length){
             Sequence[Count] = (String) o;
             Count ++;}
        }
        E get(int idx){
            return (E) (String) "hidfuwe";
        }
        int size(){
            return 1;
        }
}
