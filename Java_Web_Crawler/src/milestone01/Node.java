package milestone01;

public class Node {
    private Object data;
    private Node next;

    public Node(Object obj) {
        this.data = obj;
    }
    public void setNext(Node next) {}
    public Node getNext() {
        return next;
    }
    public Object getData() {
        return data;
    }
}
