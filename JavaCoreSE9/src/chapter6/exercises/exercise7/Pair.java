
package chapter6.exercises.exercise7;

class Pair<E>{
    
    private E first; 
    private E second; 
    
    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public void setPair(E first, E second) {
        this.first = first;
        this.second = second;
    }


    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }
    
    public static void main(String[] args){
        Pair<Integer> pair = new Pair<>(1,2);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}