public class FibonacciNumber {

    public static int fib(int n) {
        int p1 = 0, p2 = 1;
        while (n-- > 0) {
            p1 = p1 + p2;
            p2 = p1 - p2;
        }
        return p1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
        System.out.printf("fib(%d): %d%n", i, fib(i));
        }
        System.out.printf("fib(%d): %d%n", 44, fib(44));
        System.out.printf("fib(%d): %d%n", 45, fib(45));
        System.out.printf("fib(%d): %d%n", 46, fib(46));
    }

}
