package Inventory;

import java.util.ArrayList;
import java.util.Collections;

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
        ArrayList<Item> sortedItems = new ArrayList<>(items);
        Collections.sort(sortedItems);

        for (int i = 0; i < sortedItems.size(); i++)
        {
            System.out.println(sortedItems.get(i));

            if (i + 1 != sortedItems.size())
            {
                String currentClass = sortedItems.get(i).getClass().getSimpleName();
                String nextClass = sortedItems.get(i + 1).getClass().getSimpleName();

                if (!currentClass.equalsIgnoreCase(nextClass))
                {
                    System.out.println("*------------------------------------*");
                }
            }
        }
    }

    public void display_items(String instance)
    {
        ArrayList<Item> sortedItems = new ArrayList<>(items);
        Collections.sort(sortedItems);

        for (Item item : sortedItems)
        {
            if (item.getClass().getSimpleName().equalsIgnoreCase(instance))
            {
                System.out.println(item);
            }
        }
    }


}
