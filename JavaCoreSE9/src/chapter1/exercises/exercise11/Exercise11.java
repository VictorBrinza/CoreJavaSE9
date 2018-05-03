
package chapter1.exercises.exercise11;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.println("Scrie un sir pentru a evidentia caracterele care nu sunt ASCII: ");
        String msg = enter.nextLine();
        for (int i = 0; i < msg.length(); i++)
        {
            char ch = msg.charAt(i);
            if (ch >= 128) // non-ascii
            {
                System.out.print(ch + " Unicode value: ");
                System.out.println((int)ch);
            }
        }
        System.out.println();
    }
}
