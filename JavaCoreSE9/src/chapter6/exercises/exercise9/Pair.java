
package chapter6.exercises.exercise9;

import java.util.ArrayList;

    class Pair<E> {
        private E first, second;
        
        public void setFirst(E first) {
            this.first = first;
        }

        public E getFirst() {
            return first;
        }
        
        public E getSecond() {
            return second;
        }

        public void setSecond(E second) {
            this.second = second;
        }



        static class Arrays {
            public static <E> Pair<E> firstLast(ArrayList<? extends E> a) {
                Pair<E> p = new Pair<>();
                Pair d = (Pair)a.get(0);
                Pair d1 = (Pair)a.get(a.size()-1);
                p.setFirst((E) d.getFirst());
                p.setSecond((E) d1.getSecond());
                return p;
            }

        
        }
        
        public static void main(String[] args){
            ArrayList list = new ArrayList<>();
            Pair<Integer> pair1 = new Pair<>();
            pair1.setFirst(2);
            pair1.setSecond(4);
            Pair<Integer> pair2 = new Pair<>();
            pair2.setFirst(3);
            pair2.setSecond(6);
            Pair<Integer> pair3 = new Pair<>();
            pair3.setFirst(5);
            pair3.setSecond(9);
            list.add(pair1);
            list.add(pair2);
            list.add(pair3);
            Pair<Integer> pair4 = new Pair<>();
            pair4 = Arrays.<Pair>firstLast(list);
            System.out.print(pair4.getFirst());
            System.out.print(pair4.getSecond());
            
        }
    }
    

