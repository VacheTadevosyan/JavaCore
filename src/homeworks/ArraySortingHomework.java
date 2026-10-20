package homeworks;

public class ArraySortingHomework {

    public static void main(String[] args) {

        int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};

        System.out.println();
        System.out.println("_______________ Task-1 _______________");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("_______________ Task-2 _______________");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[j] > numbers[i]) {
                    int tmp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = tmp;
                }
            }
            System.out.print(numbers[i] + " ");
        }

    }

}
