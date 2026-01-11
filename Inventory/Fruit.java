package Inventory;

public class Fruit extends Item{
    
    public Fruit(String name, String type, int quantity)
    {
        super(name, type, quantity);
    }

    @Override
    public String toString()
    {
        return "Name: " + get_name() + ", Type: " + get_type() + ", Quantity: " + get_quantity();
    }
}
