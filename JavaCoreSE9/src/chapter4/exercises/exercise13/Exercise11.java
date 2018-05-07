
package chapter4.exercises.exercise13;

import java.lang.reflect.Method;

public class Exercise11 {
    public static void main(String[] args){
        Exercise11 ex = new Exercise11();
        Method[] cl = ex.getClass().getMethods();
        
       
        for(Method m: cl){
            //if(m.getDeclaringClass())
            System.out.println(m);
        }
    }
}
