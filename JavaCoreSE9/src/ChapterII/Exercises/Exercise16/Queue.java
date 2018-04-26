
package ChapterII.Exercises.Exercise16;

import java.util.LinkedList;


public class Queue {
    private LinkedList list = new LinkedList();
    public void put(Object v)
    { 
        list.addFirst(v);
    }
    public void putTail(Object v)
    { 
        list.add(v);
    }
    public Object get()
    { 
        return list.removeLast(); 
    }

    public static void main(String[] args)
    {
        Queue cd = new Queue();
        for(int i = 0; i < 5; i++)
        { 
            cd.put(new Integer(i));
        }
        cd.putTail(10);
        System.out.println(cd.get());
        System.out.println(cd.get());
        System.out.println(cd.get());
        System.out.println(cd.get());
        System.out.println(cd.get());
        System.out.println(cd.get());
        
        
    }

}
