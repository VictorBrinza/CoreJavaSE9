
package ChapterIII.Exercises.Exercise5;

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
    
    public static void constant(int n) { 
        
       
        for(int i=0;i<seq.length;i++){
            if (seqStored == seq.length) { 
            realloc(); 
            }
            seq[seqStored] = n; 
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
        IntSequence seq = new IntSequence(10);
        seq.constant(1);
        seq.print();

        
    }
 
}