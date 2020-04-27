package usinginterface.person.users;


abstract class Employee extends Person{
    protected int ID;
    protected String designation, department;
    protected float salary;
    Employee(){
        super();
        ID = 0;
        designation = "TBA";
        department = "TBA";
        salary = 0.0f;
    }

    Employee(String name, String dob, String gender, int ID, String designation, String department, float salary) {
        super(name, dob, gender);
        this.ID = ID;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }
}
