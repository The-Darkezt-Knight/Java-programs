package StudentRecord;

public class Person implements Comparable<Person>{
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
        this.last_name = last_name;
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

    @Override
    public int compareTo(Person other)
    {
        if(other == null) return -1;

        String this_class = this.getClass().getSimpleName();
        String other_class = other.getClass().getSimpleName();
        int by_class = String.CASE_INSENSITIVE_ORDER.compare(this_class, other_class);
        if(by_class != 0) return by_class;

        String this_first_name = this.first_name;
        String other_first_name = other.first_name;
        int by_first_name = String.CASE_INSENSITIVE_ORDER.compare(this_first_name, other_first_name);
        if(by_first_name != 0) return by_first_name;

        String this_last_name = this.last_name;
        String other_last_name = other.last_name;
        int by_last_name = String.CASE_INSENSITIVE_ORDER.compare(this_last_name, other_last_name);
        if(by_last_name != 0) return by_last_name;

        int by_age = Integer.compare(this.age, other.age);
        if(by_age != 0) return by_age;

        int by_height = Integer.compare(this.height, other.height);
        if(by_height != 0) return by_height;

        return Integer.compare(this.weight, other.weight);
    }

    @Override
    public String toString()
    {
        return first_name + " " + last_name + "(" + getClass().getSimpleName() + ")";
    }
}

