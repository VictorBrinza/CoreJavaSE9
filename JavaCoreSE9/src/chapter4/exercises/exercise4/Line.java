
package chapter4.exercises.exercise4;


public class Line extends Point{

    private Point from;
    private Point to;
    
    public Line(Point from, Point to) {
        super(from.x,from.y);
        this.to.x=to.x;
        this.to.y=to.y;
    }
    @Override
    public Line clone(){
        Line cloned = new Line(from,to);
        return cloned;
    }
    
    

 
    
}
