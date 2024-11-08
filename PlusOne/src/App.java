import java.util.Arrays;

public class App {

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        ++digits[i];

        //Rollover Handling
        while (digits[i] > 9 && i > 0) {
                digits[i] = 0;
                --i;
                ++digits[i];
        }

        //Should only operate when i=0
        //Array needs to be upsized when digits[0] exceeds 9
        if (digits[i] > 9) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }
        return digits;
    }


    ///////////////////////////// Test Client /////////////////////////////////
    public static void main(String[] args) throws Exception {
        /*
         * Example 1:
         * 
         * Input: digits = [1,2,3]
         * Output: [1,2,4]
         * Explanation: The array represents the integer 123.
         * Incrementing by one gives 123 + 1 = 124.
         * Thus, the result should be [1,2,4].
         * 
         * Example 2:
         * 
         * Input: digits = [4,3,2,1]
         * Output: [4,3,2,2]
         * Explanation: The array represents the integer 4321.
         * Incrementing by one gives 4321 + 1 = 4322.
         * Thus, the result should be [4,3,2,2].
         * Example 3:
         * 
         * Input: digits = [9]
         * Output: [1,0]
         * Explanation: The array represents the integer 9.
         * Incrementing by one gives 9 + 1 = 10.
         * Thus, the result should be [1,0].
         * 
         */

        int[] test1 = { 1, 2, 3 };
        System.out.println("Example 1:");
        System.out.println("Input:    [1, 2, 3]");
        System.out.println("Expected: [1, 2, 4]");
        test1 = plusOne(test1);
        System.out.println("Results:  " + Arrays.toString(test1));
        System.out.println();

        int[] test2 = { 4, 3, 2, 9 };
        System.out.println("Example 2:");
        System.out.println("Input:    [4, 3, 2, 9]");
        System.out.println("Expected: [4, 3, 3, 0]");
        test2 = plusOne(test2);
        System.out.println("Results:  " + Arrays.toString(test2));
        System.out.println();

        int[] test3 = { 8, 9, 9, 9 };
        System.out.println("Example 3:");
        System.out.println("Input:    [8, 9, 9, 9]");
        System.out.println("Expected: [9, 0, 0, 0]");
        test3 = plusOne(test3);
        System.out.println("Results:  " + Arrays.toString(test3));
        System.out.println();

        int[] test4 = { 9, 9 };
        System.out.println("Example 4:");
        System.out.println("Input:      [9, 9]");
        System.out.println("Expected: [1, 0, 0]");
        test4 = plusOne(test4);
        System.out.println("Results:  " + Arrays.toString(test4));
        System.out.println();

    }
}
