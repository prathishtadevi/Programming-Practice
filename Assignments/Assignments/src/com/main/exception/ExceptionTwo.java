package com.main.exception;
	
		class Test{
			 
			  void calculation(int a,int b)
			  {
				  int c=a/b;
				  System.out.println("Divided Value is " + c);
			  }
			  
			  }
		public class ExceptionTwo{
			 
				public static void main(String[] args) {
					try {
					Test t=new Test();
					t.calculation(10,0);
					}catch(ArithmeticException e){
						System.out.println("Exception Handled : " +e.getMessage());
					}
					

				}

	}


