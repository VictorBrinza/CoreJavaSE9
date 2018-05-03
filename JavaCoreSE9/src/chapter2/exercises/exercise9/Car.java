
package chapter2.exercises.exercise9;


public class Car {

private String name;
private double gas;
private double dist;
private double eff;

  Car(String name,double gas, double dist, double eff)
  {
    this.name = name;
    this.gas=gas;
    this.dist=dist;
    this.eff=eff;
  }
  public void getMiles( double m){
      if(gas <= m*eff){
          System.out.println("it's not enough gas, add more gas");
      }else{
        dist+=m;
        gas =gas- m*eff;
      }
  }
  public double addGas(int a){
      return gas+=a;
  }
  private String getCar(){
      return "model: "+name+"  miles: "+dist+"  gas: "+gas;
  }
  public static void main(String[] args){
      Car car = new Car("Audi",0,0,0.7);
      car.addGas(60);
      System.out.println(car.getCar());
      car.getMiles(40);
      System.out.println(car.getCar());
      Car car2 = new Car("BMW",0,0,0.4);
      car2.addGas(70);
      System.out.println(car2.getCar());
      car2.getMiles(100);
      System.out.println(car2.getCar());
      
  }
}
