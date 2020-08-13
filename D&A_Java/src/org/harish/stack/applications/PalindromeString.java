package org.harish.stack.applications;

public class PalindromeString {

	public Boolean isStringPalindrome(String str){
		Boolean isStringPalindrome = Boolean.FALSE;
		int i = 0 , j = str.length()-1; 
		while(i < j && str.charAt(i) == str.charAt(j)){
			i++;
			j--;
		}
		if(i<j)
			return isStringPalindrome;
		else
			return isStringPalindrome= Boolean.TRUE;
	}

	// Driver Code 
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
 