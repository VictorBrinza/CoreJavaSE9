
package chapter4.exercises.exercise8;


public class Box<T> {
   private T t;

   public void add(T t) {
      this.t = t;
   }

   public T get() {
      return t;
   }

   public static void main(String[] args) {
      Box<Integer> integerBox = new Box<>();
      integerBox.add(new Integer(10));
      
      Class<?> boxClass1 = integerBox.getClass();
      

      System.out.println("this object is an instance of "+ boxClass1.getCanonicalName());
      System.out.println("this object is an instance of "+ boxClass1.getSimpleName());
      System.out.println("this object is an instance of "+ boxClass1.getTypeName());
      System.out.println("this object is an instance of "+ boxClass1.getName());
      System.out.println("this object is an instance of "+ boxClass1.toString());
      System.out.println("this object is an instance of "+ boxClass1.toGenericString());
      
   }
}
