
package chapter6.exercises.exercise2;

public class Stack<E> {
	private E[] arr = null;
	private int CAP;
	private int top = -1;
	private int size;
 
	@SuppressWarnings("unchecked")
	public Stack(int cap) {
		this.CAP = cap;
                this.size=0;
		this.arr =(E[]) new Object[cap];
	}
        
//        public Stack(int cap,E[] array) {
//        @SuppressWarnings("unchecked") E[] newArray
//                = (E[]) java.lang.reflect.Array.newInstance(array.getClass().getComponentType(), cap);
//                
//        }
	public E pop() {
		if(this.size == 0){
			return null;
		}
 
		this.size--;
		E result = this.arr[top];
		this.arr[top] = null;
		this.top--;
 
		return result;
	}
 
	public boolean push(E e) {
		if (isFull())
			return false;
 
                    
		this.size++;
		this.arr[++top] = e;
		return false;
	}
 
	public boolean isFull() {
		if ( this.arr.length < 1)
			return false;
                
		if (this.size == this.CAP)
			return true;
                
		return false;
	}
        
        public boolean isEmpty(){
            return this.size==0;
        }
 
	public String toString() {
		if(this.size==0){
			return null;
		}
 
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<this.size; i++){
			sb.append(this.arr[i] + ", ");
		}
 
		sb.setLength(sb.length()-2);
		return sb.toString();	
	}
 
       
        
	public static void main(String[] args) {
                //String[] str ={"unu","doi","trei"};
		Stack<String> stack = new Stack<>(11);
		stack.push("hello");
                stack.push("world");
                System.out.println(stack);
                                
                boolean full =stack.isFull();
                System.out.println("is Full? " + full);
		boolean empty =stack.isEmpty();
                System.out.println("is Empty? "+empty);
	}
}
