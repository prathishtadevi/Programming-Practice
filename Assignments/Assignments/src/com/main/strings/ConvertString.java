package com.main.strings;

public class ConvertString {
  public static void main(String [] args) {
	  
	  StringBuilder str = new StringBuilder ("This is nice");
	  System.out.println( "String " + str);
	  
	  str.insert (4, '1');
	  str.insert(8, '2');
	  str.insert(14, '3');
	  System.out.println(str.toString());
	  
	  
  }
}
