
package chapter5.exercises.exercise13;

public class Exercise13 {
    public static int min(int[] values){
        int minValue = values[0];
        for(int i=1;i<values.length;i++){
          if(values[i] < minValue){
                minValue = values[i];
              }
        }
        return minValue;
    }
    
    public static void main(String[] args){
        int[] array = {1,3,-4,-6,-7,9,12};
        int minim = min(array);
        try{
        for(int i=0;i<array.length;i++){
        assert minim<=array[i]:minim;
        }        
        System.out.println("Min= "+minim);
        }catch(AssertionError ex){
            System.out.print(ex);
        }
    }
}
    
   
