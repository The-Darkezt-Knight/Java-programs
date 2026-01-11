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
            System.out.println(item);
        }
    }

    public void display_items(String instance)
    {
        for (Item item : items) {
            if(item.getClass().toString().equalsIgnoreCase(instance))
                {
                    System.out.println(item);
                }
        }
    }

}
