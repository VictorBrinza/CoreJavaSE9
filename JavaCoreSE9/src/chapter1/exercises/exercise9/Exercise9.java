
package chapter1.exercises.exercise9;


public class Exercise9 {
    public static void main(String[] args){
        String m = "  word";
        String sm = m.substring(2,6);
        System.out.println(sm);
        String m2 = "word";
        String m3 = "  word";
        System.out.println("equals for substring: "+sm.equals(m2));
        System.out.print("== for substring: ");
        System.out.println(sm == m2);
        System.out.println("equals for string: "+m.equals(m3));
        System.out.print("== for string: ");
        System.out.println(m == m3);
    }
}
