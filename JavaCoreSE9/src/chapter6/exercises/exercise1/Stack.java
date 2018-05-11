
package chapter6.exercises.exercise1;

import java.util.NoSuchElementException;

public class Stack<E> {
    private int n;
    private Node first;
    
    private class Node{
        private E element;
        private Node next;
    }
    
    public Stack(){
        first= null;
        n=0;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
    public void push(E element){
        Node oldfirst = first;
        first = new Node();
        first.element = element;
        first.next = oldfirst;
        n++;
    }
    
    public E pop(){
        if(isEmpty()) throw new NoSuchElementException("Stack underflow");
        E element = first.element;
        first=first.next;
        n--;
        return element;
    }
    
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();
        String unu="Unu";
        String doi="Doi";
        String trei="Trei";
        stack.push(unu);
        stack.push(doi);
        stack.push(trei);
        boolean empty =stack.isEmpty();
        String pop = stack.pop();
        System.out.println("stack is empty? "+empty);
        System.out.println("stack pop "+pop);
    }
    
    
}
