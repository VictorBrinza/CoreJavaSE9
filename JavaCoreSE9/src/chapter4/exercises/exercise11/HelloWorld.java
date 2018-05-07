
package chapter4.exercises.exercise11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class HelloWorld {
    public static void main(String[] args) throws Exception{     
 
        String hw ="Hello, world";  
        String className = "java.lang.System";
        Class<?> cl = Class.forName(className);
        System.out.println(cl);
        Object obj = cl.newInstance();
        System.out.println(obj);
        Field d = obj.getClass().getField("out");
        d.set(obj, hw);
        Class<?>  s = d.getType();
        Method m = s.getClass().getMethod("println",  null);
        m.invoke(null,hw);

    }

}