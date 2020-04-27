package abstractclass.person.driver;


import abstractclass.person.users.Faculty;
import abstractclass.person.users.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Mofiz", "01 jan 1993","male", 1234567, 2.5F, "CSE");
        s.show();

        System.out.println();

        Faculty f = new Faculty("Mr. xyz","01 Jan 1975", "male", 1234, "Professor","CSE",75000.0f,"Engineering and computer science");
        f.show();
    }
}
