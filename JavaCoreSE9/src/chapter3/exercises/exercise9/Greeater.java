
package chapter3.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class Greeater implements Runnable {

    private String target;
    private int n;
    
    Greeater(String target, int n){
        this.target=target;
        this.n=n;
    }
    
    @Override
    public void run() {
        for(int i=0; i<this.n; i++){
        System.out.println("Hello ," +target);
        }
    }
    
    public static Runnable createGreeater(Greeater obj1) {
          Runnable task = ()->{ 

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Greeater.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    obj1.run();            
        };
         
        return task;
    }
    
    public static Runnable createGreeater2(Greeater obj1) {
          Runnable task = ()->{ 

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Greeater.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    obj1.run();            
        };
         
        return task;
    }
    
    
    public static void main(String[] args){
        Greeater gr = new Greeater("Ion",2);
        Greeater gr2 = new Greeater("Vasile",3);
        
        Runnable task = Greeater.createGreeater(gr);
         new Thread(task).start();
         
        Runnable task2 = Greeater.createGreeater2(gr2);
         new Thread(task2).start();
    }
    
}
