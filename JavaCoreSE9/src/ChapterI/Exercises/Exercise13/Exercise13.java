
package ChapterI.Exercises.Exercise13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Exercise13 {
    public static void main(String[] args){
        ArrayList<Integer> obj = new ArrayList<Integer>();
        Random ran = new Random();


            for (int i = 0; i < 6; i++) {

                obj.add(ran.nextInt(49) + 1);
            }
            System.out.println(" " + obj);
            System.out.println();

            int k=0;
            for(int j=0;j<6-k;) {

                int n = ran.nextInt(6-k);
                obj.remove(n);
                Collections.sort(obj);
                System.out.println(" " + obj);
                k++;
        }
    }
}
