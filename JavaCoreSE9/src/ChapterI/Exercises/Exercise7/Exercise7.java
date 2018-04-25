
package ChapterI.Exercises.Exercise7;

import java.util.Scanner;


public class Exercise7 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Scrie primul numar: ");
        int n = enter.nextInt();
        System.out.println();
        System.out.print("Scrie al doilea numar: ");
        int n2 = enter.nextInt();
        System.out.println();
        int sum = Math.abs(n+n2);
        int dif = Math.abs(n-n2);
        int pro = Math.abs(n*n2);
        int quo = Math.abs(n/n2);
        int rem = Math.abs(n%n2);
        System.out.println("Suma este: " + sum);
        System.out.println("Diferenta este: " + dif);
        System.out.println("Produsul este: " + pro);
        System.out.println("Citul este: " + quo);
        System.out.println("Restul este: " + rem);
    }
}
