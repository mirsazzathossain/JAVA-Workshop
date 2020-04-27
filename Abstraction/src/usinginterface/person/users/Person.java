package usinginterface.person.users;

abstract class Person {
    protected String name, dob, gender;

    Person(){
        name = "TBA";
        dob = "TBA";
        gender = "TBA";
    }

    Person(String name, String dob, String gender) {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
    }

    // Abstract method can't have any body
    abstract void show();
}
