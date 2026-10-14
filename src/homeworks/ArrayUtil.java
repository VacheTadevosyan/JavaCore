package homeworks;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};

        System.out.println();
        System.out.println("_______________ Task-1 _______________");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("_______________ Task-2 _______________");

        System.out.println("First element: " + numbers[0]);

        System.out.println();
        System.out.println("_______________ Task-3 _______________");

        System.out.println("Last element: " + numbers[numbers.length - 1]);

        System.out.println();
        System.out.println("_______________ Task-4 _______________");

        System.out.println("Array length: " + numbers.length);

        System.out.println();
        System.out.println("_______________ Task-5 _______________");

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number: " + min);

        System.out.println();
        System.out.println("_______________ Task-6 _______________");

        if (numbers.length <= 2) {
            System.out.println("Can't print middle values");
        } else if (numbers.length % 2 == 0) {
            System.out.println("Middle elements: " + numbers[numbers.length / 2 - 1]);
            System.out.println("Middle elements: " + numbers[numbers.length / 2]);
        } else {
            System.out.println("Middle element: " + numbers[numbers.length / 2]);
        }

        System.out.println();
        System.out.println("_______________ Task-7 _______________");

        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even numbers count: " + evenCount);

        System.out.println();
        System.out.println("_______________ Task-8 _______________");

        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd numbers count: " + oddCount);

        System.out.println();
        System.out.println("_______________ Task-9 _______________");

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum: " + sum);

        System.out.println();
        System.out.println("_______________ Task-10 _______________");

        double sum1 = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum1 += numbers[i];
        }
        System.out.println("Average: " + (sum1 / numbers.length));

        System.out.println();
        System.out.println("_______________ Bonus-1 _______________");

        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number: " + max);

        System.out.println();
        System.out.println("_______________ Bonus-2 _______________");

        int negativeCount = 0, positiveCount = 0, zeroCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Positive numbers count: " + positiveCount);
        System.out.println("Negative numbers count: " + negativeCount);
        System.out.println("Zero count: " + zeroCount);

        System.out.println();
        System.out.println("_______________ Bonus-3 _______________");

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
