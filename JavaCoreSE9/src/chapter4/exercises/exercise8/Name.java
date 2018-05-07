
package chapter4.exercises.exercise8;


public class Name {
    public static void main(String[] args){
        Integer u=0;
        Class<?> i = u.getClass();

      System.out.println("this object is an instance of "+ i.getCanonicalName());
      System.out.println("this object is an instance of "+ i.getSimpleName());
      System.out.println("this object is an instance of "+ i.getTypeName());
      System.out.println("this object is an instance of "+ i.getName());
      System.out.println("this object is an instance of "+ i.toString());
      System.out.println("this object is an instance of "+ i.toGenericString());
      System.out.println();
      
      int[] array ={1,2,3,4};
      Class<?> i2 = array.getClass();
      System.out.println("this object is an instance of "+ i2.getCanonicalName());
      System.out.println("this object is an instance of "+ i2.getSimpleName());
      System.out.println("this object is an instance of "+ i2.getTypeName());
      System.out.println("this object is an instance of "+ i2.getName());
      System.out.println("this object is an instance of "+ i2.toString());
      System.out.println("this object is an instance of "+ i2.toGenericString());

    }
}
