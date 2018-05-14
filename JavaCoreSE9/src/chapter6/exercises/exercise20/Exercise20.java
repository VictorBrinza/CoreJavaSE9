
package chapter6.exercises.exercise20;

public class Exercise20 {
     @SafeVarargs
    public static final <T> T[] repeat(int n, T... objs) {
        @SuppressWarnings("unchecked") T[] result = (T[]) java.lang.reflect.Array.newInstance(
                        objs.getClass().getComponentType(), n * objs.length);
        for (int i = 0; i < n; i++){ 
            System.arraycopy(objs, 0, result, i * objs.length, objs.length);
        }
        return result;
    }
    
    public static void main(String[] args){
        Integer i = 1;
        Integer i2 = 2;
        Integer i3 = 3;
        Integer i4 = 4;
        Integer i5 = 5;
        Integer[] arr = repeat(2,i,i2,i3,i4,i5);
         for (Integer a : arr) {
             System.out.print(a+" ");
         }
    }
}
