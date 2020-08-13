package org.harish.linkedlist.app;

import org.harish.linkedlist.impl.SingleListNode;
public class LengthOfLinkedList {

	SingleListNode head;
	SingleListNode  next;
	
	public int findLength(){
		int length = 0;
		if(head == null)
			return length;
		while(head != null){
			++length;
			head = head.getNext();
		}
		return length;
	}
	
	public int findLengthByRecursion(){
		return getCountRec(head);
	}
	
	private int getCountRec(SingleListNode node){
		//Base case
		if(node == null)
			return 0;
		return 1 + getCountRec(node.getNext());
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
		LengthOfLinkedList lll = new LengthOfLinkedList();
		lll.insert(10, 0);
		lll.insert(20, 1);
		lll.insert(30, 2);
		lll.insert(40, 3);
		System.out.println(lll.toString());
		//System.out.println("Length of the Linked List : " + lll.findLength());
		System.out.println("Length of the Linked List (Recursion) : " + lll.findLengthByRecursion());
		
		
	}
}
