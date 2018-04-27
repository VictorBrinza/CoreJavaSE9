
package ChapterII.Exercises.Exercise15;

import java.util.ArrayList;


public class Invoice {
    private static class Item{
        String description;
        int quantity;
        double unitPrice;
        
        public void addItem(String description, int quantity, double unitPrice){
  
        this.description = description;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
 
    }
        void printItem(){
            double price = quantity * unitPrice;
            System.out.println("description: "+description+ "  quantity: "+quantity+"  unitPrice: "+unitPrice);
            System.out.println("Total price: "+price);
            System.out.println();
    }
    }
    private ArrayList<Item> items = new ArrayList<>();
    
    public void addItem(Item item){
        Item newItem = new Item();
        items.add(newItem);
    }
    
    public void print(Item item){
        item.printItem();
    }
    public static void main(String[] args){
        Invoice.Item obj = new Invoice.Item();
        obj.addItem("Item1", 5, 10);
        //obj.printItem();
        Invoice.Item obj2 = new Invoice.Item();
        obj2.addItem("Item2", 15, 5);
        //obj2.printItem();
        Invoice invoice = new Invoice();
        invoice.addItem(obj);
        invoice.addItem(obj2);
        invoice.print(obj);
        invoice.print(obj2);
        
        
    }
    
}
