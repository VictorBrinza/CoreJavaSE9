
package chapter3.exercises.exercise14;


public class RunnableLambda implements Runnable {
    public static void main(String[] args) {
    // Implementing Runnable using Lambda expression
    Runnable runnable2 = () -> {
      System.out.println("Thread name : " + Thread.currentThread().getName());
    };
    Thread thread1 = new Thread(runnable2);
    Thread thread2 = new Thread(runnable2);

    // Start Threads
    thread1.start();
    thread2.start();
 
    }

    @Override
    public void run() {
        System.out.println("Thread name : " + Thread.currentThread().getName());
    }

}
