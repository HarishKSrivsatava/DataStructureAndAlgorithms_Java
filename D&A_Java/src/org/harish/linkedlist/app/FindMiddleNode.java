package org.harish.linkedlist.app;

import org.harish.linkedlist.impl.SingleListNode;

public class FindMiddleNode {

	SingleListNode head;
	
	public void printMiddle() {
		SingleListNode slow_ptr = head;
		SingleListNode fast_ptr = head;
		while (slow_ptr != null && fast_ptr != null) {
			slow_ptr = slow_ptr.getNext();
			fast_ptr = fast_ptr.getNext().getNext();
		}
		System.out.println("Middle Node : " + slow_ptr.getData());
	}
	public void insert(int data , int position){
        if (position == 0){
        	head = new SingleListNode(data);
        }else{
        	SingleListNode node = head;
        	for(int i = 0; i < position-1 ; i++){
        		node = node.getNext();
        	}
        	SingleListNode newNode = new SingleListNode(data);
        	newNode.setNext(node.getNext());
        	node.setNext(newNode);
        }
	}
	public String toString() {
		String result = "[";
		if (head == null)
			return result + "]";
		result = result + head.getData();
		SingleListNode temp = head.getNext();
		while (temp != null) {
			result = result + "," + temp.getData();
			temp = temp.getNext();
		}
		return result + "]";

	}
	
	public static void main(String[] args) {
		FindMiddleNode fmn = new FindMiddleNode();
		fmn.insert(10, 0);
		fmn.insert(20, 1);
		fmn.insert(30, 2);
		fmn.insert(40, 3);
		//fmn.insert(50, 4);
		fmn.printMiddle();		
	}
}
