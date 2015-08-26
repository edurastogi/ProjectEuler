package reference;

import java.util.ArrayList;

public class Utility {
	
	public static boolean IsPrime(int inputNum){
		
		if(inputNum == 2) return true;
		if(inputNum % 2 == 0) return false;
		for(int i = 3; i <=Math.sqrt(inputNum); i++){
			if (inputNum % i == 0 ) return false;
		}
		return true;
	}
	
	
	public static ArrayList<Integer> GetAllPrimes(int limit){
		
		boolean[] primes = calcPrimes(limit);
		ArrayList<Integer> finalList = new ArrayList<Integer>();
		for(int i =1; i<primes.length;i++) if(primes[i]) finalList.add(i);
		return finalList;
	}
	
	
	 public static int nextPrime (int number) {
	        if (number <= 0) {
	            throw new IllegalArgumentException("The value of n is " + number + ". It should be greater than 0");
	        }

	        int nextNum = number + 1;
	        boolean notPrime = true;
	        final ArrayList<Integer> primes = GetAllPrimes(number);

	        while (notPrime) {

	            notPrime = false;
	            for (int i : primes) {
	                if (nextNum % i == 0) {
	                    notPrime = true;
	                }
	            }
	            if (notPrime) {
	                nextNum++;
	            } 
	        }

	        return nextNum;
	    }
	
	private static boolean[] calcPrimes(int limit)
    {
        /** initialize the sieve **/
        boolean[] prime = new boolean[limit + 1];
        prime[2] = true;
        prime[3] = true;
        int root = (int) Math.ceil(Math.sqrt(limit));
 
        /** put in candidate primes: 
           integers which have an odd number of
           representations by certain quadratic forms **/
        for (int x = 1; x < root; x++)
        {
            for (int y = 1; y < root; y++)
            {
                int n = 4 * x * x + y * y;
                if (n <= limit && (n % 12 == 1 || n % 12 == 5))
                    prime[n] = !prime[n];
                n = 3 * x * x + y * y;
                if (n <= limit && n % 12 == 7)
                    prime[n] = !prime[n];
                n = 3 * x * x - y * y;
                if ((x > y) && (n <= limit) && (n % 12 == 11))
                    prime[n] = !prime[n];
            }
        }
        /** eliminate composites by sieving, omit multiples of its square **/
        for (int i = 5; i <= root; i++)
            if (prime[i])
                for (int j = i * i; j < limit; j += i * i)
                    prime[j] = false;
        return prime;
    }
	

}
