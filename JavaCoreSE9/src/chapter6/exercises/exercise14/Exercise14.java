
package chapter6.exercises.exercise14;

import java.util.List;

public class Exercise14 {
       public static <T extends AutoCloseable> void closeAll(List<T> elems) throws Exception {
        Exception ex = null;
        for (T e : elems) {
            try {
                e.close();
            } catch (Exception exc) {
                ex = new Exception(exc.getMessage(), ex);
            }
        }
        if (ex != null) {
            throw ex;
        }
    }
}
