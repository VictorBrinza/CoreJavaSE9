
package chapter4.exercises.exercise6;

import java.util.Objects;

public class DiscountedItem extends Item{
    private double discount ;
    
    DiscountedItem(String description, double price, double discount){
        super(description,price);
        this.discount=discount;
    }
    
    public String getDiscountedDescription() {
        return super.getDescription();
    }

    public double getDiscountedPrice() {
        return super.getPrice();
    }
    
    public double getDiscount() {
        return discount;
    }

    
//    @Override
//    public boolean equals(Object otherObject) {
//        if(otherObject instanceof DiscountedItem){
//            DiscountedItem other = (DiscountedItem) otherObject;
//            return (super.equals(other)) && discount == other.discount;
//        }else if(otherObject instanceof Item){
//            Item other = (Item) otherObject;
//            return super.equals(other);
//        }else{
//            return false;
//        }
//    }
    //Objects.equals(description, other.description)
    
    
public boolean equals(Object object){
      if(object instanceof DiscountedItem){
          DiscountedItem dItem = (DiscountedItem) object;
          if( Objects.equals(getDiscountedDescription(), dItem.getDiscountedDescription())
              && getDiscountedPrice() == dItem.getDiscountedPrice()  
              && getDiscount() == dItem.getDiscount())
          { return true; }
      }else if(object instanceof Item){
          Item item = (Item) object;
          if( Objects.equals(getDescription(), item.getDescription())
              && getPrice() == item.getPrice())
              { return true; }
      }
         return false; 
      
}    
    public static void main(String[] args){
        Item x = new Item("obj1",200);
        Item y = new DiscountedItem("obj1",200,400);
        DiscountedItem z = new DiscountedItem("obj1",200,400);

        System.out.println(x.equals(y));
        
        System.out.println(y.equals(z));
        
        System.out.println(z.equals(x));
        
        
    }
    
}
