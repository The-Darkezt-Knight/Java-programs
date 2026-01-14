package StudentRecord;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class School {
    private final ArrayList<Person> school_db;
    private static final School school_obj = new School();

    private School()
    {
        school_db = new ArrayList<>();
    }

    public List<Person> get_school_db()
    {
        return Collections.unmodifiableList(school_db);
    }

    public void add_person(Person person)
    {
        school_db.add(Objects.requireNonNull(person));
    }

    public void remove_person(Person person)
    {
        school_db.remove(person);
    }

    public static School get_school_object()
    {
        return school_obj;
    }

    public void get_list()
    {
        for(int i = 0; i < school_db.size(); i++)
            {
                System.out.println(school_db.get(i));
            }
    }

    public void get_sorted_list()
    {
        ArrayList<Person> list = new ArrayList<>(school_db);
        Collections.sort(list);

        for(int i = 0; i < list.size(); i++)
            {
                System.out.println(list.get(i));

                if(i+1 != list.size())
                if(!list.get(i).getClass().getSimpleName().equalsIgnoreCase(list.get(i+1).getClass().getSimpleName()))
                    {
                        System.out.println("_==========================_");
                    }
            }
    }
}
