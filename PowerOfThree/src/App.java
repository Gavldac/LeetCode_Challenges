public class App {

    public static boolean isPowerOfThree(int n) {
        if (n == 3 || n == 1)
            return true;
        if (n % 3 != 0 || n == 0)
            return false;
        else
            return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {

        // Test cases
        int[] trueNumbers = { 1, 3, 9, 27, 243, 81 };

        System.out.println("These should be true: ");
        for (int n : trueNumbers) {
            System.out.printf("isPowerOfThree(%d) = %b%n", n, isPowerOfThree(n));
        }
        System.out.println();

        System.out.println("These should be false: ");
        int[] falseNumbers = { 2, 10, 0, 100, 99};

        for (int n : falseNumbers) {
            System.out.printf("isPowerOfThree(%d) = %b%n", n, isPowerOfThree(n));
        }
    }

}
