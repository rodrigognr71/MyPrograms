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
       // mainWindows.getStudentPanel().getSearchStudentButton().addActionListener(e -> searchByUser());
       // mainWindows.getStudentPanel().getPreviousStudentButton().addActionListener(e -> previous());
       // mainWindows.getStudentPanel().getNextStudentButton().addActionListener(e -> next());
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
    /*public void initView() {
        mainWindows.getFirstnameTextField().setText("");
        mainWindows.getLastnameTextField().setText("");
    }







    private void searchStudent(){
        Student student = new Student(mainWindows.getFirstnameTextField().getText(), mainWindows.getLastnameTextField().getText(),
                Integer.parseInt(mainWindows.getRFIDField().getText()));
        Student studentSerarched = this.managerStudent.searchStudent(student.getName(),student.getLastName()
                ,student.getRFID()); }
    private void previousStudent(){

    }*/
}
