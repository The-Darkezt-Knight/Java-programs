package StudentRecord;


public class Student extends Person{

    public Student(String first_name, String last_name, int age, int height, int weight)
    {
        super(first_name, last_name, age, height, weight);
    }

    @Override
    public String toString()
    {
        return get_first_name() + " " + get_last_name() + "(" + getClass().getSimpleName() + ")";
    }
    
}
