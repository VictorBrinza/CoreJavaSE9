
package chapter4.exercises.exercise10;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args){
      int[] array ={1,2,3,4};
      Class<?> cl = array.getClass();
      while(cl != null){
          for(Method m : cl.getDeclaredMethods()){
              System.out.println(m.getModifiers()+ " "+ m.getReturnType()+ " "+m.getName()+ Arrays.toString(m.getParameters()));
          }
          cl = cl.getSuperclass();
      }
      
    }
}
// wrongly: 1 class java.lang.String toString[] must be 1 String java.lang.String toString[]