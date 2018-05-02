
package ChapterIII.Exercises.Exercise4;

import java.util.Arrays;

public class IntSequence2  implements IntSequence1{
      protected int[] seq; 
      protected int seqStored;
      
       public static int[] n; 
      
    public IntSequence2(int length) { 
        init(length); 
    } 
 
    public IntSequence2() { 
        init(1); 
    } 
 
    public IntSequence2(IntSequence s) { 
        seq = Arrays.copyOf(s.seq, s.seqStored); 
        seqStored = s.seqStored; 
    } 
    
    private void init(int length) { 
        seq = new int[length]; 
        seqStored = 0; 
    } 

    ///////////
    public static IntSequence1 of(int...n){         
         IntSequence2.n = n;
          return new IntSequence1(){    
               public  void print() { 
                  int[] n = IntSequence2.n;
                    for (int i = 0; i < n.length; i++) { 
                        System.out.print(n[i]+" ");  
                    }
                }

          };
    }
    public static void main(String[] args) {
          IntSequence1 seq = IntSequence2.of(3,1,4,1,5,9);
          seq.print();
          
    }

//////////////////

    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
