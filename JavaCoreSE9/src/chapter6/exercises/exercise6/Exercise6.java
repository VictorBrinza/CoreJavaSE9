
package chapter6.exercises.exercise6;

import java.util.ArrayList;
import java.util.Collection;


public class Exercise6<T> {
    
    public static <T> ArrayList<T> appends(ArrayList<? super T> ex){
        ArrayList<T> result = new ArrayList<>(); 
        result.addAll((Collection<T>) ex);   
        return result;
    }
    
    public static void main(String[] args){
        ArrayList<? super Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        ArrayList<? super Integer> list2 = appends(list);
        System.out.println(list2);
       
        
        
        
    }

}
