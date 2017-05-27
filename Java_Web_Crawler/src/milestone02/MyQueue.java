package milestone02;

import java.util.List;
import java.util.ArrayList;


public class MyQueue {
    //head is first node
	Node head;
    Node foot; // foot is last node
    private int count;
    
    public MyQueue () {
    	this.head = null;
    	this.foot = null;
    	
    }
   
    public void add(Object element) {
    	Node newNode = new Node(element);
    	if(head == null ){
    		this.head = newNode;
    		this.foot = newNode;
    	}else{
    		foot.setNext(newNode); //next is already null
        	this.foot = newNode;
    	}
    	count++;
    }
    
    public Node remove() {
    	Node r = head;
    	if(r == null){
    		return r;
    	}
    	head = head.getNext();
    	count--;
    	return r;
    }
    public Node peek(){
        return this.head;
    }

    public boolean isEmpty() {
        if(count == 0){
        	return true;
        }else{
        	return false;
        }
    }

    public int size(){
    	return this.count;
    }


    public Object getData(){
        return this.head;
    }

//    public static void main(String args[]){
//        MyQueue mq = new MyQueue();
//        mq.add("hello");
//        mq.add("hi");
//       // System.out.println(mq.peek().getData());
//        System.out.println(mq.getData());
//    }
}
