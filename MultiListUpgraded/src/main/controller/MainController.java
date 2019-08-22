package controller;

import javax.swing.JOptionPane;
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

  private void saveStudent() {
    Student student = new Student(mainWindows.getStudentPanel().getFirstnameTextField().getText(),
        mainWindows.getStudentPanel().getLastnameTextField().getText(),
        Integer.parseInt(mainWindows.getStudentPanel().getRFIDField().getText()));
    showStudent(student);
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

    Student studentSearched = this.managerStudent
        .searchStudent(mainWindows.getStudentPanel().getFirstnameTextField().getText(),
            mainWindows.getStudentPanel().getLastnameTextField().getText(),
            Integer.parseInt(mainWindows.getStudentPanel().getRFIDField().getText()));
    if (studentSearched != null) {
      JOptionPane
          .showMessageDialog(null,
              "User founded: "
                  + managerStudent.getStudents().getCurrentValue().getFullName(),
              "Info",
              JOptionPane.INFORMATION_MESSAGE);

      showStudent(managerStudent.getStudents().getCurrentValue());
    } else {
      JOptionPane
          .showMessageDialog(null,
              "User not found",
              "Info",
              JOptionPane.INFORMATION_MESSAGE);
    }

  }

  private void previous() {
    System.out.println("In event");
    Student student = this.managerStudent.previousStudent();
    if (student != null) {
      showStudent(managerStudent.getStudents().getCurrentValue());
    } else {
      JOptionPane
          .showMessageDialog(null,
              "User not found",
              "Info",
              JOptionPane.INFORMATION_MESSAGE);
    }
    System.out.println("Out event");
  }

  private void next() {
    Student student = this.managerStudent.nextStudent();
    if (student != null) {
      showStudent(managerStudent.getStudents().getCurrentValue());
    } else {
      JOptionPane
          .showMessageDialog(null,
              "User not found",
              "Info",
              JOptionPane.INFORMATION_MESSAGE);
    }
  }
}
