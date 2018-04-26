
package ChapterII.Exercises.Exercise15;

import java.util.ArrayList;


public class Invoice {
    private static class Item{
        String description;
        int quantity;
        double unitPrice;
        
        double price(){
            return quantity + unitPrice;
        }
        void printItem(){
        System.out.println("description: "+description+ "  quantity: "+quantity+"  unitPrice: "+unitPrice);  
    }
    }
    private ArrayList<Item> items = new ArrayList<>();
    
    public void addItem(String description, int quantity, double unitPrice){
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrice;
        items.add(newItem);
    }
    
    public void print(Item item){
        item.printItem();
    }
    public static void main(String[] args){
        Invoice invoice = new Invoice();
        invoice.addItem("Invoice", 20, 10);
        
        //print(invoice);
    }
    
}
