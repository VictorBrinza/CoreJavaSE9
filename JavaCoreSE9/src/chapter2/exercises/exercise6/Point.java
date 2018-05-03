
package chapter2.exercises.exercise6;
/**
 * A <code> Point </code> object represents a point in plane
 * @author vbrinza
 * @version 1.0
 */

public class Point {
    private double x;
private double y;

public Point(){
    this.x=0;
    this.y=0;
}
    
public Point(double x, double y){
    this.x=x;
    this.y=y;
}
public String getX(){
    return "x=("+this.x+")";
}
public String getY(){
    return "y=("+this.y+")";
}
public void translate(double x, double y){
    this.x+=x;
    this.y+=y;
}
public void scale(double s){
    this.x*=s;
    this.y*=s;
}

public static void main(String[] args){
    Point point = new Point(3,4);
    point.translate(1,3);
    point.scale(0.5);            
    System.out.println(point.getX());
    System.out.println(point.getY());
           
    }
}
