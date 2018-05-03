
package chapter3.exercises.exercise13;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


public class FiltruFisiere implements FilenameFilter,Comparator{

    String extensie ;
    
    FiltruFisiere ( String extensie ) {
        this.extensie = extensie ;
    }
    
    public String getExtensie(){
        return this.extensie;
    }
    
    @Override
    public boolean accept(File dir , String nume) {
        return ( nume.endsWith("." + extensie ) );
    }
    
    
    public static String[] subDirectory2(File f,FiltruFisiere ext){
        String[] paths;
        paths =  f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                       return name.endsWith("."+ext.getExtensie());
            }
        });
          return paths;
    }
    @Override
    public int compare(Object o1, Object o2) {
        File f1 = (File)o1;
        File f2 = (File)o2;
    return (f1.compareTo(f2));
    }
    
    public static void order(String dirPath){
        File folder = new File(dirPath);
            if(folder.isDirectory()){
                File[] fileList = folder.listFiles();
                Arrays.sort(fileList);
                System.out.println("\nNumarul total de directore: " + fileList.length );
                
                for(File file:fileList){
                    System.out.println(file.getName());
                }

                FileFilter fileFilter = new FileFilter(){
                    @Override
                    public boolean accept(File file) {
                        return !file.isDirectory();
                    }
                };
                fileList = folder.listFiles(fileFilter);

                Arrays.sort(fileList, new Comparator(){
                    @Override
                    public int compare(Object f1, Object f2) {
                        return ((File) f1).getName().compareTo(((File) f2).getName());
                }
            });     
        }
    }
    
    public static void main (String[] args){
        
        //D:\\vb\\CoreJavaSE9
        
        Scanner scanner = new Scanner( System.in );
            System.out.println("Enter the file path: ");
            String path = scanner.nextLine();
            order(path);
            
            

    } 
}
