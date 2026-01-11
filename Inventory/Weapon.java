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
}
