
package chapter3.exercises.exercise2;


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
    
    public String getName(){
        return this.name;
    }
    
    public double average(Measurable[] obj){
         double d = 0;
         int i;
        for ( i = 0; i < 4; i++) {
            d += obj[i].getMeasure();
        }
        return d/i;
    }
    
    public Measurable largest(Measurable[] obj){
         int found=0;
         
        for (int i = 0; i < 3; i++) {
            
            if(obj[i].getMeasure()<obj[i+1].getMeasure()){
                found=i+1;
            }else{
                found=i;
            }
        }
        return obj[found];
    }
    
    
    
    public static void main(String[] args){
        Measurable[] list = new Measurable[4];        
        list[0] = new Employee("Ion",5000);
        list[1] = new Employee("Vasile",5500);
        list[2]= new Employee("Dumitru",6000);
        list[3] = new Employee("Denis",4000);
        Employee d = (Employee) list[0].largest(list);
        System.out.println("Average: "+list[0].average(list));        
        System.out.println("Largest salary: "+ d.getName());

    }

}
