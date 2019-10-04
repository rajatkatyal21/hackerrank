public class FibonacciSeriesRecusrsive {

    public static void main(String[] args) {
        int n = 7;

        System.out.println(fibonacciSeriesByRecursion(n));
        System.out.println(fibonacciSeriesByArray(n));
    }

    private static int fibonacciSeriesByArray(int n) {
        int f[] = new int[n+1];

        f[0] = 0;
        f[1] = 1;

        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 2] + f[i - 1];
        }

        return f[n];
    }

    private static int fibonacciSeriesByRecursion(int n) {

        if (n < 2) {
            return n;
        }

        return fibonacciSeriesByRecursion(n - 2) + fibonacciSeriesByRecursion(n - 1);
    }
}
