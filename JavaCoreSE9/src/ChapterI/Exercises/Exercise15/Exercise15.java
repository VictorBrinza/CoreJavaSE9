
package ChapterI.Exercises.Exercise15;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> obj = new ArrayList<ArrayList<Integer>>();
        for (ArrayList<Integer> list : obj) {
            for (Integer i : list) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        Scanner enter = new Scanner(System.in);
        System.out.print("Scrie numarul de rinduri: ");
        int maxRows =enter.nextInt();
        int r, num;
        for (int i = 0; i < maxRows; i++) {
            num = 1;
            r = i + 1;
            ArrayList<Integer> inner = new ArrayList<Integer>();
            obj.add(inner);
            for (int col = 0; col <= i; col++) {
                if (col > 0) {
                    num = num * (r - col) / col;
                }
                inner.add(num);
            }
        }

        for (ArrayList<Integer> list : obj) {
            for (Integer i : list) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
