
package chapter6.exercises.exercise4;

import java.util.ArrayList;


class Table<K, V> {
    class Entry<K, V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }
    
        private ArrayList<Entry<K, V>> data;

        public Table() {
            this.data = new ArrayList<>();
        }

        public void remove(K key) {
            for (Entry<K, V> var : this.data) {
                if (var.getKey().equals(key)) {
                    this.data.remove(var);
                    return;
                }
            }
        }

        public V get(K key) {
            for (Entry<K, V> var : this.data) {
                if (var.getKey().equals(key)) {
                    return var.getValue();
                }
            }
            return null;
        }

        public void set(K key, V value) {
            for (Entry<K, V> var : this.data) {
                if (var.getKey().equals(key)) {
                    var.setValue(value);
                    return;
                }
            }
            this.data.add(new Entry<>(key, value));
        }
        
        public static void main(String[] args){
            Table<Integer,String> tab = new Table<>();
            tab.set(1,"unu");
            tab.set(2,"doi");
            tab.set(3,"trei");
            System.out.println(tab.get(2));
            tab.remove(2);
            System.out.println(tab.get(2));
        }
}