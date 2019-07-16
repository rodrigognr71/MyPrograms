package model.dataStructure;

import model.Subject;

public class NodeSubject<T> {
    protected T subject;
    protected NodeSubject<T> previousNodeSubject;
    protected NodeSubject<T> nextNodeSubject;

    public NodeSubject(NodeSubject<T> previousNodeSubject, T subject, NodeSubject<T> nextNodeSubject) {
        this.subject = subject;
        this.previousNodeSubject = previousNodeSubject;
        this.nextNodeSubject = nextNodeSubject;
    }
}
