
package chapter4.exercises.exercise4;

public class Rectangle extends Point{
    double width;
    double height;

    public Rectangle(Point topLeft, double width, double height){
        super(topLeft.x, topLeft.y);
        this.width=width;
        this.height=height;
    }
    @Override
    public Rectangle clone(){
        Rectangle cloned = new Rectangle(super.clone(),width,height);
        return cloned;
    }
    
    
}
