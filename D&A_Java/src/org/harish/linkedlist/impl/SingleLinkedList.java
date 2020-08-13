package org.harish.linkedlist.impl;

public class SingleLinkedList {

	SingleListNode head;
	int lengthOfSLL = 0;

	public void insertAtBeginning(SingleListNode node) {
		node.setNext(head);
		head = node;
		lengthOfSLL++;
	}

	public void insertAtEnd(SingleListNode node) {
		if (head == null)
			head = node;
		else {
			SingleListNode p, q;
			for (p = head; (q = p.getNext()) != null; p = q); // q is assigned as next node of p
			p.setNext(node);
		}
		lengthOfSLL++;
	}

	public void insert(int data, int position) {
		if (position < 0)
			position = 0;
		if (position > lengthOfSLL)
			position = lengthOfSLL;
		if (head == null) {
			head = new SingleListNode(data);
			lengthOfSLL++;
		} else if (position == 0) {
			SingleListNode temp = new SingleListNode(data);
			temp.setNext(head);
			head = temp;
			lengthOfSLL++;
		} else {
			SingleListNode temp = head;
			for (int i = 1; i < position; i++) {
				temp = temp.getNext();
			}
			SingleListNode newNode = new SingleListNode(data);
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
			lengthOfSLL++;
		}

	}

	public void removeFromBegin(){
	 
		head = head.getNext();
		lengthOfSLL--;
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
		SingleLinkedList ssl = new SingleLinkedList();
		System.out.println(ssl.toString());
		SingleListNode node = new SingleListNode(10);
		ssl.insertAtBeginning(node);
		SingleListNode node2 = new SingleListNode(20);
		ssl.insertAtBeginning(node2);
		System.out.println(ssl.toString());
		SingleListNode node3 = new SingleListNode(30);
		ssl.insertAtEnd(node3);
		System.out.println(ssl.toString());

		ssl.insert(1, 0); // Insert 1 at index 0
		System.out.println(ssl.toString());
		ssl.insert(6, 1); // Insert 6 at index 1
		System.out.println(ssl.toString());
		ssl.insert(9, 2);// Insert 9 at index 2
		System.out.println(ssl.toString());

		ssl.insert(110, 90);// Insert 110 at index 90 : This will be inserted at  the last index
		System.out.println(ssl.toString());
		
		
		ssl.removeFromBegin(); // Removing the first element
		System.out.println(ssl.toString());
	}

}
