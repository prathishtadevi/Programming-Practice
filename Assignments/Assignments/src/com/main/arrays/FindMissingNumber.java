package com.main.arrays;

public class FindMissingNumber {

	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,7,8,9,10};
		int asum = 0, sum = 0;
		for (int i=0; i<=10; i++)
			sum= sum +i;
		for ( int i=0; i<a.length; i++)
			asum = asum +a[i];
		int misssum = sum - asum;
		{ System.out.println("missing number " + misssum);
	
	}

}
}
