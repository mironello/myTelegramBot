package MyQueue;

public class MyQueue<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;
    private int size;

    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        if (isEmpty()) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
            lastNode = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }

    public T peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return firstNode.getValue();
    }

    public T poll (){
        T val = firstNode.getValue();
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        firstNode = firstNode.getNextNode();
        size--;
        if(isEmpty()){
            lastNode = null;
        }

        return val;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public static void main(String[] args) {
        MyQueue<String>  que = new MyQueue<String>();
        que.add("asd0");
        que.add("asd1");
        que.add("asd2");
        que.add("asd3");
        que.add("asd4");

        System.out.println(que.size());
        System.out.println(que.peek());
        System.out.println(que.poll());
        System.out.println(que.size());
        que.clear();
        System.out.println(que.size());

    }
}
