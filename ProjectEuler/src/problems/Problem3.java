package problems;

import reference.Utility;

public class Problem3 {
	
	/*
	 * 	The prime factors of 13195 are 5, 7, 13 and 29.

		What is the largest prime factor of the number 600851475143 ?
	 */

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Start Time : " + String.valueOf(startTime));
		
		long iniNumber = 600851475143L;
		int i = 0;
		int primeNum = 3; 
		
		while ( i < 1000){
			if(iniNumber % primeNum == 0) {
				iniNumber = iniNumber/primeNum;
				System.out.println("Step : " +String.valueOf(i) +  "   Prime Number is : " + String.valueOf(primeNum) + "     IniNumber is : " + String.valueOf(iniNumber));
			}
		
			primeNum = Utility.nextPrime(primeNum);
			i++;
		}
		
		System.out.println("End Time : " + String.valueOf(System.currentTimeMillis()));
		System.out.println("Total Execution Time in millisecond :" + String.valueOf((System.currentTimeMillis() - startTime)));

	}

}
