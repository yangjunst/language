package control;

public class E09_Fibonacci {
    static int fib(int n) {
        if (n <= 2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
// Get the max value from the command line:
        int n = 10;
        if (n < 0) {
            System.out.println("Cannot use negative numbers");
            return;
        }
        for (int i = 1; i <= n; i++)
            System.out.print(fib(i) + ", ");
    }
}