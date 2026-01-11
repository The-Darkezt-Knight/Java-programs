package Inventory;

public class Weapon extends Item{
    
    private int damage;

    public Weapon(String name, String type, int quantity, int damage)
    {
        super(name, type, quantity);
        this.damage = damage;
    }

    public void set_damage(int damage)
    {
        this.damage = damage;
    }

    public int get_damage()
    {
        return damage;
    }

    @Override
    public String toString()
    {
        return "Name: " + get_name() + ", Type: " + get_type() + ", Quantity: " + get_quantity() + ", Damage: " + get_damage();
    }
}
