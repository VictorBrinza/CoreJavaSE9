
package chapter5.exercises.exercise6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Exercise6 {
    public static void main(String[] args){
        BufferedReader in =null;
         Path path = Paths.get("D:\\vb\\CoreJavaSE9\\JavaCoreSE9\\src\\chapter5\\exercises\\exercise6\\test.txt");
        try{
            in = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        }catch(IOException e){
                System.err.println("IOException"+e);
            }finally{
            try{
                if(in != null){
                    in.close();
                }
            }catch(IOException e){
                System.err.println("IOException"+e);        
                }
        }
    }
}
