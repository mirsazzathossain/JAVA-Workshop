package abstractclass.person.users;

public class Faculty extends Employee {
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
}
