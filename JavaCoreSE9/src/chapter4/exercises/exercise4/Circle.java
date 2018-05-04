
package chapter4.exercises.exercise4;


public class Circle extends Point {
    
    double radius;
    
    public Circle(Point center, double radius){
        super(center.x,center.y);
        this.radius=radius;
    }
    
    @Override
    public Circle clone(){
        Circle cloned = new Circle(super.clone(),radius);
        return cloned;
    }
    
}
