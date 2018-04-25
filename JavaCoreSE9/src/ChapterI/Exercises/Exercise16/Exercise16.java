
package ChapterI.Exercises.Exercise16;

import java.util.Scanner;

public class Exercise16 {
    public static double average(double... values){
        double sum =0;
        for(double v:values ) sum +=v;
        return values.length==0?0:sum/values.length;
    }

    public static double average(double[] tabel,int dim){
        double sum=0;
        for(int i=0;i<dim;i++){
            sum+=tabel[i];
        }

        return sum/dim;
    }
    public static void main(String[] args ){
        System.out.print("Scrie dimensiunea tabelului: ");
        Scanner enter = new Scanner(System.in);
        int n=enter.nextInt();
        double[] test= new double[n];
        for(int i=0;i<n;i++){
            System.out.print("["+i+"]= ");
            test[i] = enter.nextDouble();
        }

        System.out.println( +average(test,n));
        System.out.println( +average(test));

    }
}
