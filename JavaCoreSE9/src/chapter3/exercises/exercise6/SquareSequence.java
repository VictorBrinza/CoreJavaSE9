
package chapter3.exercises.exercise6;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SquareSequence implements Sequence<SquareSequence>{

    protected  List seq1;     
    protected  int n; 
     
    @Override
    public int next() {
         n++;
       return n*n;
    }

    public static Runnable createSquareSequence() {
          Runnable task = ()->{ 
               List seq1 = new ArrayList();
               int m =1;
               BigInteger f = new BigInteger("1");
            for (;;) { 
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(SquareSequence.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    seq1.add(f.pow(2).intValue());
                    
                    f = f.add(BigInteger.valueOf(m));
                    System.out.println(seq1);
            }
        };
         
        return task;
    }
      
    
    public static void main(String[] args){
        
        Runnable task = SquareSequence.createSquareSequence();
         new Thread(task).start();


    }

   
    
    
    
    

}
