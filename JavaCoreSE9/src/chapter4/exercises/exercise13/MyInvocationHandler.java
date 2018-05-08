
package chapter4.exercises.exercise13;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {

    private String theString;

    public MyInvocationHandler (String theString) {
    this.theString = theString;
    }

    @Override
    public Object invoke (Object proxy, Method method, Object[] args) throws Throwable {
    System.out.println("before method call : " + method.getName());
    Object result = method.invoke(theString, args);
    System.out.println("after method call : " + method.getName());
    return result;
    }
    
    public static void main (String[] args) {

        MyInvocationHandler handler = new MyInvocationHandler("the example string");

        CharSequence o = (CharSequence) Proxy.newProxyInstance(
                            MyInvocationHandler.class.getClassLoader(),
                            new Class[]{CharSequence.class}, handler);
        System.out.println(o.length());
        System.out.println(o.subSequence(4, 8));
    }

}