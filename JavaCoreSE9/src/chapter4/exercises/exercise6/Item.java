
package chapter4.exercises.exercise6;

import java.util.Objects;


public class Item {
    public String description;
    public double price;
    
    Item(String description, double price){
        this.description=description;
        this.price=price;
    }

    @Override
    public boolean equals(Object otherObject){
       if(this == otherObject) return true;
       if(otherObject == null) return false;
       if(getClass() != otherObject.getClass()) return false;
       Item other = (Item) otherObject;
       return Objects.equals(description, other.description) && price == other.price;
    }

}
