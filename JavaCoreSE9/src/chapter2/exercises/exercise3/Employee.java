
package chapter2.exercises.exercise3;


public class Employee {
    private String name;
    private double salary;
    
    Employee(){
    this.name="";
    this.salary=0;
    }
    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    //mutator method
    public String changeName(String rename){
     this.name=rename;
        return "Name was changed !";   
    }
    //mutator method
    public String increaseSalary(double inc){
     double oldSalary=this.salary;
     this.salary=oldSalary+inc;
        return "Salary was changed !";   
    }
    // accesor method
    public void printEmployee(){
        System.out.println("Name: "+this.name+"  Salary: "+this.salary);   
    }
    public static void main(String[] args){
        Employee employee = new Employee("Denis",5000);
        employee.printEmployee();
        System.out.println(employee.changeName("Ion"));
        System.out.println(employee.increaseSalary(100));
        employee.printEmployee();
        
    }
    
}
