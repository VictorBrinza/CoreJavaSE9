
package chapter3.exercises.exercise16;

import java.util.Random;

public class IntSequence{
    private static class RandomSequence{
            Random generator = new Random();
            int length;
            int range;
            
            
            public void generateRandomSequence(int length, int range){
            for(int i=0;i<length;i++){
                System.out.println(generator.nextInt(range));
            }

        }
    }
    
    public static void main(String[] args){
        IntSequence.RandomSequence rs =new IntSequence.RandomSequence();
        rs.generateRandomSequence(10,100);
    }
    
}
