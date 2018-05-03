
package chapter1.exercises.exercise6;

import java.math.BigInteger;

public class Exercise6 {
    public static BigInteger factorial(int number) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = number; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args){
        int n=1000;
        System.out.println("Factorialulul lui " + n +" este: " + factorial(n));

    }
}
