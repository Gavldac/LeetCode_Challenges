import java.util.Arrays;

public class SqsOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[] sqSorted = new int[nums.length];
        int sqIndex = sqSorted.length - 1;
        int left = 0;
        int right = sqIndex;

        while (sqIndex >= 0) {
            if ((nums[left] * nums[left]) > (nums[right] * nums[right])) {
                sqSorted[sqIndex--] = nums[left] * nums[left];
                ++left;
            } else {
                sqSorted[sqIndex--] = nums[right] * nums[right];
                --right;
            }
        }
        return sqSorted;
    }

    public static void main(String[] args) throws Exception {
        // Test case 1: Mixed negative, zero, and positive values
        int[] nums1 = { -7, -3, -1, 0, 2, 3, 6 };
        testSortedSquares(nums1);

        // Test case 2: Array with all negative values
        int[] nums2 = { -5, -2, -1 };
        testSortedSquares(nums2);

        // Test case 3: Array with all zero values
        int[] nums3 = { 0, 0, 0 };
        testSortedSquares(nums3);

        // Test case 4: Array with all positive values
        int[] nums4 = { 1, 2, 3, 4, 5 };
        testSortedSquares(nums4);

        // Test case 5: Array with just one element
        int[] nums5 = { -5 };
        testSortedSquares(nums5);

        // Test case 6: Array with just two elements
        int[] nums6 = { 2, -3 };
        testSortedSquares(nums6);

        // Test case 7: Array with large size and mixed values
        int[] nums7 = { -100, -50, -25, 0, 25, 50, 100 };
        testSortedSquares(nums7);

        // Test case 8: Empty array
        int[] nums8 = {};
        testSortedSquares(nums8);
    }

    // Helper method to test each array and display sorted and squared arrays
    private static void testSortedSquares(int[] nums) {
        // Print the original array
        System.out.println("Original array: " + Arrays.toString(nums));

        // Create a copy and sort it
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        // Call sortedSquares() and print the result
        int[] squaredSorted = sortedSquares(nums);
        System.out.println("Squared and sorted array: " + Arrays.toString(squaredSorted));
        System.out.println("---------------------------------------------------");
    }
}
