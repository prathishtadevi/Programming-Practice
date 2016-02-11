package com.main.collections;

import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {

	public static void main(String[] args) {
		
		int [] arr = {10,10,20,30,40,50,40,50,};
		Set<Integer>set = new HashSet<Integer>();
		for(int i=0; i< arr.length; i++)
			if(set.add(arr[i]) == false)
			{
			System.out.println("Duplicate Element is found :" + arr[i]);
			}
		
	}

}
