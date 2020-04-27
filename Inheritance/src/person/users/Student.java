package person.users;

public class Student extends Person {
    private int id;
    private float cgpa;
    private String major;

    public Student(){
        super();
        id = 0;
        cgpa = 0.0f;
        major = "TBA";
    }

    public Student(String name, String dob, String gender, int id, float cgpa, String major) {
        super(name, dob, gender);
        this.id = id;
        this.cgpa = cgpa;
        this.major = major;
    }

    public void display(){
        System.out.println("Name: "+name+"\nDate of birth: "+dob+"\nGender: "+gender);
        System.out.println("ID: "+id+"\nCGPA: "+cgpa+"\nMajor: "+major);
    }
}
