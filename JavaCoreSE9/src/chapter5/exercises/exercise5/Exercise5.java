
package chapter5.exercises.exercise5;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class Exercise5 {
    public static void main(String[] args){
        ArrayList<String> lines = new ArrayList<>();
        String name="";
        try{
            PrintWriter out = new PrintWriter(name);
            for(String line: lines){
                out.println(line.toLowerCase());
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }finally {
            //out.close();
    }
}
}