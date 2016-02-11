package com.main.collections;

import java.util.Arrays;

public class MergeArrays {
	public static void main(String [] args){
		int [] A = {10,20,30};
		int [] B = {100,200,300};
		int [] merge = new int [A.length + B.length];
		for (int i=0; i<A.length; i++) {
			merge[i] = A[i];
		}
		for (int i=0; i<B.length; i++) {
			merge[i + A.length] = B[i];
		}
		System.out.println(Arrays.toString(merge));
	}

}
