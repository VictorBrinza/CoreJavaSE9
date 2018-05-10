
package chapter5.exercises.exercise5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Exercise5 {
    public static void main(String[] args){
        ArrayList<String> lines = new ArrayList<>();
        String name="D:\\vb\\CoreJavaSE9\\JavaCoreSE9\\src\\chapter5\\exercises\\exercise5\\words.txt";
        Scanner in = null; 
        PrintWriter out = null;
        try{
            in = new Scanner(Paths.get(name));
            out  = new PrintWriter("output.txt");
            while(in.hasNext()){
                out.println(in.next().toLowerCase());
            }
        }catch(FileNotFoundException e){
            System.err.println("FileNotFoundException "+e);
        }catch(IOException e){
            System.err.println("IOException "+e);
        }catch(NullPointerException e){
            System.err.println("NullPointerException "+e);
        }catch(NoSuchElementException e){
            System.err.println("NoSuchElementException "+e);
        }finally{
              if(in != null){
            in.close();
            }
        if(out != null){
            out.close(); 
            }
        }    
    }
}
