
package chapter3.exercises.exercise4;

import java.util.Arrays; 
 
public class IntSequence { 
    protected static int[] seq; 
    protected static int seqStored; 
 
    public IntSequence(int length) { 
        init(length); 
    } 
 
    public IntSequence() { 
        init(1); 
    } 
 
    public IntSequence(IntSequence s) { 
        seq = Arrays.copyOf(s.seq, s.seqStored); 
        seqStored = s.seqStored; 
    } 
 
    public void add(int n) { 
        if (seqStored == seq.length) { 
        realloc(); 
        } 
        seq[seqStored] = n; 
        seqStored++; 
    } 
 
    public static void of(int...n) { 
        
        for(int i=0;i<n.length;i++){
            if (seqStored == seq.length) { 
            realloc(); 
            }
            seq[seqStored] = n[i]; 
            seqStored++; 
        } 
    }
    
    private void init(int length) { 
        seq = new int[length]; 
        seqStored = 0; 
    } 
 
    private static void realloc() { 
        int newLength = 2 * seq.length; 
        int[] newSeq = new int[newLength]; 
        for (int i = 0; i < seq.length; i++) { 
            newSeq[i] = seq[i]; 
        } 
        seq = newSeq; 
    } 
 
    
 
    public void print() { 
        for (int i = 0; i < seqStored; i++) { 
            System.out.print(seq[i]+" ");  
        }
    }
    
    public static void main(String[] args){
        IntSequence seq = new IntSequence();
        seq.of(3,1,4,1,5,9);
        seq.print();
        

        
    }
 
}