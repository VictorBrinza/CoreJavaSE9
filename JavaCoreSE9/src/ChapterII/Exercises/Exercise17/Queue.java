
package ChapterII.Exercises.Exercise17;

import java.util.LinkedList;




public class Queue {

    private static LinkedList list = new LinkedList();
   

    class Iterator{
        int value;
        Iterator next;
        
        Iterator(){
        }
        Iterator(int data,Iterator next){
          value=data;
          this.next=next;
        }
        Iterator next(){
         return next;
        }
        boolean hasNext(){
            return next() != null;
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
        Queue cd = new Queue();
        Iterator iterCreate = cd.iterCreate();

        for(int i = 0; i < 5; i++)
        { 
            iterCreate.put(i);
        }
        System.out.println(list);
        System.out.println(iterCreate.hasNext());

        
    }

}
