package MyLinkedList;

public class MyLinkedList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;

    public void add(T value) {
        if (firstNode == null) {
            firstNode = new Node<T>(value, null, null);
        } else if (lastNode == null) {
            lastNode = new Node<T>(value, firstNode, null);
            firstNode.setNextNode(lastNode);
        } else {
            Node<T> newLastNode = new Node<T>(value, lastNode, null);
            lastNode.setNextNode(newLastNode);
            lastNode = newLastNode;
        }
    }

    public T get(int index) {
        Node<T> currentNode = firstNode;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNextNode();
        }
        return currentNode.getValue();
    }

    public void remove(int index) {
        Node<T> currentNode = firstNode;
        if ((index < 0) || (index > size())) {
            System.out.println("Incorrect index value");
        } else if (index == 0) {
            currentNode = firstNode;
        }
        for (int i = 0; i < index - 1; i++) {
            currentNode = currentNode.getNextNode();
        }
        currentNode.setNextNode(currentNode.getNextNode().getNextNode());
    }

    public int size() {
        int size = 0;
        Node<T> currentNode = firstNode;
        if (currentNode == null) {
            return size;
        } else {
            while (currentNode.getNextNode() != null) {
                size++;
                currentNode = currentNode.getNextNode();
            }
            return size + 1;
        }
    }

    public void clear() {
        this.firstNode = null;
        this.lastNode = null;
    }


    public static void main(String[] args) {
        MyLinkedList<String> ll = new MyLinkedList<String>();

        ll.add("add0");
        ll.add("add1");
        ll.add("add2");
        ll.add("add3");
        ll.add("add4");
        ll.add("add5");
//        ll.clear();
        ll.remove(4);
        System.out.println(ll.size());

        System.out.println(ll.get(4));


    }
}
