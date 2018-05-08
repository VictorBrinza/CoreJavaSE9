
package chapter4.exercises.exercise12;


public class Regular {
    public static void printString(){
        String str="";
        for(int i=0;i<7000;i++){
            System.out.println(str+=i);
        }
    }
    
    public static void main(String[] args){
        printString();
    }
}
//34 sec