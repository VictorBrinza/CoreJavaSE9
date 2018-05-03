
package chapter2.exercises.exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomNumbers {
    public static int randomElement(int[] array) {
    if(array.length==0){
        return 0;
    }else{
        int rnd = new Random().nextInt(array.length);
       return array[rnd]; 
        }
    }
    
    public static int randomElement(List<Integer> givenList) {
    Random rad = new Random();
    if(givenList.isEmpty()){
        return  0;
    }else{
        int randomElement = givenList.get(rad.nextInt(givenList.size()));
        return randomElement;
    }
    
    }
    public static void main(String[] args){
        int[] tab ={9,2,4,5,8};
        System.out.println("Elementul generat aleator este: "+randomElement(tab));
        
        
        List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(8);
        System.out.println("Elementul generat aleator este: "+randomElement(list));
        
    }
}
