package problems;

import java.util.ArrayList;

import reference.Utility;

public class Temp {

	public static void main(String[] args) {
		
		// Checking Prime Method
		ArrayList<Integer> getPrime = Utility.GetAllPrimes(100);
		
		System.out.println(getPrime.toString());
		
		for(int i = 0; i < getPrime.size();i++){
			System.out.println("Number "+String.valueOf(getPrime.get(i)) + ": " + String.valueOf(Utility.IsPrime(getPrime.get(i))));
		}
	}

}
