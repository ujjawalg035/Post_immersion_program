package Week1.Day6;

public class Problem6 {
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
// Usage: System.out.println(fib(6));
}
