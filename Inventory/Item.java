package Inventory;

public class Item implements Comparable<Item> {
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
    public int compareTo(Item other)
    {
        if(other == null)
            {
                return -1;
            }

        String this_class = this.getClass().getSimpleName();
        String other_class = this.getClass().getSimpleName();

        int by_class = String.CASE_INSENSITIVE_ORDER.compare(this_class, other_class);
        if(by_class != 0)
            {
                return by_class;
            }

        int by_name = String.CASE_INSENSITIVE_ORDER.compare(this_class, other_class);
        if(by_name != 0)
            {
                return by_name;
            }

        int by_type = String.CASE_INSENSITIVE_ORDER.compare(this_class, other_class);
        if(by_type != 0)
            {
                return by_type;
            }

        return Integer.compare(this.quantity, other.quantity);
    }

    


    @Override
    public String toString()
    {
        return "Name: " + name + ", Type: " + type + ", Quantity: " + quantity;
    }
}
