import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            if (map.containsKey(i)) {
                map.replace(i, map.get(i) + 1);
                if (map.get(i) > nums.length / 2)
                    return i;
            } else
                map.put(i, 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        // Test cases
        int[] nums1 = {3, 2, 3}; // size 3
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2}; // size 7
        int[] nums3 = {1, 1, 1, 2, 3, 1, 1}; // size 7

        // Call the method and print the results
        System.out.println("Test1 expected: 3");
        System.out.println("Test1 results: " + majorityElement(nums1)); // Output: 3
        System.out.println("Test2 expected: 2");
        System.out.println("Test2 results: " + majorityElement(nums2)); // Output: 2
        System.out.println("Test3 expected: 1");
        System.out.println("Test3 results: " + majorityElement(nums3)); // Output: 1
    }
}
