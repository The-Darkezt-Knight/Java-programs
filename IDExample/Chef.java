package IDExample;

public class Chef {
     public void make(Food food)
     {
        System.out.println("The chef has a " + food.get_name() + " to make");
     }
    public static void main(String[] args) {
        Food caramel_cake = new Cake("Caramel cake", "Roll cake", 499);
        Food chocolate_cupcake = new Cupcake("Chocolate cupcake", "small cup cake", 40);

        Chef aguinaldo = new Chef();
        aguinaldo.make(chocolate_cupcake);
        aguinaldo.make(caramel_cake);
    }
}
