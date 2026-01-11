package Inventory;

public class Item {
    private String name;
    private String type;
    private int quantity;

    public Item(String name, String type, int quantity)
    {
        this.name = name;
        this.type = type;
        this.quantity = quantity;
    }

    public void set_name(String name)
    {
        this.name = name;   
    }

    public void set_type(String type)
    {
        this.type = type;
    }

    public void set_quantity(int quantity)
    {
        this.quantity = quantity;
    }

    public String get_name()
    {
        return name;
    }

    public String get_type()
    {
        return type;
    }

    public int get_quantity()
    {
        return quantity;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Type: " + type + "Quantity: " + quantity;
    }
}
