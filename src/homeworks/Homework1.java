package homeworks;

public class Homework1 {
    public static void main(String[] args) {

        int x = 10, y = 7;

        if (x > y) {
            System.out.println(x + " is bigger");
        } else if (y > x) {
            System.out.println(y + " is bigger");
        } else {
            System.out.println("Numbers are equal");
        }

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int a = 5, b = 7;

        System.out.println("Sum: " + (a + b));

        int n = 3;

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
