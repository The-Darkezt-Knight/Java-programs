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

    public void add_item(String name, String type, int quantity)
    {
        items.add(new Fruit(name, type, quantity));
    }

    public void add_item(String name, String type, int quantity, int damage)
    {
        items.add(new Weapon(name, type, quantity, damage));
    }

    public void display_items()
    {
        for(int i = 0; i < items.size(); i++)
            {
                System.out.println(items.get(i));

                if(i+1 != items.size())
                    {
                        String instance = items.get(i).getClass().getSimpleName();

                        if(!instance.toString().equalsIgnoreCase(items.get(i+1).getClass().getSimpleName().toString()))
                        {
                            System.out.println("*------------------------------------*");
                        }
                    }
            }
    }

    public void display_items(String instance)
    {
            for (Item item : items) {
                if(item.getClass().getSimpleName().toString().equalsIgnoreCase(instance)){
                    System.out.println(item);
                }
            }
    }

}
