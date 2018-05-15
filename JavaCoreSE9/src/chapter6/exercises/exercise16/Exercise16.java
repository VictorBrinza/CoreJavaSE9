
package chapter6.exercises.exercise16;

import java.util.Collection;
import java.util.List;


public class Exercise16 {
    public static <T extends Comparable<? super T>> void sort(List<T> list){
        
    }
    
    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll){
        return null;
        
    }
}
