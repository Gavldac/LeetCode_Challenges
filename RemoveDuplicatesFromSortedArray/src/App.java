import java.util.Arrays;

/**
 * @author LeetCode challenge 26.
 * @author Test client by Edwin Casady
 * @author Solution by (your name here)
 */
public class App {

    /*
     * Given an integer array nums sorted in non-decreasing order,
     * remove the duplicates in-place such that each unique element appears only
     * once.
     * The relative order of the elements should be kept the same.
     * Then return the number of unique elements in nums.
     * 
     * The remaining elements (integers) of the array are not important nor is the size of
     * the array.
     * 
     * return k (the number of unique elements)
     */



    /**
     * Removes duplicated values from an int[] and returns the number k of unique
     * elements.
     * Note: the array is modified to preserve order of a sorted array but will not
     * be resized.
     * The array will likely have corrupt data after the last unique value.
     * 
     * @param nums []
     * @return int k - the number of unique elements
     */

    private static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }

    ///////////////////////////// TEST CLIENT///////////////////////////////////////

    public static void main(String[] args) throws Exception {

        System.out.println("It does not matter what you leave beyond the returned k (hence they are underscores).");
        int[] test1 = { 1, 1, 2 };
        int k1 = removeDuplicates(test1);
        System.out.println("test1");
        System.out.println("Expected: [1, 2, _] k: " + 2);
        System.out.println("Results:  " + Arrays.toString(test1) + " k: " + k1);
        System.out.println();

        int[] test2 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int k2 = removeDuplicates(test2);
        System.out.println("test2");
        System.out.println("Expected: [0, 1, 2, 3, 4, _, _, _, _, _] k: " + 5);
        System.out.println("Results:  " + Arrays.toString(test2) + " k: " + k2);
        System.out.println();

        int[] test3 = {-4, -4, -3, -2, 0, 1, 1, 3, 4, 4};
        int k3 = removeDuplicates(test3);
        System.out.println("test3");
        System.out.println("Expected: [-4, -3, -2, 0, 1, 3, 4, _, _, _] k: " + 7);
        System.out.println("Results:  " + Arrays.toString(test3) + " k: " + k3);

    }
}
