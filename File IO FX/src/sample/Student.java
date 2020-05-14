package sample;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Student {
    private SimpleBooleanProperty isInHonorList;
    private SimpleIntegerProperty id;
    private SimpleStringProperty name;
    private SimpleDoubleProperty cgpa;

    public Student(boolean isInHonorList, int id, String name, double cgpa) {
        this.isInHonorList = new SimpleBooleanProperty(isInHonorList);
        this.id = new SimpleIntegerProperty(id);
        this.name = new SimpleStringProperty(name);
        this.cgpa = new SimpleDoubleProperty(cgpa);
    }

    public boolean isIsInHonorList() {
        return isInHonorList.get();
    }

    public void setIsInHonorList(boolean isInHonorList) {
        this.isInHonorList.set(isInHonorList);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getName() {
        return name.get();
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public double getCgpa() {
        return cgpa.get();
    }

    public void setCgpa(double cgpa) {
        this.cgpa.set(cgpa);
    }


}

