package Restaurant;

public class Food {
    private String food_name;
    private String type;
    private int price;

    public Food(String food_name, String type, int price)
    {
        this.food_name = food_name;
        this.type = type;
        this.price = price;
    }

    public void set_name(String food_name)
    {
        this.food_name = food_name;
    }

    public void set_type(String type)
    {
        this.type = type;
    }

    public void set_price(int price)
    {
        this.price = price;
    }

    public String get_name()
    {
        return this.food_name;
    }

    public String get_type()
    {
        return this.type;
    }

    public int get_price()
    {
        return this.price;
    }
}
