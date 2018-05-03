
package chapter3.exercises.exercise12;


import java.io.File;

import java.io.FilenameFilter;


public class FiltruFisiere implements FilenameFilter{

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
    
    public static void main (String[] args){
        File f = new File("D:\\vb\\CoreJavaSE9\\JavaCoreSE9");
        FiltruFisiere ext = new FiltruFisiere("mf");
          
        String[] directory;
        directory = subDirectory2(f,ext);
        
        for(int i=0; i<directory.length;i++) { 
            System.out.println(directory[i]);
         }
        
      
    }
}
