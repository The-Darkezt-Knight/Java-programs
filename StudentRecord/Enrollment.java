package StudentRecord;

public class Enrollment{

    public static void main(String[] args) {

        Registrar floyd = new Registrar("Floyd", "Mayweather", 35);
        Student raphael = new Student("Jose Raphael", "Pido", 21, 6, "A");
        Student joseph = new Student("Joseph", "Dela Rama", 21, 6, "A");

        floyd.enroll_student(raphael);
        floyd.enroll_student(joseph);

        floyd.log_students();
    }
}
