package org.harish.stack.applications;

import java.util.Stack;
// Reverse a given stack using only abstract operations i.e. push and pop
public class StackReversalUsingAbstractOps {

	Stack stack  = new Stack<Integer>();
	public void reserveStack(Stack stack){
		if(!stack.isEmpty()){
			int temp = (int) stack.pop();
			reserveStack(stack);
			insertAtBottomStack(stack,temp);
		}
		
	}
	
	private void insertAtBottomStack(Stack stack, int temp) {
	 if(stack.isEmpty()){
		stack.push(temp);
		return;
	 }	
	 int temp2 = (int)stack.pop();
	 insertAtBottomStack(stack,temp);
	 stack.push(temp2);
		
	}
	
	//Driver Code
	public static void main(String[] args) {
		Stack stack  = new Stack<Integer>();
		for (int i  = 0 ; i <=10; i++){
			stack.push(i);
		}
		System.out.println(stack);
		StackReversalUsingAbstractOps s = new StackReversalUsingAbstractOps();
		s.reserveStack(stack);
		System.out.println(stack);
	}
	
}
