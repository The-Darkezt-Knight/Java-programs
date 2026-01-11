package Inventory;


public class Player {

    public static void main(String[] args) {
        
        Inventory inventory = new Inventory();

        Item apple = new Fruit("Apple", "Fuji", 10);
        Fruit golden_apple = new Fruit("Golden apple", "Enchanted", 5);

        Item broad_sword = new Weapon("Broad sword", "Melee", 1, 50);
        Weapon dagger = new Weapon("Dagger", "agile", 2, 60);

        inventory.add_item(apple);
        inventory.add_item(golden_apple);
        inventory.add_item(broad_sword);
        inventory.add_item(dagger);

        inventory.display_items();
    }
}
