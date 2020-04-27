package usinginterface.person.driver;

import usinginterface.person.users.Faculty;

public class Main {
    public static void main(String[] args) {
        Faculty faculty = new Faculty("Mr. xyz","01 Jan 1975", "male", 1234, "Professor","CSE",75000.0f,"Engineering and computer science");
        faculty.show();
        faculty.conductResearch();
        faculty.writePaper();
        faculty.submitPaper();
    }
}
