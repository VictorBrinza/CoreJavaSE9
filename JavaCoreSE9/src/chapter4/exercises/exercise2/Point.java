
package chapter4.exercises.exercise2;

import java.util.Objects;

public class Point {
    private int x;
    private int y;
    
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
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
}