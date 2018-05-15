
package chapter6.exercises.exercise15;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Exercise15 {

    public static <R, T> List<R> map(List<T> list, Function<T, R> func) {
        List<R> result = new ArrayList<>(list.size());
        for (T e : list) {
            result.add(func.apply(e));
        }
        return result;
    }
}