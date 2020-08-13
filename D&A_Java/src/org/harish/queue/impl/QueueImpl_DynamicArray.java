package org.harish.queue.impl;

public class QueueImpl_DynamicArray {

	private int[] queue;
	private int size,front,rear, CAPACITY=1;
	
	public QueueImpl_DynamicArray(){
		queue = new int[CAPACITY];
		size = 0; 
		front = 0;
		rear = 0;
	}
	
	// Dynamically expending the array
	public void expand(){
		int[] newQueue = new int[CAPACITY*2];
		//copy all the elements form old queue to new queue
		for(int i = front ; i <= rear; i++){
			newQueue[i-front] = queue[i % CAPACITY];
		}
		queue = newQueue;
		front = 0;
		rear = size-1 ;
		CAPACITY *= 2;
	}
	// Enqueue
	public void enqueue(int data){
		if(size == CAPACITY)
			expand();
		size ++;
		queue[rear] = data;
		rear = (rear + 1) % CAPACITY;
		
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
   // Driver code
	public static void main(String[] args) {
		QueueImpl_DynamicArray queue = new QueueImpl_DynamicArray();
		System.out.println(queue.toString());
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		System.out.println(queue.toString());
		
	}
}
