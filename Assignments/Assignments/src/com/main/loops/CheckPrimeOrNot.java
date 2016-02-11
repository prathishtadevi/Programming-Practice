package com.main.loops;


public class CheckPrimeOrNot {
	
	public boolean isPrimeNumber(int number){

        for(int i=2; i<=number/2; i++){

            if(number % i == 0){

                return false;
            }
        }
        return true;
    }


	public static void main(String[] args) {
		CheckPrimeOrNot cpn = new CheckPrimeOrNot();
        System.out.println("Is 7prime number? "+cpn.isPrimeNumber(7));
        System.out.println("Is 9 prime number? "+cpn.isPrimeNumber(9));
        System.out.println("Is 13 prime number? "+cpn.isPrimeNumber(13));

	}
	}
		
		



