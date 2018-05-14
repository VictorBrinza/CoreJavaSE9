
package chapter6.exercises.exercise21;

import java.util.Collections;



    public class Arrays {
        @SafeVarargs
        public static <T> T[] construct(int size, T... emptyValue) {
            return Collections.nCopies(size, null).toArray(emptyValue);
        }
        
        public static void main(String[] args){
            String i1 = "1";
            String i2 = "2";
            
            String[] arr = construct(4,i1,i2);
            for (String a : arr) {
             System.out.print(a+" ");
         }
        }
    }

