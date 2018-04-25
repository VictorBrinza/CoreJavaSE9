
package ChapterI.Exercises.Exercise2;

import java.util.Scanner;

public class Exercise2 {
   public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Scrie un numar: ");
        int x = enter.nextInt();
        int y =x%359;
        if(y<0 || y>359){
            y+=359;
            System.out.println("% operator: "+y);
        }else{
            System.out.println("% operator: "+y);
        }
        System.out.println("floorMod operator: "+Math.floorMod(x,359));

    } 
}
