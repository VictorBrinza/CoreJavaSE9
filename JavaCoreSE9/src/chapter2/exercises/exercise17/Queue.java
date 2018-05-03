
package chapter2.exercises.exercise17;

import java.util.LinkedList;




public class Queue {

    private static LinkedList list = new LinkedList();
   

    static class Iterator{
        int value;
        Iterator next;
        
        Iterator(){
        }
        Iterator(int data,Iterator next){
          value=data;
          this.next=next;
        }
        
        public boolean hasNext(Object v){            
            return list.size()-1 > (Integer) v;
        }
        
        public void put(Object v){ 
        list.addFirst(v);
        }
        
        public void putTail(Object v)
        { 
        list.add(v);
        }
        
        public Object get(){ 
        return list.removeLast(); 
        }
    }
    
    public Iterator iterCreate()
    { 
       return new Iterator();
    }
    

    public static void main(String[] args)
    {
        
        
        Queue.Iterator cd = new Queue.Iterator();


        for(int i = 0; i < 5; i++)
        { 
            cd.put(i);
        }
        System.out.println(list);
        System.out.println(cd.hasNext(3));
        
    }

}
