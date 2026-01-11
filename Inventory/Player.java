package Inventory;


public class Player {

    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();

        Fruit apple = new Fruit("Apple", "Basic", 10);
        Fruit golden_apple = new Fruit("Golden apple", "Enchanted", 5);

        Weapon broad_sword = new Weapon("Broad sword", "Melee", 1, 50);
        Weapon dagger = new Weapon("Dagger", "Melee", 2, 60);

        inventory.add_item(apple);
        inventory.add_item(golden_apple);
        inventory.add_item(broad_sword);
        inventory.add_item(dagger);

        inventory.add_item("Golden carrot", "Enchanted", 10);
        inventory.add_item("Bow and arrow", "range", 1, 10);

        inventory.display_items();
    }
}
