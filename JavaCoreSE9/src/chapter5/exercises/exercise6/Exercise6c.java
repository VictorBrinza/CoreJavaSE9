
package chapter5.exercises.exercise6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Exercise6c {
    public static void main(String[] args){
        Path path = Paths.get("D:\\vb\\CoreJavaSE9\\JavaCoreSE9\\src\\chapter5\\exercises\\exercise6\\test.txt");
        
        try(BufferedReader in = Files.newBufferedReader(path, StandardCharsets.UTF_8);){
           
        }catch(IOException e){
            System.err.println("IOException"+e);
        }
    
        
    }
}
