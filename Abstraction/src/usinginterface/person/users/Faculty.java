package usinginterface.person.users;

public class Faculty extends Employee implements Researcher,HOD{
    private String school;
    Faculty(){
        super();
        school = "TBA";
    }

    public Faculty(String name, String dob, String gender, int ID, String designation, String department, float salary, String school) {
        super(name, dob, gender, ID, designation, department, salary);
        this.school = school;
    }

    @Override
    public void show() {
        System.out.println("Faculty info: ");
        System.out.println("Name: "+name+"\nDate of birth: "+dob+"\nGender: "+gender);
        System.out.println("ID: "+ID+"\nDesignation: "+designation+"\nDepartment: "+department+"\nSalary: "+salary);
        System.out.println("School: "+school);
    }

    @Override
    public void conductResearch() {
        System.out.println("Research is conducted!");
    }

    @Override
    public void writePaper() {
        System.out.println("Paper is written!");
    }

    @Override
    public void submitPaper() {
        System.out.println("Paper is submitted for publication!");
    }
}
