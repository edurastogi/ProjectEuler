package problems;

public class Problem3 {
	
	/*
	 * 	The prime factors of 13195 are 5, 7, 13 and 29.

		What is the largest prime factor of the number 600851475143 ?
	 */

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Start Time : " + String.valueOf(startTime));
		
		System.out.println(String.valueOf(Math.sqrt(13195)));
		
		System.out.println("End Time : " + String.valueOf(System.currentTimeMillis()));
		System.out.println("Total Execution Time in millisecond :" + String.valueOf((System.currentTimeMillis() - startTime)));
		
		long i = 600851475143L;

	}

}
