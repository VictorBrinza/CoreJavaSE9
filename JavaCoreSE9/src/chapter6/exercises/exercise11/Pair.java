/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6.exercises.exercise11;


import java.util.ArrayList;
import java.util.Collections;

class Pair<E extends Comparable<E>> {
        private E first, second;
        
        public void setFirst(E first) {
            this.first = first;
        }

        public void setSecond(E second) {
            this.second = second;
        }
       
        static class Arrays {
            public static <E extends Comparable<E>> Pair<E> firstLast(ArrayList<? extends E> a) {
                Pair<E> p = new Pair<>();
                p.setFirst(a.get(0));
                p.setSecond(a.get(a.size() - 1));
                return p;
            }
            
            public static <E extends Comparable<E>> E min(ArrayList<E> a) {
                return Collections.min(a);
            }

            public static <E extends Comparable<E>> E max(ArrayList<E> a) {
                return Collections.max(a);
            }
            
            public static <E extends Comparable<E>> Pair<E> minMax(ArrayList<E> a) {
                Pair<E> p = new Pair<>();
                p.setFirst(min(a));
                p.setSecond(max(a));
                return p;
            }
            
        }
        
        public static void main(String[] args){
            ArrayList<Pair> list = new ArrayList<>();
            Pair<Integer> pair1 = new Pair<>();
            pair1.setFirst(2);
            pair1.setSecond(4);
            Pair<Integer> pair2 = new Pair<>();
            pair2.setFirst(3);
            pair2.setSecond(6);
            list.add(pair1);
            list.add(pair2);
            Pair<Integer> pair3 = new Pair<>();
            //pair3 = Arrays.minMax(list.);
            
        }
}