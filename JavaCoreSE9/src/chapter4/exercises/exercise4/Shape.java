
package chapter4.exercises.exercise4;

public abstract class Shape implements Cloneable{

    public double x;
    public double y;
    
    Shape(double x, double y){
        this.x=x;
        this.y=y;
    }

    
    public void moveBy(double dx, double dy){
        this.x+=dx;
        this.y+=dy;
    }
    
    public abstract Point getCenter();
    
    @Override
    public Shape clone() throws CloneNotSupportedException{
       return (Shape) super.clone();
    }
}
