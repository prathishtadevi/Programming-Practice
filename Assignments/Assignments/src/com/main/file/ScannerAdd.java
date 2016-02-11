package com.main.file;

import java.util.Scanner;

public class ScannerAdd {

	public static void main(String[] args) {
		
		int x;
		int y;
		int z;
	      System.out.println("Enter two integers to calculate their sum ");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	      y = in.nextInt();
	      z = x + y;
	      System.out.println("Sum of entered integers = "+z);
	   }

		

	}


