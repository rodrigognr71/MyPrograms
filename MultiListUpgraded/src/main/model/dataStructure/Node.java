package model.dataStructure;

public class Node<T> {
    protected T data;
    protected Node<T> previousNode;
    protected Node<T> nextNode;

    public Node(Node<T> previousNode, T data, Node<T> nextNode) {
        this.data = data;
        this.previousNode = previousNode;
        this.nextNode = nextNode;
    }
}
