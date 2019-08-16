package controller;

import model.ManagerStudent;
import model.Student;
import view.MainWindows;
import view.StudentPanel;

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
    }

    /*public void initView() {
        mainWindows.getFirstnameTextField().setText("");
        mainWindows.getLastnameTextField().setText("");
    }



    private void showStudent(Student student) {

       mainWindows.getFirstnameTextField().setText(student.getName());
       mainWindows.getLastnameTextField().setText(student.getLastName());
       mainWindows.getRFIDField().setText("" + student.getRFID());
    }



    private void searchStudent(){
        Student student = new Student(mainWindows.getFirstnameTextField().getText(), mainWindows.getLastnameTextField().getText(),
                Integer.parseInt(mainWindows.getRFIDField().getText()));
        Student studentSerarched = this.managerStudent.searchStudent(student.getName(),student.getLastName()
                ,student.getRFID()); }
    private void previousStudent(){

    }*/
}
