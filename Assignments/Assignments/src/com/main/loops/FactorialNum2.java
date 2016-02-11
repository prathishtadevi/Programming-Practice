package com.main.loops;

public class FactorialNum2 {

	public static void main(String[] args) {
		int num = 9;
		int result = factorial(num);
		System.out.println("The factorial of 9 is = " + result);
		
	}
	public static int factorial(int num){
		if (num == 0) {
	           return 1;
	       } else {
	           return num * factorial(num - 1);
	}

	}
}
