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

        String thisClass = this.getClass().getSimpleName();
        String otherClass = other.getClass().getSimpleName();
        int byClass = String.CASE_INSENSITIVE_ORDER.compare(thisClass, otherClass);
        if(byClass != 0)
            {
                return byClass;
            }

        int byName = String.CASE_INSENSITIVE_ORDER.compare(this.name, other.name);
        if (byName != 0) {
            return byName;
        }

        int byType = String.CASE_INSENSITIVE_ORDER.compare(this.type, other.type);
        if (byType != 0) {
            return byType;
        }

        return Integer.compare(this.quantity, other.quantity);
    }

    @Override
    public String toString()
    {
        return "Name: " + name + ", Type: " + type + ", Quantity: " + quantity;
    }
}
