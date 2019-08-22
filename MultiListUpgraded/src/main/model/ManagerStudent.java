package model;

import model.dataStructure.DoubleLinkedList;
import model.dataStructure.MultiList;

public class ManagerStudent {

  private MultiList<Student, Subject> students;

  public ManagerStudent() {
    this.students = new MultiList<>();
  }

  public void addStudent(String name, String lastName, int RFID) {
    Student student = new Student(name, lastName, RFID);
    this.students.addBack(student);
  }

  public Student nextStudent() {
    return this.students.next();
  }

  public Student previousStudent() {
    return this.students.previous();
  }

  public void addSubject(String name, String ID, int finalScore) {
    Subject subject = new Subject(name, ID, finalScore);
    this.students.addChildToCurrent(subject);
  }

  public Subject nextSubject() {
    return this.students.nextCurrentChild();
  }

  public Subject previousSubject() {
    return this.students.previousCurrentChild();
  }

  public Student searchStudent(String name, String lastName, int RFID) {
    Student student = new Student(name, lastName, RFID);
    return this.students.search(student);
  }

  public MultiList<Student, Subject> getStudents() {
    return this.students;
  }

  public Student student() {
    return this.students.getCurrentValue();
  }

  public DoubleLinkedList<Subject> getCurrentSubjects() {
    return this.students.getCurrentChildrenList();
  }

  public void addStudent(Student student) {
    this.students.addBack(student);
  }

}
