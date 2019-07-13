package model.dataStructure;

import model.Student;

public class MultiList {
    private NodeStudent first;
    private NodeStudent last;

    public void addStudent(Student student) {
        final NodeStudent currentLast = last;
        final NodeStudent newNode = new NodeStudent(currentLast, student, null);
        last = newNode;
        if (currentLast == null) {
            first = newNode;
        }
        else {
            currentLast.nextNodeStudent = newNode;
        }
    }


}
