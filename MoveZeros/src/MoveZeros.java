public class MoveZeros {

    // public static void moveZeroes(int[] nums) {

    //     for (int i = nums.length - 1; i >= 0; i--) {
    //         if (nums[i] == 0) {
    //             int j = i;
    //             while (j < nums.length -1 && nums[j + 1] != 0) {
    //                 nums[j] = nums[j + 1];
    //                 if (j < nums.length)
    //                     nums[++j] = 0;
    //             }
    //         }
    //     }
    // }

    public static void moveZeroes(int[] nums) {
        int nonZeroPos = 0;
    
        // Move all non-zero elements to the beginning of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroPos++] = nums[i];
            }
        }
    
        // Fill the remaining positions with zeros
        for (int i = nonZeroPos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) throws Exception {
        int[] test = {0,2,0,0,1,0,3,12,0};

        moveZeroes(test);

        for (int i : test){
        System.out.print(i + " ");
        }
        System.out.println();
    }
}
