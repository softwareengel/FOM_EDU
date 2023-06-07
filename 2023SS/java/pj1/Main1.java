package pj1;

import java.math.BigInteger;

/**
 * java:
 * <p>
 * Let $g(m)$ be the integer defined by the following double sum of products of
 * binomial coefficients:
 * </p>
 * <p>
 * $$\sum_{j=0}^m\sum_{i = 0}^j (-1)^{j-i}\binom mj \binom ji
 * \binom{j+5+6i}{j+5}.$$
 * </p>
 * <p>
 * You are given that $g(10) = 127278262644918$.<br>
 * Its first (most significant) five digits are $12727$.<br>
 * 
 * Find the first ten digits of $g(142857)$ when written in base $7$.
 * </p>
 * 
 * @author engels
 *
 */
public class Main1 {
	public static void main(String[] args) {
		int m = 142857;
		BigInteger result = BigInteger.ZERO;

		for (int j = 0; j <= m; j++) {
			for (int i = 0; i <= j; i++) {
				BigInteger term = binomialCoefficient(m, j).multiply(binomialCoefficient(j, i))
						.multiply(binomialCoefficient(j + 5 + 6 * i, j + 5))
						.multiply(BigInteger.valueOf((-1) ^ (j - i)));

				result = result.add(term);
			}
		}

		String base7Result = result.toString(7);
		String firstTenDigits = base7Result.substring(0, Math.min(10, base7Result.length()));

		System.out.println("First ten digits of g(142857) in base 7: " + firstTenDigits);
	}

	// Function to calculate binomial coefficient
	public static BigInteger binomialCoefficient(int n, int k) {
		BigInteger numerator = BigInteger.ONE;
		BigInteger denominator = BigInteger.ONE;

		for (int i = 0; i < k; i++) {
			numerator = numerator.multiply(BigInteger.valueOf(n - i));
			denominator = denominator.multiply(BigInteger.valueOf(i + 1));
		}

		return numerator.divide(denominator);
	}
}
