
package chapter6.exercises.exercise6;

import java.util.ArrayList;
import java.util.Collection;

public class Exercise6_2<T> {
     public static <T> ArrayList<T> appends(ArrayList<? extends T> ex){
        ArrayList<T> result = new ArrayList<>(); 
        result.addAll((Collection<? extends T>) ex);   
        return result;
    }
    
    public static void main(String[] args){
        ArrayList<? extends Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = appends(list);
        System.out.println(list2);
       
        
        
        
    }
}
