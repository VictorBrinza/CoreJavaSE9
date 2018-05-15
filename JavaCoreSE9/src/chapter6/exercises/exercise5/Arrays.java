
package chapter6.exercises.exercise5;

public class Arrays {
    public static <T> T[] swap(int i, int j, T...values){
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }

    public static void main(String[] args){
        Double[] result = Arrays.<Double>swap(0,1,1.5,2.0,1.0);

        for (Double r : result) {
           System.out.println(r);
        }
    }
}
