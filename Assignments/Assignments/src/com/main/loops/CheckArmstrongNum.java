package com.main.loops;

public class CheckArmstrongNum {
	
	public boolean isArmstrongNumber(int number){
        
        int num = number;
        
        int noOfDigits = String.valueOf(number).length();
        
        int sum = 0;
        
        int div = 0;
        
        while(num > 0)
        {
            div = num % 10;
            int temp = 1;
            for(int i=0;i<noOfDigits;i++){
                temp *= div;
            }
            sum += temp;
            num = num/10;
        }
        if(number == sum) {
        	
            return true;
        } else {
        	
            return false;
        }
	}
    
	public static void main(String[] args) {
		CheckArmstrongNum can = new CheckArmstrongNum();
        System.out.println("Is 423 Armstrong number? "+can.isArmstrongNumber(423));
        System.out.println("Is 323 Armstrong number? "+can.isArmstrongNumber(323));

        System.out.println("Is 153 Armstrong number? "+can.isArmstrongNumber(153));
        System.out.println("Is 54748 Armstrong number? "+can.isArmstrongNumber(54748));

		
	}

}
