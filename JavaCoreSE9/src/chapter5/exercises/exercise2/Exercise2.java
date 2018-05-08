
package chapter5.exercises.exercise2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Exercise2 {
    public static ArrayList<Double> readValues(String filename) throws FileNotFoundException, InputMismatchException {
        Scanner numFile = new Scanner(new File(filename));
        ArrayList<Double> list = new ArrayList<>();
        while (numFile.hasNextLine()) {
        String line = numFile.nextLine();
        Scanner sc = new Scanner(line);
        sc.useDelimiter(" ");
        while(sc.hasNext()) {
            list.add(sc.nextDouble());
        }
            sc.close();
        }
            numFile.close();
    return list;
    }
    
    public static double sumOfValues(String filename)throws FileNotFoundException, InputMismatchException, IOException{
        BufferedWriter writer = null;
        double sum=0;
        ArrayList<Double> list;
        list = readValues(filename);
        for(double value:list){
            sum+=value;
        }

        File newFile = new File("D:\\vb\\CoreJavaSE9\\JavaCoreSE9\\src\\chapter5\\exercises\\exercise1", "result.txt");
        writer = new BufferedWriter(new FileWriter(newFile));
        newFile.createNewFile();
        newFile.mkdir();
        String sUm=""+sum;  
        writer.write(sUm);
         writer.close();
        return sum;
        
    }

    public static void main(String[] args){   
        String nume="D:\\vb\\CoreJavaSE9\\JavaCoreSE9\\src\\chapter5\\exercises\\exercise1\\test.txt";
        ArrayList<Double> input;
        double s=0;
        try {
            input = readValues(nume);
            s=sumOfValues(nume);
            System.out.print(input.toString());
            System.out.println();
            System.out.println("Suma lor: "+s);
        }catch(FileNotFoundException e){
            System.err. println (" Fisierul nu a fost gasit !");
            System.err.println(" Exceptie : " + e);
            }catch(IOException e) {
            System.out.println(" Eroare la citirea din fisier !");
            System.err.println(" Exceptie : " + e);
        }catch(InputMismatchException e){
            System.err. println (" Datele introduse nu sunt corecte !");
            System.err.println(" Exceptie : " + e);
        }
    }
}
