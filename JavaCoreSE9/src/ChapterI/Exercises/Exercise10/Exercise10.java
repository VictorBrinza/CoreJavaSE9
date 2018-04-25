
package ChapterI.Exercises.Exercise10;

import java.util.Random;


public class Exercise10 {
    public static void main(String[] args){
        Random ran = new Random();
        long n = ran.nextLong();
        System.out.println(Long.toString(n, 36));

    }
}
