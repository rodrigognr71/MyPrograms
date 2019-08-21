package controller;

import model.ManagerStudent;
import model.Student;
import view.MainWindows;
import view.StudentPanel;

import javax.swing.*;

public class MainController {
    private ManagerStudent managerStudent;
    private MainWindows mainWindows;
    private StudentPanel studentPanel;



    public MainController(ManagerStudent managerStudent, MainWindows mainWindows) {
        this.managerStudent = new ManagerStudent();
        this.mainWindows = mainWindows;
    }

    public void initController() {
        this.mainWindows.init();
        mainWindows.getStudentPanel().getSaveStudentButton().addActionListener(e -> saveStudent());
        mainWindows.getStudentPanel().getSearchStudentButton().addActionListener(e -> searchByUser());
        mainWindows.getStudentPanel().getPreviousStudentButton().addActionListener(e -> previous());
        mainWindows.getStudentPanel().getNextStudentButton().addActionListener(e -> next());
    }

    private void saveStudent(){
        Student student = new Student(mainWindows.getStudentPanel().getFirstnameTextField().getText(),
                mainWindows.getStudentPanel().getLastnameTextField().getText(),
                Integer.parseInt(mainWindows.getStudentPanel().getRFIDField().getText()));
        showStudent(student);
        managerStudent.addStudent(student);

        managerStudent.addStudent(student);
        JOptionPane.showMessageDialog(null, "User saved : " + student.getFullName()
                , "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showStudent(Student student) {

        mainWindows.getStudentPanel().getFirstnameTextField().setText(student.getName());
        mainWindows.getStudentPanel().getLastnameTextField().setText(student.getLastName());
        mainWindows.getStudentPanel().getRFIDField().setText("" + student.getRFID());
    }

    public void searchByUser() {

        Student studentSearched = this.managerStudent.searchStudent(mainWindows.getStudentPanel().getFirstnameTextField().getText(),
                mainWindows.getStudentPanel().getLastnameTextField().getText(),
                Integer.parseInt(mainWindows.getStudentPanel().getRFIDField().getText()));
        if (studentSearched != null) {
            showStudent(managerStudent.getStudents().getCurrentValue());
        }
    }

    private void previous() {
        this.managerStudent.previousStudent();
        if(managerStudent.getStudents().getCurrentValue()!= null){
            showStudent(managerStudent.getStudents().getCurrentValue());
        }
        else {
            JOptionPane.showMessageDialog(null, "User not found", "Info", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void next() {
        this.managerStudent.nextStudent();
        showStudent(managerStudent.getStudents().getCurrentValue());
    }
}
