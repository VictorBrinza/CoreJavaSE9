
package chapter1.exercises.exercise14;

import java.util.Scanner;


public class Exercise14 {
    public static void main(String[] args){
        Scanner enter = new Scanner(System.in);

        int n,d=0;

        System.out.print("Scrie nr. dimensiunile patratului: ");
        n=enter.nextInt();

        int[][] tabel = new int[n][n];
        int[] sumR = new int[n];
        int[] sumC = new int[n];
        int[] sumD = new int[2];
        sumD[0] = 0;
        sumD[1] = 0;

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("["+i+"],["+j+"]=");
                tabel[i][j]=enter.nextInt();
                sumR[i] = 0;
                sumC[j] = 0;
            }
            System.out.println();
        }

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                sumR[i]+=tabel[i][j];
                sumC[j]+=tabel[i][j];
                System.out.print(tabel[i][j]+"\t");
            }
            System.out.println();
        }
        for (int i = 0; i < tabel.length; i++) {
            sumD[0] += tabel[i][i];
        }
        int k = tabel.length - 1;
        for ( int j = 0; j < tabel.length; j++) {
            if (k >= 0) {
                sumD[1] += tabel[j][k];
                k--;
            }
        }

        for(int i=0; i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (sumD[0] == sumD[1]) {
                    if (sumR[i] == sumC[j] && sumR[i] == sumD[1] && sumC[j] == sumD[1]) {
                        d = 1;
                    }
                }
            }
        }

        if(d==1){
            System.out.println("It is a magic square !");
        }else{
            System.out.println("Not is a magic square !");
        }

    }
}
