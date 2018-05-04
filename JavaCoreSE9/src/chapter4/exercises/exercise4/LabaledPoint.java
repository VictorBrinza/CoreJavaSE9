
package chapter4.exercises.exercise4;

import java.util.Objects;

public class LabaledPoint extends Point{
    
    private String label;
    
    public LabaledPoint(String label, Point p) {
        super(p.x, p.y);
        this.label=label;
    }
    
    public String getLabel(){
        return this.label;
    }
    
    @Override
    public String toString(){
        return super.toString()+", Label: "+label;
    }
    public boolean equals(LabaledPoint otherPointLabaled){
        if(!super.equals(otherPointLabaled)) return false;
        LabaledPoint other = (LabaledPoint) otherPointLabaled;
        return Objects.equals(label, other.label);
    }
    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(),label);
    }
    
    @Override
    public LabaledPoint clone(){
        LabaledPoint cloned = new LabaledPoint(label,super.clone());
        return cloned;
    }
    
    
    
}
