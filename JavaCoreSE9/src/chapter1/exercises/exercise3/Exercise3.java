
package chapter1.exercises.exercise3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Scrie primul numar: ");
        int x = enter.nextInt();
        System.out.print("Scrie al doilea numar: ");
        int y = enter.nextInt();
        System.out.print("Scrie al treilea numar: ");
        int z = enter.nextInt();
        int temp,max;
        if(x<y){
            temp=y;
        }else{
            temp=x;
        }
        if(temp<z){
            max=z;
        }else{
            max=temp;
        }
        System.out.println("Max= "+max);
        int max2  =Math.max(x,Math.max(y,z));
        System.out.println("Max with Math.max= "+max2);
    }
}
