package pj1;

/**
 * <p>
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * </p>
 * <p>
 * Find the sum of all the primes below two million.
 * </p>
 * 
 * 
 * @author engels
 *
 */
public class SumOfPrimes {
	public static void main(String[] args) {
		int limit = 2000000;
		long sum = 0;

		for (int number = 2; number < limit; number++) {
			if (isPrime(number)) {
				sum += number;
			}
		}

		System.out.println("Sum of primes below two million: " + sum);
		/*
		 * 
		 * Sum of primes below two million: 142913828922
		 * 
		 * 
		 * Congratulations, the answer you gave to problem 10 is correct.
		 * 
		 * The public tables currently show that this problem has been solved by 334542
		 * members.
		 * 
		 * This problem has a difficulty rating of 5%. The highest difficulty rating you
		 * have solved remains at 5%
		 */
	}

	public static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}
