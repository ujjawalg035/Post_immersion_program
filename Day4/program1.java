package Week1.Day2;

public class program1 {
    public static void main(String[] args) {
        int x = 5, y = 3, z;
        if (x > y) {
            if (y > 0) {
                z = x / y;
            } else {
                z = x * y;
            }
        } else {
            z = 0;
        }

        System.out.println(z);
    }
}
