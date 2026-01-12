package StudentRecord;

public class Person {
    private String first_name;
    private String last_name;
    private int age;
    private int height;
    private int weight;

    public Person(String first_name, String last_name, int age, int height, int weight)
    {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void set_first_name(String first_name)
    {
        this.first_name = first_name;
    }

    public void set_last_name(String last_name)
    {
        this.first_name = last_name;
    }

    public void set_age(int age)
    {
        this.age = age;
    }

    public void set_height(int height)
    {
        this.height = height;
    }

    public void set_weight(int weight)
    {
        this.weight = weight;
    }

    public String get_first_name()
    {
        return first_name;
    }

    public String get_last_name()
    {
        return last_name;
    }

    public int get_age()
    {
        return age;
    }

    public int get_height()
    {
        return height;
    }

    public int get_weight()
    {
        return weight;
    }
}

