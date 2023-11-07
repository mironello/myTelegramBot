package MyLinkedList;

public class Node <T> {
    private T value;
    private Node nextNode;
    private Node prevNode;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public Node() {
    }

    public Node(T value, Node prevNode, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }
}
