package StudentRecord;

public class Main {
    public static void main(String[] args) {
        Registrar registrar = new Registrar("Joe", "Star", 35, 7, 130, "Registrar");
        Student raphael = new Student("Jose Raphael", "Pido", 21, 6, 45);
        Student lee = new Student("lee Ruben", "Valero", 21, 6, 65);
        Student gwen = new Student("gwyneth Hilary", "Laurino", 21, 5, 55);

        Employee john = new Employee("John", "Kalang", 43, 76, 6, "Janitor");

        registrar.register(raphael);
        registrar.register(lee);
        registrar.register(gwen);

        registrar.register(john);
        registrar.access_database().get_sorted_list();

    }
}
