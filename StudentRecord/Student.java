package StudentRecord;

public class Student extends School{
    
    public Student(
        String first_name,
        String last_name,
        int age,
        int year_level,
        String section
    )   
    {
        super(first_name, last_name, age, year_level, section);
    }

}