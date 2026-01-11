package Inventory;


public class Player {

    Inventory inventory = new Inventory();

    Item apple = new Fruit("Apple", "Fuji", 10);
    Fruit golden_apple = new Fruit("Golden apple", "Enchanted", 5);

    Item broad_sword = new Weapon("Broad sword", "Melee", 1, 50);
    Weapon dagger = new Weapon("Dagger", "agile", 2, 60);

    
}
