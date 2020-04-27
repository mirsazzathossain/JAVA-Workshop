package abstractclass.person.users;


public class Student extends Person {
    private int ID;
    private float CGPA;
    private String major;
    static String university = "IUB";

    Student(){
        super();
        ID = 0;
        CGPA = 0.0f;
        major = "TBA";
    }

    public Student(String name, String dob, String gender, int ID, float CGPA, String major) {
        super(name, dob, gender);
        this.ID = ID;
        this.CGPA = CGPA;
        this.major = major;
    }

    @Override
    public void show() {
        System.out.println("Student info: ");
        System.out.println("Name: "+name+"\nDate of birth: "+dob+"\nGender: "+gender);
        System.out.println("University: "+university+"\nID: "+ID+"\nCGPA: "+CGPA+"\nMajor: "+major);
    }
}
