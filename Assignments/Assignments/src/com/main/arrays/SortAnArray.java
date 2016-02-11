package com.main.arrays;

import java.util.Arrays;

public class SortAnArray {
	public static void main(String [] args) {
		int[] arrnum;
		arrnum = new int[10];
		
		arrnum[1]= 20;
		arrnum[2]= 10;
		arrnum[3]= 60;
		arrnum[4]= 100;
		arrnum[5]= 30;
		arrnum[6]= 70;
		arrnum[7]= 90;
		arrnum[8]= 40;
		arrnum[9]= 80;
		arrnum[0]= 50;
		
		Arrays.sort(arrnum);
		int i;
		for(i=0; i < arrnum.length; i++) {
			System.out.println("num " + arrnum[i]);
		}
		
		

		
		
		
	}

}
