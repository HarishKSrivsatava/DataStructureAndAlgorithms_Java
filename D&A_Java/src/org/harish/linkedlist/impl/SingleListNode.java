package org.harish.linkedlist.impl;

public class SingleListNode {

	int data;
	SingleListNode next;
	
	
	public SingleListNode(int data) {
		super();
		this.data = data;
		this.next = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public SingleListNode getNext() {
		return next;
	}
	public void setNext(SingleListNode next) {
		this.next = next;
	}
	
}
