package sample;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Tooltip write_btn_TT;
    @FXML
    private TextField idTxt;
    @FXML
    private TextField nameTxt;
    @FXML
    private TextField cgpaTxt;
    @FXML
    private Label errorID;
    @FXML
    private Label errorName;
    @FXML
    private Label errorCGPA;
    @FXML
    private TableView<Student> table;
    @FXML
    private TableColumn<Student, Boolean> col_hl;
    @FXML
    private TableColumn<Student, Integer> col_id;
    @FXML
    private TableColumn<Student, String> col_name;
    @FXML
    private TableColumn<Student, Double> col_cgpa;

    ObservableList<Student> observableList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        col_hl.setCellValueFactory(new PropertyValueFactory<>("isInHonorList"));
        col_id.setCellValueFactory(new PropertyValueFactory<>("id"));
        col_name.setCellValueFactory(new PropertyValueFactory<>("name"));
        col_cgpa.setCellValueFactory(new PropertyValueFactory<>("cgpa"));
    }

    public void addToBtnActionPerformed(ActionEvent actionEvent) {
        boolean isInHonorList = false, exc = false;
        int id = 0; String name = ""; double cgpa = 0;

        // Default no error
        errorID.setText(""); errorName.setText(""); errorCGPA.setText("");

        // Validity check
        try{
            if(nameTxt.getText().trim().isEmpty()){
                throw new EmptyFieldException();
            }
            name = nameTxt.getText();
        } catch (EmptyFieldException e) {
            if(nameTxt.getText().trim().isEmpty()) {
                errorName.setText("Field is empty!");
            }
            exc = true;
        }

        try {
            if(idTxt.getText().trim().isEmpty()){
                throw new EmptyFieldException();
            }
            id = Integer.parseInt(idTxt.getText());
        } catch (NumberFormatException | EmptyFieldException exception){
            if(idTxt.getText().trim().isEmpty()) {
                errorID.setText("Field is empty!");
            }
            else {
                errorID.setText("Invalid ID!");
            }
            exc = true;
        }

        try {
            if(cgpaTxt.getText().trim().isEmpty()){
                throw new EmptyFieldException();
            }
            cgpa = Double.parseDouble(cgpaTxt.getText());
            if(cgpa < 0.0 || cgpa > 4.0){
                throw new InvalidCGPAException();
            }
        } catch (NumberFormatException | InvalidCGPAException | EmptyFieldException exception) {
            if(cgpaTxt.getText().trim().isEmpty()) {
                errorCGPA.setText("Field is empty!");
            }
            else {
                errorCGPA.setText("Invalid CGPA!");
            }
            exc = true;
        } 

        if(!exc) {
            if(cgpa > 3.8) isInHonorList = true;
            Student student = new Student(isInHonorList, id, name, cgpa);
            observableList.add(student);
            table.setItems(observableList);
        }
    }

    public void writeToTextAction(ActionEvent actionEvent) {

        try{
            ObservableList<Student>observableList = table.getItems();
            if(observableList.size() == 0){
                throw new TableIsEmptyException();
            }

            try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student.txt"))){

            } catch (IOException exception) {
                System.out.println(exception);
            }

        } catch (TableIsEmptyException exception) {
            write_btn_TT.setText("Table is empty!");
        }
    }

    public void displayAction(ActionEvent actionEvent) {
    }

    private class InvalidCGPAException extends Exception {
        public InvalidCGPAException() {
            super();
        }
    }

    private class EmptyFieldException extends Exception {
        public EmptyFieldException(){
            super();
        }
    }

    private class TableIsEmptyException extends Exception {
        public TableIsEmptyException(){
            super();
        }
    }
}
