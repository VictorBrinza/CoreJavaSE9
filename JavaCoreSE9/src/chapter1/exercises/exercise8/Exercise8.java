
package chapter1.exercises.exercise8;


public class Exercise8 {
    public static void main(String args[])  {
        String msg = "elimina toate spatiile din sir !";
        String msg2 = msg.replaceAll(" ","");
        System.out.println(msg2);
        System.out.println();
        String[] msg3 = msg.split(" ");
        for(int i=0; i<msg3.length;i++){
            System.out.println(msg3[i]);
        }

    }
}
