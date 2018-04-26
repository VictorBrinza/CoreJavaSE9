
package ChapterII.Exercises.Exercise5;

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
public double getX() {
    return x;
}

public double getY() {
    return y;
}
public void translate(double dx, double dy){
    x+=dx;
    y+=dy;
}
public void scale(double s){
    x*=s;
    y*=s;
}

public static void main(String[] args){
    Point point = new Point(3,4);
    point.translate(1,3);
    point.scale(0.5);            
    System.out.println(point.getX());
    System.out.println(point.getY());
           
    }
}
