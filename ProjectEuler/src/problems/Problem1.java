package problems;

public class Problem1 {
	
	/*
	 If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
	 Find the sum of all the multiples of 3 or 5 below 1000. 
	 
	 */

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		System.out.println("Start Time : " + String.valueOf(startTime));
		
		int maxNumber = 1000;
		int firstNumber = 3;
		int secondNumber = 5;
		
		int finalSum = 0;
		
		for(int i=1; i < maxNumber;i++){
			
			//if((i % 3 == 0 && i%5 !=0) || (i % 5 == 0 && i % 3 !=0)){
			// Number can be divisible by both like 15
			if((i % 3 == 0 ) || (i % 5 == 0)){
					finalSum = finalSum + i;
					//System.out.println("i is :" + String.valueOf(i));
			}
			
		}
		
		System.out.println("MaxNumber : " + String.valueOf(maxNumber));
		System.out.println("factor Numbers : " + String.valueOf(firstNumber)+","+ String.valueOf(secondNumber));
		System.out.println("Final Sum : " + String.valueOf(finalSum));
		
		System.out.println("End Time : " + String.valueOf(System.currentTimeMillis()));
		System.out.println("Total Execution Time in millisecond :" + String.valueOf((System.currentTimeMillis() - startTime)));
		
	}

}
