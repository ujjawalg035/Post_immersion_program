package Week1.Day6;

public class Problem4 {
    public static void fun(int x) {
        if (x == 0) return;
        fun(x - 1);
        System.out.println(x);
    }
// Usage: fun(3);

}
