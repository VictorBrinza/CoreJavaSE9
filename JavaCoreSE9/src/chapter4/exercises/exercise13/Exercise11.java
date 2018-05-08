
package chapter4.exercises.exercise13;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Exercise11 {
    public static void main(String[] args){
        Object ex = new Object();
        Method[] cl = ex.getClass().getMethods();
        
       
        for(Method m: cl){
            System.out.println(Modifier.toString(m.getModifiers())+ " " +Arrays.toString(m.getParameters()));
        }
    }
}
