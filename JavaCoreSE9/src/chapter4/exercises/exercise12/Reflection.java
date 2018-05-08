
package chapter4.exercises.exercise12;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {
    public static void main(String[] args) throws Exception{     
 
        Class<?> systemClass = java.lang.Class.forName("java.lang.System");
        Field outField = systemClass.getDeclaredField("out");
        Class<?> printStreamClass = outField.getType();
        Method printlnMethod = printStreamClass.getDeclaredMethod("println", String.class);
        Object object = outField.get(null);
        String str="";
        for(int i=0;i<7000;i++){
            printlnMethod.invoke(object, str+=i);
        }
    }
}
//31 sec

