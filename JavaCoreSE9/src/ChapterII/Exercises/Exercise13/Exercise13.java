
package ChapterII.Exercises.Exercise13;

import java.io.File;
import java.lang.Exception;
import java.util.Scanner;


public class Exercise13 {
    public static void main(String[] args) throws Exception{
    String fileName ="opencsv-4.1.jar";
    File file = new File(fileName);
    Scanner inputStream = new Scanner(file);
    while(inputStream.hasNext()){
        String data = inputStream.next();
        System.out.println(data);    
    }
    System.out.print("OpenCSV");
    inputStream.close();
    }
}

