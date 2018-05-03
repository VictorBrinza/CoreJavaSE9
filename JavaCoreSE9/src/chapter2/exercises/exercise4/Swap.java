
package chapter2.exercises.exercise4;


import jdk.nashorn.internal.runtime.regexp.joni.encoding.IntHolder;


public class Swap {
    
    public static void swap(Integer aArg, Integer bArg){
        Integer temp = aArg;
        aArg = bArg;
        bArg = temp;
    }
    
    public static void swapHolder(IntHolder aArg, IntHolder bArg){
        int temp = aArg.value;
        aArg.value = bArg.value;
        bArg.value = temp;
    }
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        swap(a, b);
        System.out.println("a : " + a + ", b : " + b);
        
        IntHolder intHolder = new IntHolder();
        IntHolder intHolder2 = new IntHolder();
        intHolder.value=10;
        intHolder2.value=20;
        swapHolder(intHolder,intHolder2);
        System.out.println("intHolder: " +intHolder.value + "  intHolder2: " +intHolder2.value);
        
    }
}
