package org.harish.queue.impl;

public class QueueImpl_SimpleArray {

	private int[] queue;
	private int size, rear, front, CAPACITY = 4;

	// Default constructor
	public QueueImpl_SimpleArray() {
		queue = new int[CAPACITY];
		size = 0;
		rear = 0;
		front = 0;
	}

	public String toString() {
		String result = "[";
		for (int i = 0; i < size; i++) {
			result += Integer.toString(queue[front + i % CAPACITY]);
			if (i < size - 1) {
				result += ",";
			}
		}
		result += "]";
		return result;
	}

	public int size() {
		return size;
	}

	// Enqueue
	public void enqueue(int data) {
		if (size() > CAPACITY) {
			throw new IllegalStateException("overflow");
		}
		size++;
		queue[rear] = data;
		rear = (rear + 1) % CAPACITY;
	}

	// Dequeue
	public int dequeue() {
		if (size <= 0) {
			throw new IllegalStateException("underflow");
		}
		size--;
		int data = queue[front % CAPACITY];
		front = (front + 1) % CAPACITY;
		return data;
	}

	// Driver code
	public static void main(String[] args) {
		QueueImpl_SimpleArray queue = new QueueImpl_SimpleArray();
		//queue.dequeue();
		System.out.println(queue.toString());
		queue.enqueue(10);
		System.out.println(queue.toString());
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		System.out.println(queue.toString());
		System.out.println(queue.dequeue());
		System.out.println(queue.toString());
	}
}
