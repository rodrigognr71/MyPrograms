package model.dataStructure;

import model.Subject;

public class NodeSubject {
    protected Subject subject;
    protected NodeSubject previousNodeSubject;
    protected NodeSubject nextNodeSubject;

    public NodeSubject(Subject subject) {
        this.subject = subject;
    }
}
