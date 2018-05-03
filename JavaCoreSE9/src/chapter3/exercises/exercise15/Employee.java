
package chapter3.exercises.exercise15;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Comparable{
    
    String nume ;
    int salary ;
    
    public Employee(String nume,int salary){
        this.nume = nume;
        this.salary = salary;
    }
    
    public String getName(){
        return this.nume;
    }
    
    @Override
    public String toString(){
        return nume + " \t " + salary ;
    }
    
    @Override
    public boolean equals ( Object o) {
        if (!( o instanceof Employee ))
            return false ;
        Employee p = (Employee) o;
            return (nume.equals(p.nume))&&(salary == p.salary);
    }
    @Override
    public int compareTo(Object o){
        if (o== null )
        throw new NullPointerException ();
        if (!( o instanceof Employee ))
        throw new ClassCastException ("Nu pot compara !");
        Employee p = (Employee) o;
        if(salary - p.salary!=0){
            return (salary - p.salary );
        }else{
            return nume.compareToIgnoreCase(p.nume);
        }
    }
    

    public static void main ( String args []) {
        Employee p[] = new Employee[5];
        p[0] = new Employee ("Ionescu",3000);
        p[1] = new Employee ("Vasilescu",4000);
        p[2] = new Employee ("Georgescu",7000);
        p[3] = new Employee ("Popescu",5000);
        p[4] = new Employee ("Munteanu",5000);
        
        Arrays.sort(p, new Comparator () {
        @Override
        public int compare (Object o1,Object o2){
        Employee p1 = (Employee)o1;
        Employee p2 = (Employee)o2;
        return p1.compareTo(p2);
            }
        });
        
        System.out.println(" Persoanele ordonate dupa salariu :");
        for(int i=0;i<p.length;i++){
            System.out.println(p[i]);
        }
        

    }
}
