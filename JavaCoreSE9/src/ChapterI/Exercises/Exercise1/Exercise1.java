
package ChapterI.Exercises.Exercise1;

import java.util.Scanner;


public class Exercise1 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);
        System.out.print("Scrie un numar: ");
        int n = enter.nextInt();
        System.out.println();
        System.out.println("binary: " + Integer.toBinaryString(n));
        System.out.println("octal: " + Integer.toOctalString(n));
        System.out.println("hexazecimal: " + Integer.toHexString(n));
        float m = n;
        System.out.println("hexazecimal floating-point: " + Float.toHexString(m));
    }
}
