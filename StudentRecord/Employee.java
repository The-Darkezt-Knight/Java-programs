package StudentRecord;

public class Employee extends Person{
    
    private String position;

    public Employee(String first_name, String last_name, int age, int height, int weight, String position)
    {
        super(first_name, last_name, age, height, weight);
        this.position = position;
    }

    public String get_position()
    {
        return this.position;
    }

    public void set_position(String position)
    {
        this.position = position;
    }
}
