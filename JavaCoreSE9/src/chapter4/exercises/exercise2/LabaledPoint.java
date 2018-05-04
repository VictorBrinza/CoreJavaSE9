
package chapter4.exercises.exercise2;

import java.util.Objects;

public class LabaledPoint extends Point{
    
    private String label;
    
    public LabaledPoint(String label, int x, int y) {
        super(x, y);
        this.label=label;
    }
    
    public String getLabel(){
        return this.label;
    }
    
    public String toString(){
        return super.toString()+", Label: "+label;
    }
    public boolean equals(LabaledPoint otherPointLabaled){
        if(!super.equals(otherPointLabaled)) return false;
        LabaledPoint other = (LabaledPoint) otherPointLabaled;
        return Objects.equals(label, other.label);
    }
    public int hashCode(){
        return Objects.hash(super.hashCode(),label);
    }
    
    public static void main(String[] args){
        LabaledPoint lPoint = new LabaledPoint("lable1",2,3);
        LabaledPoint lPoint2 = new LabaledPoint("lable1",2,3);
        System.out.println(lPoint.toString());
        System.out.println(lPoint2.toString());
        System.out.println("Objects are equal: "+lPoint.equals(lPoint2));
        System.out.println("lPoint hashCode: "+lPoint.hashCode());
        System.out.println("lPoint2 hashCode: "+lPoint2.hashCode());
    }
    
}
