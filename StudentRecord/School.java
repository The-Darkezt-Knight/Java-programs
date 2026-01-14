package StudentRecord;

import java.util.ArrayList;
import java.util.Collections;

public class School {
    private ArrayList<Person> school_db;
    private static School school_obj;

    private School()
    {
        school_db = new ArrayList<>();
    }

    public ArrayList<Person> get_school_db()
    {
        return school_db;
    }

    public static School get_school_object()
    {
        if(school_obj == null)
            {
                school_obj = new School();
            }

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
