
package chapter5.exercises.exercise10;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

public class Exercise10 {
    public static void factorial(){
    
    }
    
    public static void main(String[] args){
        String className="";
        try{
            Class<?> cl = Class.forName(className);
        }catch(ClassNotFoundException ex){
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ex.printStackTrace(new PrintWriter(out));
            String description = out.toString();
            System.out.print(description);
            System.out.print(out);
        }
        
    }
}
