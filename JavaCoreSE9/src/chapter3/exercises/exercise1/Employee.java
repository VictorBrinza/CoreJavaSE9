
package chapter3.exercises.exercise1;

public class Employee implements Measurable{
    private String name;
    private double salary;
    
    
    Employee(String name, int salary){
    this.name=name;
    this.salary=salary;
    }
    
    @Override
    public double getMeasure() {
        return this.salary;
    }

    public static double average(Measurable[] obj){
         double d = 0;
         int i;
        for ( i = 0; i < 4; i++) {
            d += obj[i].getMeasure();
        }
        return d/i;
    }
    
    public static void main(String[] args){
        Measurable[] list = new Employee[4];        
        list[0] = new Employee("Ion",5000);
        list[1] = new Employee("Vasile",5500);
        list[2]= new Employee("Dumitru",6000);
        list[3] = new Employee("Denis",4000);
        double result = average(list);
        System.out.println("Average: " + result);        

    }

}
