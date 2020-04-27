package person.driver;

import person.users.Student;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Mr. Mofiz", "01 Jan 1993", "Male", 1234567, 2.89f, "CSE");
        s.display();
    }
}
