package StudentRecord;

public class Registrar extends School implements Includes{

    public Registrar(String first_name, String last_name, int age)
    {
        super(first_name, last_name, age);
    }

    public void separator()
    {
        System.out.println("========================================");
    }

    public void enroll_student(Student student)
    {
        get_student_record().add(student);
        System.out.println(String.format("""
                Successfully added %s to the database
                """. formatted(student.get_first_name())));
    }

    public void remove_student(Student student)
    {
        get_student_record().remove(student);
    }

    public void log_students()
    {
        for (Student student : get_student_record()) {
            System.out.println(String.format("""
                First name:    %s
                Last name:     %s
                Age:           %d
                Year level:    %d
                Section:       %s
                """.formatted(student.get_first_name(), student.get_last_name(), student.get_age(), student.get_year_level(), student.get_section())));
                separator();
        }
    }
}
