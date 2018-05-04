
package chapter4.exercises.exercise4;


import java.util.Objects;

public class Point extends Shape{
    //private double x;
    //private double y;
    
    public Point(double x, double y){
        super(x,y);
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public String toString(){
        return getClass().getName()+" X= "+x+", Y= "+y;
    }
    
    public boolean equals(Point otherPoint){
        if(this == otherPoint) return true;
        if(otherPoint==null) return false;
        if(getClass()!=otherPoint.getClass()) return false;
        Point other = (Point) otherPoint;
        return x==other.x && y==other.y;
    }
    
    public int hashCode(){
        return Objects.hash(x,y);
    }

    @Override
    public Point getCenter() {
        return this;
    }
    
    @Override
    public Point clone(){
        Point cloned = new Point(x,y);
        return cloned;
    }
}
