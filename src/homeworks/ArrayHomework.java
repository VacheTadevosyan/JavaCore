package homeworks;

public class ArrayHomework {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("_______________ Task-1 _______________");

        int[] numbers1 = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int n = 6;
        int count = 0;

        for (int i = 0; i < numbers1.length; i++) {
            if (n == numbers1[i]) {
                count++;
            }
        }
        System.out.println("Count of " + n + ": " + count);

        System.out.println();
        System.out.println("_______________ Task-2 _______________");

        int[] numbers2 = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        int revers;

        for (int i = 0; i < numbers2.length / 2; i++) {
            revers = numbers2[i];
            numbers2[i] = numbers2[numbers2.length - i - 1];
            numbers2[numbers2.length - 1 - i] = revers;
        }

        for (int i = 0; i < numbers2.length; i++) {
            System.out.print(numbers2[i] + " ");
        }

        System.out.println();
        System.out.println("_______________ Task-3 _______________");

        int[] numbers3 = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int repeatedCount = 0;

        for (int i = 0; i < numbers3.length; i++) {

            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (numbers3[i] == numbers3[j]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (alreadyCounted) {
                continue;
            }

            for (int j = i + 1; j < numbers3.length; j++) {
                if (numbers3[i] == numbers3[j]) {
                    repeatedCount++;
                    break;
                }
            }
        }

        System.out.println("Repeated numbers count: " + repeatedCount);

        System.out.println();
        System.out.println("_______________ Task-4 _______________");

        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int charsCount = 0;
        for (int i : chars) {
            switch (i) {
                case 'ա':
                case 'ե':
                case 'է':
                case 'ը':
                case 'ի':
                case 'ո':
                case 'օ':
                    charsCount++;
                    break;
                default:
                    break;
            }

        }
        System.out.println("Vowels count: " + charsCount);

        System.out.println();
        System.out.println("_______________ Bonus-1 _______________");

        int[] numbers5 = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};

        int max = 0;
        int secondMax = 0;

        for (int num : numbers5) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println("Second maximum: " + secondMax);

        System.out.println();
        System.out.println("_______________ Bonus-2 _______________");

        int[] numbers6 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};

        for (int i = 0; i < numbers6.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < i; j++) {
                if (numbers6[i] == numbers6[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                System.out.print(numbers6[i] + " ");
            }
        }

        System.out.println();
        System.out.println("_______________ Bonus-3 _______________");

        int[] numbers7 = {3, 6, 3, 8, 9, 6, 2, 3, 5, 3};

        int mostFrequent = numbers7[0];
        int maxCount = 0;

        for (int i = 0; i < numbers7.length; i++) {
            int count1 = 0;

            for (int j = 0; j < numbers7.length; j++) {
                if (numbers7[i] == numbers7[j]) {
                    count1++;
                }
            }

            if (count > maxCount) {
                maxCount = count1;
                mostFrequent = numbers7[i];
            }
        }

        System.out.println("Most frequent number: " + mostFrequent);
        System.out.println("Count: " + maxCount);
    }
}
