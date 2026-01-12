package StudentRecord;

import java.util.ArrayList;

public class Registrar extends Employee{
    
    ArrayList<Person> school_db;

    public Registrar(String first_name, String last_name, int age, int height, int weight, String position)
    {
        super(first_name, last_name, age, height, weight, position);
        school_db = new ArrayList<>();
    }

    public void register(Student student)
    {
        school_db.add(student);
    }

    public void register(Employee employee)
    {
        school_db.add(employee);
    }
    
    public void remove(Student student)
    {
        school_db.remove(student);
    }

    public void remove(Employee employee)
    {
        school_db.remove(employee);
    }

    public void set_position(Employee employee, String position)
    {
        employee.set_position(position);
    }


}
