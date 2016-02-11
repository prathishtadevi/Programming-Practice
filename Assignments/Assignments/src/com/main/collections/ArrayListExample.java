package com.main.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListExample {

 public static void main(String[] args){
		
		 // To create an ArrayList and add and remove elements to it.
			
			
	ArrayList <String>fruits=new ArrayList<String>();
		  
		  fruits.add("Apple");
		  fruits.add("Banana");
		  fruits.add("Cherry");
		  fruits.add("Dates");
		  
		  System.out.println("Fruits name is" + fruits);
	
		  		   
		  Iterator itr=fruits.iterator();
		       while(itr.hasNext()) 
		       { 	   
		     		      System.out.println("The Fruits in the List are:  " + itr.next());
		       }
		       
		       {
		    	   System.out.println(fruits.contains("Cherry"));
		       }
		  
		    

		  

}
}
	
	
		
		  
		
		
		
		