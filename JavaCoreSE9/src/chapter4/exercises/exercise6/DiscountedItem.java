
package chapter4.exercises.exercise6;

import java.util.Objects;

public class DiscountedItem extends Item{
    private double discount ;
    
    DiscountedItem(String description, double price, double discount){
        super(description,price);
        this.discount=discount;
    }
    

    @Override
    public boolean equals(Object otherObject) {
        if(otherObject.getClass() == getClass()){;
        if(!super.equals(otherObject)) return false;
        DiscountedItem other = (DiscountedItem) otherObject;
        return discount == other.discount;
        }else if(otherObject instanceof Item){
            return super.equals(otherObject);
        }else{
            return false;
        }
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
