package model.dataStructure;

//public class MultiNode<E,T> extends Node {
//      protected DoubleLinkedList<T> children;
//
//
//    public MultiNode(Node<E> previousNode, E data, Node<E> nextNode) {
//        super(previousNode, data, nextNode);
//    }
//
//    public DoubleLinkedList<T> getChildren() {
//        return children;
//    }
//
//    public void setChildren(DoubleLinkedList<T> children) {
//        this.children = children;
//    }
//}

public class MultiNode<E,T>  {
    protected E value;
    protected DoubleLinkedList<T> children;

    public MultiNode(E value) {
        children = new DoubleLinkedList<>();
        this.value = value;
    }

    public DoubleLinkedList<T> getChildren() {
        return children;
    }

    public void setChildren(DoubleLinkedList<T> children) {
        this.children = children;
    }

    public boolean equals(MultiNode<E,T> multiNode){
        return multiNode.value.equals(value);
    }
}
