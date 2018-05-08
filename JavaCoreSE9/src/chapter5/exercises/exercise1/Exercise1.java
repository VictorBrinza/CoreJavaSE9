
package chapter5.exercises.exercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    
    public static ArrayList<Double> citesteFisier(String filename) throws FileNotFoundException, IOException, InputMismatchException {
        Scanner numFile = new Scanner(new File(filename));
        ArrayList<Double> list = new ArrayList<Double>();
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

    public static void main(String[] args){   
        String nume="D:\\vb\\CoreJavaSE9\\JavaCoreSE9\\src\\chapter5\\exercises\\exercise1\\test.txt";
        ArrayList<Double> input = new ArrayList<>();
        try {
            input = citesteFisier(nume);
            System.out.print(input.toString());
        }catch(FileNotFoundException e){
            System.err. println (" Fisierul nu a fost gasit !");
            System.err.println(" Exceptie : " + e);
        }catch(IOException e) {
            System.out.println(" Eroare la citirea din fisier !");
            e.printStackTrace();
        }catch(InputMismatchException e){
            System.err. println (" Datele introduse nu sunt corecte !");
            System.err.println(" Exceptie : " + e);
        }
    }
    
}