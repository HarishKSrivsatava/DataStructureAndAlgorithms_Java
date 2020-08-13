package org.harish.stack.applications;

import java.util.Stack;
public class PalindromeStringUsingStack {

	Stack<Character> stack = new Stack<Character>();
	public Boolean isStringPalindrome(String str){
		Boolean isStringPalindrome = Boolean.FALSE;
		int i =0;
		while(i <= str.length()-1 ){
			if(str.charAt(i) != 'X'){
				stack.push(str.charAt(i));
				++i;
			}
			
			
		}
		
		return isStringPalindrome;
		
	}
	
	public static void main(String[] args) {
		String testStr1 = "aabbXbbaa";
		String testStr2 = "aabbXbbaab";
		PalindromeString ps = new PalindromeString();
		Boolean stringPalindrome = ps.isStringPalindrome(testStr1);
		System.out.println("Is "+ testStr1 +" palindrome ? : " + stringPalindrome);
		Boolean stringPalindrome2 = ps.isStringPalindrome(testStr2);
		System.out.println("Is "+ testStr2 +" palindrome ? : " + stringPalindrome2);
	}
}
