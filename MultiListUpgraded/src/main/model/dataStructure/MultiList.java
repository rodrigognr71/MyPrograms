package model.dataStructure;


public class MultiList<E,T> {
    protected DoubleLinkedList<MultiNode<E,T>> doubleLinkedList;
    protected MultiNode<E,T> currentMultiNode;


    public MultiList() {
        doubleLinkedList = new DoubleLinkedList<>();
    }

    public void addBack(E value) {
        MultiNode<E,T> multiNode = new MultiNode<>(value);
        doubleLinkedList.addLast(multiNode);
        currentMultiNode = multiNode;
    }

/*    public void addSubject(Subject subject){
        final Node currentSubjectLast = lastNode;
        final Node newNode = new Node(currentSubjectLast, subject, null);
        lastNode = newNode;
        if (lastNode == null) {
            firstNode = newNode;
        }
        else {
            currentSubjectLast.nextNode = newNode;
        }
    }*/

    public  void addChildToFirst(T data){
        currentMultiNode.getChildren().addFirst(data);
    }

    public void addChildToCurrent(T data){
        currentMultiNode.getChildren().addLast(data);
    }

    public E previous(){
        currentMultiNode = doubleLinkedList.previous();
        return currentMultiNode.value;
    }

    public E next(){
        currentMultiNode = doubleLinkedList.next();
        return currentMultiNode.value;
    }

    public E search(E value){
       // MultiNode<E,T> iterator = doubleLinkedList.getFirst();
        MultiNode<E,T> comparator = new MultiNode<>(value);
        currentMultiNode = doubleLinkedList.search(comparator);

        return currentMultiNode.value;
    }

    public E removeCurrent(){
        currentMultiNode = doubleLinkedList.removeCurrent();
        return currentMultiNode.value;
    }

    public MultiNode<E, T> getCurrentMultiNode() {
        return currentMultiNode;
    }

    public void setCurrentMultiNode(MultiNode<E, T> currentMultiNode) {
        this.currentMultiNode = currentMultiNode;
    }

    /* public E nextE(){
        if (currentMultiNode != null && currentMultiNode.nextMultiNode != null){
            currentMultiNode = currentMultiNode.nextMultiNode;
        }
        return currentMultiNode.value;
    }

    public E searchStudent(E student){
        MultiNode<E, T> current = first;
        while (current != null) {
            if (current.value.equals(student)) {
                currentMultiNode = current;
                return currentMultiNode.value;
            } else {
                if (current.nextNode != null) {
                    current = current.nextMultiNode;
                } else {
                    break;
                }
            }
        }
        return null;
    }

*/
}
