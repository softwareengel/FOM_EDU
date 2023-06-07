package pj1;

public class LargestPrimeFactor {
	/**
	 * https://projecteuler.net/problem=3
	 * 
	 * User java: the prime factors of 13195 are 5, 7, 13 and 29. What is the
	 * largest prime factor of the number 600851475143?
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		long number = 600851475143L;
		long largestPrimeFactor = 0;

		for (long i = 2; i * i <= number; i++) {
			while (number % i == 0) {
				largestPrimeFactor = i;
				number /= i;
			}
		}

		if (number > largestPrimeFactor) {
			largestPrimeFactor = number;
		}

		System.out.println("Largest prime factor: " + largestPrimeFactor);
		/*
		 * 
		 * Largest prime factor: 6857
		 * 
		 * Congratulations, the answer you gave to problem 3 is correct.
		 * 
		 * The public tables currently show that this problem has been solved by 558102
		 * members.
		 * 
		 * This problem has a difficulty rating of 5%. The highest difficulty rating you
		 * have solved remains at 5%
		 * 
		 */
	}
}
