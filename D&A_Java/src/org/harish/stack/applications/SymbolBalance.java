package org.harish.stack.applications;

import java.util.Stack;

public class SymbolBalance {
	
	private Stack<Character> stack = new Stack<Character>();
	
	public boolean checkSymbolBalance(String input){
		boolean isSymbolBalanced = false;
		char[] charArray = input.toCharArray();
		for(int i = 0; i<= charArray.length-1 ; i++){
			if(charArray[i] == '('){
				stack.push(charArray[i]);
			}else if(charArray[i] == ')'){
				Character popChar = stack.pop();
				if(popChar != charArray[i]){
					System.out.println("Error");
				}
			}
		}
		
		return isSymbolBalanced;
		
	}
	
	// Driver Code
	public static void main(String[] args) {
		String exp = "(A+B)(C+D)";
		SymbolBalance sb = new SymbolBalance();
		sb.checkSymbolBalance(exp);
		
	}

}
