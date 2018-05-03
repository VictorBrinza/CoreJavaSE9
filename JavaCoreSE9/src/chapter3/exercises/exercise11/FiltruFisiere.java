
package chapter3.exercises.exercise11;

import java.io.File;

import java.io.FilenameFilter;


public class FiltruFisiere implements FilenameFilter{

    String extensie ;
    
    FiltruFisiere ( String extensie ) {
        this.extensie = extensie ;
    }
    
    @Override
    public boolean accept(File dir , String nume) {
        return ( nume.endsWith("." + extensie ) );
    }
    
    
    public static File[] subDirectory(File f){
         File[] paths;
         FilenameFilter fileNameFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
               if(f.isDirectory()){
                  String str = name;
                  if(!str.equals(".")) {
                     return true;
                  }
               } 
               return false;
            }
         };
         return paths = f.listFiles(fileNameFilter);
    }
    
    public static void main (String[] args){
        File f = new File("D:\\vb\\CoreJavaSE9\\JavaCoreSE9");
        File[] directory;
        directory = subDirectory(f);
        
        for(File path:directory) { 
            System.out.println(path);
         }
      
    }
}
