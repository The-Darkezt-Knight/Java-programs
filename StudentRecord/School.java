package StudentRecord;

import java.util.ArrayList;

public class School {
    protected String first_name;
    protected String last_name;
    protected int age;
    protected int year_level;
    protected String section;

    private ArrayList<Student> student_record;
    
    public School(
        String first_name,
        String last_name,
        int age,
        int year_level,
        String section)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.year_level = year_level;
        this.section = section;

        
    }

    public School(String first_name, String last_name, int age)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;

        this.student_record = new ArrayList<>();
    }

    public void set_first_name(String first_name)
    {
        this.first_name = first_name;
    }

    public void set_last_name(String last_name)
    {
        this.last_name = last_name;
    }

    public void set_name(String first_name, String last_name)
    {
        this.first_name = first_name;
        this.last_name = last_name;
    }

    public void set_age(int age)
    {
        this.age = age;
    }

    public void set_year_level(int year_level)
    {
        this.year_level = year_level;
    }

    public void set_section(String section)
    {
        this.section = section;
    }

    public String get_first_name()
    {
        return this.first_name;
    } 

    public String get_last_name()
    {
        return this.last_name;
    }

    public String get_name()
    {
        return this.first_name.concat(last_name);
    }

    public int get_age()
    {
        return this.age;
    }

    public int get_year_level()
    {
        return this.year_level;
    }

    public String get_section()
    {
        return this.section;
    }

    public ArrayList<Student> get_student_record()
    {
        return this.student_record;
    }
}
