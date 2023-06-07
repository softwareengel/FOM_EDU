package pj1;

/**
 * java: A palindromic number reads the same both ways. The largest palindrome
 * made from the product of two 2-digit numbers is 9009 = 91 x 99
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * </p>
 * 
 * @author engels
 *
 */
public class LargestPalindrome {
	public static void main(String[] args) {
		int largestPalindrome = 0;

		for (int i = 999; i >= 100; i--) {
			for (int j = 999; j >= 100; j--) {
				int product = i * j;
				if (isPalindrome(product) && product > largestPalindrome) {
					largestPalindrome = product;
				}
			}
		}

		System.out.println("Largest palindrome: " + largestPalindrome);
		/*
		 * 
		 * Largest palindrome: 906609
		 * 
		 * 
		 * Congratulations, the answer you gave to problem 4 is correct.
		 * 
		 * The public tables currently show that this problem has been solved by 494198
		 * members.
		 * 
		 * You have earned 1 new award:
		 * 
		 * Baby Steps: Solve three problems
		 */
	}

	public static boolean isPalindrome(int number) {
		String numString = Integer.toString(number);
		int left = 0;
		int right = numString.length() - 1;

		while (left < right) {
			if (numString.charAt(left) != numString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}
}
