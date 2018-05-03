
package chapter3.exercises.exercise6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class LuckySort implements Comparator<String> {

    
    @Override
     public int compare(String s1, String s2) {
        return s1.length() - s2.length() != 0 ? s1.length() - s2.length() :  new Character(s1.charAt(2)).compareTo(s2.charAt(2));
    }
    
    public void luckySort(ArrayList<String> strings,Comparator<String> comp){
        if(strings!=comp){
            Collections.shuffle(strings);
        }else{
           for(String s:strings){
            System.out.print(s+" ");
        } 
        }
    }
    public static void main(String[] args){
        ArrayList<String> str = new ArrayList<>();
        str.add("unu");
        str.add("doi");
        str.add("trei");
        //Collections.shuffle(str);
        
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.length() - s2.length() != 0 ? s1.length() - s2.length() :  new Character(s1.charAt(2)).compareTo(s2.charAt(2));
            }
        };
        LuckySort ob = new LuckySort();
        ob.luckySort(str,comp);
        
        
        
    }
}
