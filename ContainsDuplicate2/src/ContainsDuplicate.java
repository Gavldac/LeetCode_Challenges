import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        //edge case elimination
        if (k < 0 || nums == null || nums.length < 2) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }


    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {1, 2, 3, 1};
        int k1 = 3;
        System.out.println("Expected: true" ); // Expected: true
        System.out.println("Test 1: " + containsNearbyDuplicate(nums1, k1)); // Expected: true
        System.out.println();


        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        System.out.println("Expected: true"); // Expected: true
        System.out.println("Test 2: " + containsNearbyDuplicate(nums2, k2)); // Expected: true
        System.out.println();

        int[] nums3 = {1, 2, 3, 1, 2, 3};
        int k3 = 2;
        System.out.println("Expected: false"); // Expected: false
        System.out.println("Test 3: " + containsNearbyDuplicate(nums3, k3)); // Expected: false
        System.out.println();

        int[] nums4 = {99, 99};
        int k4 = 2;
        System.out.println("Expected: true"); // Expected: true
        System.out.println("Test 4: " + containsNearbyDuplicate(nums4, k4)); // Expected: true
        System.out.println();

        int[] nums5 = {1, 2, 3, 4, 5};
        int k5 = 1;
        System.out.println("Expected: false"); // Expected: false
        System.out.println("Test 5: " + containsNearbyDuplicate(nums5, k5)); // Expected: false
        System.out.println();

        // Edge cases
        int[] nums6 = {};
        int k6 = 1;
        System.out.println("Expected: false"); // Expected: false
        System.out.println("Test 6: " + containsNearbyDuplicate(nums6, k6)); // Expected: false (Empty array)
        System.out.println();

        int[] nums7 = {1};
        int k7 = 1;
        System.out.println("Expected: false"); // Expected: false
        System.out.println("Test 7: " + containsNearbyDuplicate(nums7, k7)); // Expected: false (Single element)
        System.out.println();
        
        int[] nums8 = {1, 2, 3, 4, 1};
        int k8 = 4;
        System.out.println("Expected: true"); // Expected: true
        System.out.println("Test 8: " + containsNearbyDuplicate(nums8, k8)); // Expected: true (Duplicate 1 at distance 4)
        System.out.println();

        int[] nums9 = {1, 2, 3, 4, 1};
        int k9 = 3;
        System.out.println("Expected: false"); // Expected: false
        System.out.println("Test 9: " + containsNearbyDuplicate(nums9, k9)); // Expected: false (Duplicate 1 is too far apart)
        System.out.println();

        int[] nums10 = {1, 1, 1, 1, 1};
        int k10 = 1;
        System.out.println("Expected: true"); // Expected: true
        System.out.println("Test 10: " + containsNearbyDuplicate(nums10, k10)); // Expected: true (Multiple duplicates close together)
        System.out.println();

        int[] nums11 = {1, 1, 1, 1, 1};
        int k11 = 0;
        System.out.println("Expected: false"); // Expected: false
        System.out.println("Test 11: " + containsNearbyDuplicate(nums11, k11)); // Expected: false (No range to check)
        System.out.println();

        int[] nums12 = {Integer.MAX_VALUE, Integer.MIN_VALUE, 0, Integer.MAX_VALUE, Integer.MIN_VALUE};
        int k12 = 2;
        System.out.println("Expected: false"); // Expected: false
        System.out.println("Test 12: " + containsNearbyDuplicate(nums12, k12)); // Expected: false (No duplicates within range)
        System.out.println();

        int[] nums13 = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        int k13 = 1;
        System.out.println("Expected: true"); // Expected: true
        System.out.println("Test 13: " + containsNearbyDuplicate(nums13, k13)); // Expected: true (Duplicates of extreme values)
        System.out.println();
    }
}
