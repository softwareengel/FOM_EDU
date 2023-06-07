package pj1;
import java.util.Arrays;

public class MedianPairwiseProduct {
    public static void main(String[] args) {
        int n = 1000003;
        int[] sequence = generateSequence(n);
        long result = calculateMedianPairwiseProduct(sequence);

        System.out.println("M(1,000,003) = " + result);
    }

    // Generate the sequence S
    public static int[] generateSequence(int n) {
        int[] sequence = new int[n];
        sequence[0] = 290797;

        for (int i = 1; i < n; i++) {
            sequence[i] = (int) ((long) sequence[i - 1] * sequence[i - 1] % 50515093);
        }

        return sequence;
    }

    // Calculate the median of pairwise products
    public static long calculateMedianPairwiseProduct(int[] sequence) {
        int n = sequence.length;
        long[] pairwiseProducts = new long[n * (n - 1) / 2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairwiseProducts[index++] = (long) sequence[i] * sequence[j];
            }
        }

        Arrays.sort(pairwiseProducts);
        return pairwiseProducts[pairwiseProducts.length / 2];
    }
}
