package com.main.arrays;

public class FindLargest {
	

	 public static void main(String[] args) {
		 
		 int [] numbers = new int[] {88,33,44,55,66,77};
		 int num= numbers[0];
		 
		 for( int i=1; i<numbers.length; i++){
			 if ( num < numbers[i])
			 { num = numbers[i];
				
			 }
		 }
		 System.out.println("Largest number in array is  " + num);
		 
	 }
}
