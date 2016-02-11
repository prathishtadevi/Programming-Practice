package com.main.exception;

public class NullPointerException {

	public static void main(String[] args) {
		
		
		
		try {
			String s = null;
		
			System.out.println("Enter a string length " + s.length());
		}
		catch(java.lang.NullPointerException ne) {
			System.out.println( "null pointer occured");
			ne.printStackTrace();
			
		}
		finally {
			System.out.println("finally executed");
		}

	}

}
