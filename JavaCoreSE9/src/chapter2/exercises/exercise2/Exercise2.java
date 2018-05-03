
package chapter2.exercises.exercise2;

import java.util.Random;
import java.util.Scanner;


public class Exercise2 {
    public static void main(String[] args){
    
        Scanner enter = new Scanner(System.in);
        System.out.print("Scrie un numar: ");
        int n = enter.nextInt();
        System.out.println("Numarul intordus este: "+n);
        Random random = new Random();
        int r = random.nextInt();
        System.out.println("Numarul generat este: "+r);
        // nextInt does not modify the object on which it operates
        // it is used as a kind of getter method to assign a value
        //accesor mathod
        
        //from the javadoc
        //public int nextInt(int radix)
        //Scans the next token of the input as an int. This method will throw InputMismatchException if the 
        //next token cannot be translated into a valid int value as described below. If the translation is 
        //successful, the scanner advances past the input that matched.
        //This tells that the state of the scanner is altered after calling the method. So this makes nextInt a mutator.
    }
}
