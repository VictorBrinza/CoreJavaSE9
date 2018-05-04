
package chapter3.exercises.exercise8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class LuckySort implements Comparator<String> {
    
    @Override
     public int compare(String s1, String s2) {
        return s1.length() - s2.length() != 0 ? s1.length() - s2.length() :  new Character(s1.charAt(2)).compareTo(s2.charAt(2));
    }
    
    public static void luckySort(ArrayList<String> strings){
        List<String> ordering=new ArrayList<>(strings);
        Collections.shuffle(strings);
        strings.sort(Comparator.comparingInt(ordering::indexOf));
        getArray(strings);
    }
    
    public static void luckySort2(ArrayList<String> strings, Comparator<String> comp){
        
        Collections.shuffle(strings);
        strings.sort(comp);
        getArray(strings);
    }
    
    public static void getArray(ArrayList<String> string){
        for(String s:string){
            System.out.print(s+" ");
        } 
    }
    
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("unu");
        str.add("doi");
        str.add("trei");
        //luckySort(str);
        
        List<String> ordering=new ArrayList<>(str);
        Comparator<String> comparingStr = Comparator.comparingInt(ordering::indexOf);
        luckySort2(str,comparingStr);
    }
}
