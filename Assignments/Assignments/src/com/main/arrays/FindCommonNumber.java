package com.main.arrays;
// Find Common Number in arrays//

public class FindCommonNumber {
	
	public static void main(String [] args){
		int[]arr1 = {2,4,6,8,10};
		int[]arr2 = {2,3,5,8,10,11,13};

		for (int i=0;i<arr1.length;i++){
			
		 for (int j=0;j<arr2.length;j++){
		
		  if (arr1[i]==arr2[j]){
			 
				System.out.println(arr1[i]);
			}
		  
			}
		}
	}
}
			
		
		 
		
	



