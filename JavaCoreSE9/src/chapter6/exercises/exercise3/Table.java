
package chapter6.exercises.exercise3;

import java.util.ArrayList;


public class Table<K, V> {
    private ArrayList<Entry> list;
    
    class Entry<K, V>{
        public K key;
        public V value;

        public Entry(K key, V value){
            this.key=key;
            this.value=value;
        }
        
        public K getKey(){
            return key;
        }
        
        public void setKey(Entry en){
            en.key=key;
        }
    }
    
    public void add(Entry en){
            list.add(en);
        }
    
    public void remove(Entry en){
            list.remove(en);
        }
    
    public Entry getValue(Entry en){
        //setKey(en);
        
        return null;
    }
    
    
    
    
}
