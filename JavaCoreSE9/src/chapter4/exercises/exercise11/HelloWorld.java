
package chapter4.exercises.exercise11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class HelloWorld {
    public static void main(String[] args) throws Exception{     
 
        Class<?> systemClass = java.lang.Class.forName("java.lang.System");
        Field outField = systemClass.getDeclaredField("out");
        Class<?> printStreamClass = outField.getType();
        Method printlnMethod = printStreamClass.getDeclaredMethod("println", String.class);
        Object object = outField.get(null);
        printlnMethod.invoke(object, "Hello, World");

    }

}
