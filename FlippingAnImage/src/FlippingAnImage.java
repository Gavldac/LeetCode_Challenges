import java.util.Arrays;

public class FlippingAnImage {
    /*
     * [[1,1,0],
     * [1,0,1],
     * [0,0,0]]
     * 
     * [[1,0,0],
     * [0,1,0],
     * [1,1,1]]
     * 
     * First reverse the order of each row then flip the values
     */
    public static int[][] flipAndInvertImage(int[][] image) {
        for (int i = 0; i < image.length; i++) {
            //swapping the element on the left end of the array 
            //with the element on the right and working our way
            //toward the center.
            int left = 0;
            int right = image[i].length -1;
            while (left <= right) {
                int tempLeft = image[i][left];
                //flipping the values as we swap them
                image[i][left] = (image[i][right] == 1) ? 0 : 1;
                image[i][right] = (tempLeft == 1) ? 0 : 1;
                ++left; --right;
            }
        }
        return image;
    }

    public static void main(String[] args) {
        // Test case 1: 3x3 image
        int[][] image1 = {
                { 1, 1, 0 },
                { 1, 0, 1 },
                { 0, 0, 0 }
        };

        System.out.println("Original image 1:");
        printMatrix(image1);

        // Expected result for image1:
        int[][] expected1 = {
                { 1, 0, 0 },
                { 0, 1, 0 },
                { 1, 1, 1 }
        };
        System.out.println("Expected result 1:");
        printMatrix(expected1);

        int[][] flippedAndInverted1 = flipAndInvertImage(image1);
        System.out.println("Flipped and inverted image 1:");
        printMatrix(flippedAndInverted1);

        // Test case 2: 4x4 image
        int[][] image2 = {
                { 1, 1, 0, 0 },
                { 1, 0, 0, 1 },
                { 0, 1, 1, 1 },
                { 1, 0, 1, 0 }
        };

        System.out.println("\nOriginal image 2:");
        printMatrix(image2);

        // Expected result for image2:
        int[][] expected2 = {
                { 1, 1, 0, 0 },
                { 0, 1, 1, 0 },
                { 0, 0, 0, 1 },
                { 1, 0, 1, 0 }
        };
        System.out.println("Expected result 2:");
        printMatrix(expected2);

        int[][] flippedAndInverted2 = flipAndInvertImage(image2);
        System.out.println("Flipped and inverted image 2:");
        printMatrix(flippedAndInverted2);
    }

    // Helper method to print the 2D array in matrix form
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
