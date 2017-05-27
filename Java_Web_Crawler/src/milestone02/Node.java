package milestone02;

public class Node {
    private Object data;
    private Node next;

    public Node(Object obj) {
        this.data = obj;
        this.next = null;
    }
    
    public void setNext(Node next) {
    	this.next = next;
    }
    public Node getNext() {
        return this.next;
    }
    public Object getData() {
        return this.data;
    }
}
