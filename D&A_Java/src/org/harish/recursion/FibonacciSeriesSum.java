package org.harish.recursion;

public class FibonacciSeriesSum {

	public static int  fibonacciSum(int i){
		if(i <= 1)
			return i;
		else {
		   return fibonacciSum(i-1) + fibonacciSum(i-2);	
		}
	}
	
	public static void main(String[] args) {
		int i = 6;
		System.out.println("Fibonacci Series Sum of "+ i +" = " + fibonacciSum(i));
	}
}
