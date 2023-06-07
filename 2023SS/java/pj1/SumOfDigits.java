package pj1;

import java.math.BigInteger;

public class SumOfDigits {
	public static void main(String[] args) {
		BigInteger number = BigInteger.valueOf(2).pow(1000);
		int sum = calculateDigitSum(number);

		System.out.println("Sum of digits: " + sum);
		/*
		 * 
		 * Sum of digits: 1366
		 * 
		 * Congratulations, the answer you gave to problem 16 is correct.
		 * 
		 * The public tables currently show that this problem has been solved by 235184
		 * members.
		 * 
		 * This problem has a difficulty rating of 5%. The highest difficulty rating you
		 * have solved remains at 5%
		 * 
		 * 
		 */
	}

	public static int calculateDigitSum(BigInteger number) {
		String numberString = number.toString();
		int sum = 0;

		for (int i = 0; i < numberString.length(); i++) {
			int digit = Character.getNumericValue(numberString.charAt(i));
			sum += digit;
		}

		return sum;
	}
}