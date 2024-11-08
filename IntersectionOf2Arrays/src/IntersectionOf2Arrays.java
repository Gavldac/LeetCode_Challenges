import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> arraySet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int i : nums2) {
            arraySet.add(i);
        }

        for (int i: nums1) {
           if (arraySet.contains(i))
            intersectionSet.add(i); 
        }
       
        int[] results = new int[intersectionSet.size()];
        int index = 0;
        for (int i : intersectionSet) {
            results[index++] = i;
        }

        return results; 
    }

    public static void main(String[] args) throws Exception {
        // Test client for intersection method
        
        // Test Case 1: Regular intersection
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println("Test Case 1: Regular intersection");
        printArray(intersection(nums1, nums2)); // Expected output: [2]
        System.out.println("Expected : [2]");
        
        // Test Case 2: Empty arrays
        int[] nums3 = {};
        int[] nums4 = {};
        System.out.println("Test Case 2: Empty arrays");
        printArray(intersection(nums3, nums4)); // Expected output: []
        System.out.println("Expected : []");
        
        // Test Case 3: No intersection
        int[] nums5 = {1, 3, 5};
        int[] nums6 = {2, 4, 6};
        System.out.println("Test Case 3: No intersection");
        printArray(intersection(nums5, nums6)); // Expected output: []
        System.out.println("Expected : []");
        
        // Test Case 4: One array is empty
        int[] nums7 = {};
        int[] nums8 = {2, 3, 4};
        System.out.println("Test Case 4: One array is empty");
        printArray(intersection(nums7, nums8)); // Expected output: []
        System.out.println("Expected : []");
        
        // Test Case 5: Identical arrays
        int[] nums9 = {7, 8, 9};
        int[] nums10 = {7, 8, 9};
        System.out.println("Test Case 5: Identical arrays");
        printArray(intersection(nums9, nums10)); // Expected output: [7, 8, 9]
        System.out.println("Expected : [7, 8, 9]");
        
        // Test Case 6: Subset of one array is the intersection
        int[] nums11 = {1, 2, 3};
        int[] nums12 = {2, 3};
        System.out.println("Test Case 6: Subset of one array is the intersection");
        printArray(intersection(nums11, nums12)); // Expected output: [2, 3]
        System.out.println("Expected : [2, 3]");
        
        // Test Case 7: Arrays with duplicates
        int[] nums13 = {1, 1, 2, 2, 3};
        int[] nums14 = {2, 2, 2, 3, 3};
        System.out.println("Test Case 7: Arrays with duplicates");
        printArray(intersection(nums13, nums14)); // Expected output: [2, 3]
        System.out.println("Expected : [2, 3]");
    }

    // Utility method to print arrays
    public static void printArray(int[] array) {
        System.out.print("Results: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
