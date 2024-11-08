import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NRepeatedElSize2nArray {

    public static int repeatedNTimes(int[] nums) {
        Set<Integer> bag = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (bag.contains(nums[i]))
                return nums[i];
            bag.add(nums[i]);
        }
        return 0;
    }

    public static void main(String[] args) throws Exception {
        // Test cases
        int[][] testCases = {
                { 1, 2, 3, 3 }, // Example case, repeated element is 3
                { 2, 1, 2, 5, 3, 2 }, // Repeated element is 2
                { 5, 1, 5, 4 }, // All repeated values are the same
                { 9, 7, 3, 9, 5, 9 }, // Repeated element is 9
                { 6, 6, 7, 8, 6, 9 } // Edge case with more variety
        };

        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test case " + (i + 1) + ": " + Arrays.toString(testCases[i]));
            int result = repeatedNTimes(testCases[i]);
            System.out.println("Results of repeated element test: " + result);
            System.out.println();
        }
    }
}
