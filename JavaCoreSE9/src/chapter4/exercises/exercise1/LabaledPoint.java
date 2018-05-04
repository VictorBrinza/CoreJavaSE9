
package chapter4.exercises.exercise1;


public class LabaledPoint extends Point{
    
    private String label;
    
    public LabaledPoint(String label, int x, int y) {
        super(x, y);
        this.label=label;
    }
    
    public String getLabel(){
        return this.label;
    }
    
    public static void main(String[] args){
        LabaledPoint lPoint = new LabaledPoint("Lable1",2,3);
        System.out.println("lPoint label: "+lPoint.getLabel());
        System.out.println("lPoint X: "+lPoint.getX());
        System.out.println("lPoint Y: "+lPoint.getY());
    }
    
}
