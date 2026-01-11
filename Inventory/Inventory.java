package Inventory;

import java.util.ArrayList;

public class Inventory{
    
    private ArrayList<Item> items;

    public Inventory()
    {
        this.items = new ArrayList<>();
    }

    public void add_item(Item item)
    {
        items.add(item);
    }

    public void display_items()
    {
        for (Item item : items) {
            System.out.println("Name: " + item.get_name() + "Quantity: " + item.get_quantity());
        }
    }

}
