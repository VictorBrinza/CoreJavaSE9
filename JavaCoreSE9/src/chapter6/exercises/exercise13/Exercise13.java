
package chapter6.exercises.exercise13;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Exercise13 {

     public static <T> void minmax(List<T> elements,Comparator<? super T> comp,List<? super T> result) {
        result.add(Collections.min(elements, comp));
        result.add(Collections.max(elements, comp));
    }
    public static <T> void maxmin(List<T> elements, Comparator<?  super T> comp, List<? super T> result){
        minmax(elements,comp,result);
        //Lists.swapHelper(result,0,1);
        //Lists.<T>swapHelper(result,0,1);
    }
   
}
