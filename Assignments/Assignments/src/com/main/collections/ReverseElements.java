package com.main.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseElements {

	public static void main(String[] args){
		List list = new LinkedList();
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		list.add("Dates");
		list.add("Fig");
		
		ListIterator iter = list.listIterator(list.size());
		
		while (iter.hasPrevious()) {
		      System.out.println(iter.previous());
		    }
		

	}

}
