/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterIII.Exercises.Exercise10;


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
    
    public static void runTogether(Runnable...tasks) throws InterruptedException{
            class Executor implements Runnable 
		{
			private Runnable[] tasks;
			Executor(Runnable... tasks) { this.tasks = tasks; }
			public void run() 
			{ 
				for (Runnable task : tasks)
					task.run(); 
			}
		}

		Thread thread = new Thread(new Executor(tasks));
		thread.start();
		thread.join();
    }
    public static void runInOrder(Runnable...tasks){
        for (Runnable task : tasks){
		task.run();
        }
    }
    public static void main(String[] args)throws InterruptedException{
        Greeater gr = new Greeater("Ion",1);
        Greeater gr2 = new Greeater("Vasile",2);
        
        //Runnable task = Greeater.createGreeater(gr);
        // new Thread(task).start();
         
        //Runnable task2 = Greeater.createGreeater2(gr2);
        // new Thread(task2).start();
         
        //Greeater.runInOrder(task,task2);
        //Greeater.runTogether(task,task2);
        
        class InnerRunnable implements Runnable{       
                        String target;
			int n;
			InnerRunnable(String target, int n) { 
                            this.target = target;
                            this.n = n; 
                        }
			public void run() {
                            for(int i=0; i<this.n; i++){
                                System.out.println("Hello ," +target);
                            }
                        }
		}

		runTogether(new InnerRunnable("Ion",3),
				    new InnerRunnable("Vasile",2));

		runInOrder(new InnerRunnable("Mihai",4),
				   new InnerRunnable("Denis",5));
    }
    
}
