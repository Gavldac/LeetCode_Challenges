import java.util.Arrays;

public class LargestPerimeterTriangle {

    public static int largestPerimeterTriangle(int[] nums) {
        if (nums.length < 3) return 0;

        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        for (int i = sorted.length -1; i > 1; i--) {   
            if(sorted[i] < sorted[i-1] + sorted[i-2])
                return sorted[i] + sorted[i-1]+ sorted[i-2];
        }
        return 0;
    }

    public static void main(String[] args) {
         // Test Case 1: Array with fewer than 3 elements
        int[] testCase1 = {1, 2};
        System.out.println("Test Case 1: " + Arrays.toString(testCase1));
        System.out.println("Expected: 0");
        System.out.println("Actual: " + largestPerimeterTriangle(testCase1));

        // Test Case 2: Array with exactly 3 elements that form a valid triangle
        int[] testCase2 = {3, 4, 5};
        System.out.println("\nTest Case 2: " + Arrays.toString(testCase2));
        System.out.println("Expected: 12"); // 3 + 4 + 5 = 12
        System.out.println("Actual: " + largestPerimeterTriangle(testCase2));

        // Test Case 3: Array with no valid triangle
        int[] testCase3 = {1, 1, 10};
        System.out.println("\nTest Case 3: " + Arrays.toString(testCase3));
        System.out.println("Expected: 0"); // No valid triangle can be formed
        System.out.println("Actual: " + largestPerimeterTriangle(testCase3));

        // Test Case 4: Array with a valid triangle but larger elements
        int[] testCase4 = {10, 20, 15, 5, 30, 25};
        System.out.println("\nTest Case 4: " + Arrays.toString(testCase4));
        System.out.println("Expected: 75"); // Largest valid triangle is 30 + 25 + 20 = 75
        System.out.println("Actual: " + largestPerimeterTriangle(testCase4));
    }
}

