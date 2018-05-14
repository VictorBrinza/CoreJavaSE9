 
package chapter6.exercises.exercise8;

class Pair<E extends Comparable<E>>{
    
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

    public E max() {
        int cmp = this.getFirst().compareTo(this.getSecond());
        if(cmp>=0){
            return this.getFirst();
        }
        return this.getSecond();
    }
    
    public E min() {
        int cmp = this.getFirst().compareTo(this.getSecond());
        if(cmp<=0){
            return this.getFirst();
        }
        return this.getSecond();
    }
    

    
    public static void main(String[] args){
        Pair<Integer> pair = new Pair<>(4,2);
        System.out.println(pair.min());
        System.out.println(pair.max());
        
    }

    
}