package model.dataStructure;

import model.Student;
import model.Subject;

import java.util.NoSuchElementException;

public class MultiList {
    private NodeStudent firstStudent;
    private NodeStudent lastStudent;
    private NodeSubject firstSubject;
    private NodeSubject lastSubject;

    public void addStudent(Student student) {
        final NodeStudent currentLast = lastStudent;
        final NodeStudent newNode = new NodeStudent(currentLast, student, null);
        lastStudent = newNode;
        if (currentLast == null) {
            firstStudent = newNode;
        }
        else {
            currentLast.nextNodeStudent = newNode;
        }
    }

    public void addSubject(Subject subject){
        final NodeSubject currentSubjectLast = lastSubject;
        final NodeSubject newNode = new NodeSubject(currentSubjectLast, subject, null);
        lastSubject = newNode;
        if (lastSubject == null) {
            firstSubject = newNode;
        }
        else {
            currentSubjectLast.nextNodeSubject = newNode;
        }
    }

    public void nextStudent(Student student){
       
    }



}
