
package ChapterII.Exercises.Exercise5;





/**
 * A <code> Point </code> object represents a point in plane
 * @author vbrinza
 * @version 2.0
 */


public class Point {
private double x ;
private double y;

public Point(){
    this.x=0;
    this.y=0;
}
    
public Point(double x, double y){
    this.x=x;
    this.y=y;
}
public double getX() {
    return x;
}

public double getY() {
    return y;
}
public String translate(double dx, double dy){
    x+=dx;
    y+=dy;
    return "translate: x="+x+"  y="+y+"\n";
}
public String scale(double s){
    x*=s;
    y*=s;
    return "scale: x="+x+"  y="+y+"\n";
}

public static void main(String[] args){
    Point point = new Point(3,4);
    System.out.println(point.translate(1,3));
    System.out.println(point.scale(0.5));            
    System.out.println(point.getX());
    System.out.println(point.getY());
           
    }
}
