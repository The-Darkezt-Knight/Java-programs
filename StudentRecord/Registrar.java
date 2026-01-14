package StudentRecord;


public class Registrar extends Employee{
    
    

    public Registrar(String first_name, String last_name, int age, int height, int weight, String position)
    {
        super(first_name, last_name, age, height, weight, position);
    }

    public School access_database()
    {
        return School.get_school_object();
    }

    public void register(Student student)
    {
        access_database().get_school_db().add(student);
        System.out.println(String.format("""
                Successfully added %s
                """. formatted(student)));
    }

    public void register(Employee employee)
    {
        access_database().get_school_db().add(employee);
    }
    
    public void remove(Student student)
    {
        access_database().get_school_db().remove(student);
    }

    public void remove(Employee employee)
    {
        access_database().get_school_db().remove(employee);
    }

    public void set_position(Employee employee, String position)
    {
        employee.set_position(position);
    }
}
