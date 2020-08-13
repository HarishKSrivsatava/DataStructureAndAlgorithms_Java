package org.harish.stack.impl;

public class StackImpl_SimpleArray {

	public int top = -1;
	public int cap = 10;// Default capacity
	private int[] arr;

	public StackImpl_SimpleArray() {
		arr = new int[cap];
	}

	public StackImpl_SimpleArray(int capcity) {
		cap = capcity;
		arr = new int[cap];
	}

	public void printStack() {
		for (int i = 0; i <= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	System.out.println();
	}
	

	public void push(int data) {
		if (top == cap) {
			System.out.println("\nOVERFLOW");
		}
		arr[++top] = data;
	}

	public int pop() {
		int data = 0;
		if (top == -1) {
			System.out.println("\nUNDERFLOW");
		} else {
			data = arr[top];
			top -= 1;
		}
		return data;
	}

	// Driver code
	public static void main(String[] args) {
		StackImpl_SimpleArray stackImpl_SimpleArray = new StackImpl_SimpleArray();
		stackImpl_SimpleArray.printStack();
		stackImpl_SimpleArray.push(10);
		stackImpl_SimpleArray.push(20);
		stackImpl_SimpleArray.printStack();
		stackImpl_SimpleArray.pop();
		stackImpl_SimpleArray.push(30);
		stackImpl_SimpleArray.printStack();
		stackImpl_SimpleArray.pop();	
		stackImpl_SimpleArray.pop();	
		stackImpl_SimpleArray.push(40);
		stackImpl_SimpleArray.push(50);
		stackImpl_SimpleArray.printStack();
		
	}
}
