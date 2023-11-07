package MyStack;

public class MyStack<T> {
    private Node<T> topNode;
    int size;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNextNode(topNode);
        size++;
    }

    public void remove(int index) {
        if (index < 0 || index <= size) {
            throw new IllegalStateException("Incorrect index");
        }
        if (index == 0) {
            topNode = topNode.getNextNode();
        } else {
            Node<T> current = topNode;
            for (int i = 0; i < index-1; i++) {
                current = current.getNextNode();
            }
            current.setNextNode(current.getNextNode().getNextNode());
        }
        size--;
    }

    public void clear(){
        topNode = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public T peek (){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        return topNode.getValue();
    }

    public T pop (){
        if(isEmpty()){
            throw new IllegalStateException("Stack is empty");
        }
        T value = topNode.getValue();
        topNode = topNode.getNextNode();
        size--;
        return value;
    }
    public boolean isEmpty() {
        return size == 0;
    }
}
