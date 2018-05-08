
package chapter5.exercises.exercise4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Exercise4 {
    public static ArrayList<Double> readValues(String filename) throws FileNotFoundException {
        Scanner numFile = new Scanner(new File(filename));
        if(filename == null)System.err. println (" Fisierul nu a fost gasit !");
        ArrayList<Double> list = new ArrayList<>();
        while (numFile.hasNextLine()) {
        String line = numFile.nextLine();
        Scanner sc = new Scanner(line);
        sc.useDelimiter(" ");
        while(sc.hasNext()) {
            if(!sc.hasNextDouble())System.err. println (" Datele introduse nu sunt corecte !");
            list.add(sc.nextDouble());
        }
            sc.close();
        }
            numFile.close();
    return list;
    }
    
    public static double sumOfValues(String filename) throws FileNotFoundException, IOException{
        BufferedWriter writer = null;
        double sum=0;
        ArrayList<Double> list;
        list = readValues(filename);
        if(filename == null)System.err. println (" Fisierul nu a fost gasit !");
        for(double value:list){
            sum+=value;
        }
        File newFile = new File(filename);
        writer = new BufferedWriter(new FileWriter(newFile));
        newFile.createNewFile();
        newFile.mkdir();
        String sUm=""+sum;  
        writer.write(sUm);
        if(writer == null)System.err.println(" Eroare la scriere din fisier !");
         writer.close();
        return sum;
        
    }

    public static void main(String[] args)throws FileNotFoundException, InputMismatchException, IOException{   
        String nume="D:\\vb\\CoreJavaSE9\\JavaCoreSE9\\src\\chapter5\\exercises\\exercise1\\test.txt";
        ArrayList<Double> input;
        double s=0;
            input = readValues(nume);
            s=sumOfValues(nume);
            System.out.print(input.toString());
            System.out.println();
            System.out.println("Suma lor: "+s);

    }
}
