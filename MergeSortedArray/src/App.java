import java.util.Arrays;

public class App {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        --m; --n;
        for (int i = nums1.length-1; i >= 0; i--) {
            if (nums1[m]<nums2[n])
                nums1[i]=nums2[n--];
            else
                nums1[i]=nums1[m--];
            if (m < 0 || n < 0) 
                return;   
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        /*
         * Input: nums1 = [1,2,3,0,0,0], m = 3, 
         *        nums2 = [2,5,6], n = 3
         * Output: [1,2,2,3,5,6]
         */
        int[] t1 = {1,2,3,0,0,0};
        int[] t2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(t1, m, t2, n);
         System.out.println("test1");
         System.out.println("Expected: [1, 2, 2, 3, 5, 6]");
         System.out.println("Results:  "+ Arrays.toString(t1));
    }
}
