package milestone01;

import java.util.List;
import java.util.ArrayList;
public class MyQueue {
    Node head;
    List <Object> list = new ArrayList<Object>();

    public Node add(Object element) {
        if(list.isEmpty()){
            this.head = new Node(element);
        }
        list.add(element);
        Node added = new Node(element);
        return added;
    }
    public Node remove() {
        if(list.isEmpty()){
            return null;
        }
        Node removed = new Node(list.get(0));
        list.remove(0);
        if(!list.isEmpty()) {
            this.head = new Node(list.get(0));
        }
        return removed;
    }
    public Node peek(){
        return this.head;
    }

    public boolean isEmpty() {
        if(list == null){
            return true;
        }
        if(list.size() == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return this.list.size();
    }


    public Object getData(){
        return this.head;
    }

    public static void main(String args[]){
        MyQueue mq = new MyQueue();
        mq.add("hello");
        mq.add("hi");
        System.out.println(mq.peek().getData());
    }
}
