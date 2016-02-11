package com.main.loops;

public class PingPong {
	public static void main(String [] args){
		
		int numCount = 100;
		for (int i=0; i<numCount; i++){
			if( i % 3 == 0){
				System.out.println("Ping");
			}
				
			if (i % 5 == 0){
		          System.out.println("Pong");
			}
		     if (i % 3 == 0 || i % 5 == 0){
		    	 System.out.println("PingPong");
		     }
		    	 
		    	 else{
		    		 System.out.println(i);
		    			    	 
		     }
		      	          
				}
				
			}
		
}	
	


