package com.main.loops;

public class SwapNumWithTemp {

	public static void main(String[] args) {
		int A = 10;
		int B = 20;
		int temp;
		System.out.println("Before Swap");
		System.out.println("A is value = " + A);
		System.out.println("B is value = " + B);
		
		temp = A;
		A = B;
		B = temp;
		System.out.println("After Swap");
		System.out.println("A is value = " + A);
		System.out.println("B is value = " + B);
		
				

	}

}
