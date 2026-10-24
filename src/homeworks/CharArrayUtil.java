package homeworks;

public class CharArrayUtil {

    public static void main(String[] args) {

        char[] chars = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };

        System.out.println();
        System.out.println("_______________ Task-1 _______________");

        for (char character : chars) {
            System.out.print(character);
        }

        System.out.println();
        System.out.println("_______________ Task-2 _______________");


        System.out.println("Characters count: " + chars.length);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);

        System.out.println();
        System.out.println("_______________ Task-3 _______________");

        int charCount = 0;
        char c = 'a';
        for (char character : chars) {
            if (character == c) {
                charCount++;
            }
        }
        System.out.println("Character '" + c + "' count: " + charCount);

        System.out.println();
        System.out.println("_______________ Task-4 _______________");

        charCount = 0;

        for (char character : chars) {
            switch (character) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    charCount++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Vowels count: " + charCount);

        System.out.println();
        System.out.println("_______________ Task-5 _______________");

        charCount = 0;

        for (char character : chars) {
            boolean charLetter = Character.isLetter(character);
            if (charLetter) {
                switch (character) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                        break;
                    default:
                        charCount++;
                        break;
                }
            }
        }

        System.out.println("Consonants count: " + charCount);

        System.out.println();
        System.out.println("_______________ Task-6 _______________");

        charCount = 0;

        for (char character : chars) {
            if (character == ' ') {
                charCount++;
            }
        }

        System.out.println("Spaces count: " + charCount);

        System.out.println();
        System.out.println("_______________ Task-7 _______________");

        char[] chars1 = {
                'J', 'a', 'v', 'a', ' ',
                'i', 's', ' ', 'f', 'u', 'n', '!'
        };

        for (int i = 0; i < chars1.length; i++) {
            for (int j = i; j < chars1.length; j++) {
                char tmp = chars1[i];
                chars1[i] = chars1[j];
                chars1[j] = tmp;
            }
            System.out.print(chars1[i]);
        }

        System.out.println();
        System.out.println("_______________ Task-8 _______________");


        System.out.print("Uppercase: ");
        for (char character : chars) {
            if (character >= 'a' && character <= 'z') {
                character = (char) (character - 32);
            }
            System.out.print(character);
        }

        System.out.println();
        System.out.print("Lowercase: ");
        for (char character : chars) {
            if (character >= 'A' && character <= 'Z') {
                character = (char) (character + 32);
            }
            System.out.print(character);
        }

        System.out.println();
        System.out.println("_______________ Task-9 _______________");

        char oldChar = 'a';
        char newChar = '*';

        for (char character : chars) {
            if (character == oldChar) {
                character = newChar;
            }
            System.out.print(character);
        }

        System.out.println();
        System.out.println("_______________ Task-10 _______________");

        boolean isPalindrome = true;

        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] == chars[chars.length - 1 - i]) {
                isPalindrome = false;
            }
        }

        System.out.println("Is palindrome: " + isPalindrome);

        System.out.println();
        System.out.println("_______________ Bonus-1 _______________");

        char[] chars2 = {'a', 'b', 'c', 'a', 'd'};
        char target = 'a';

        for (int i = 0; i < chars2.length; i++) {
            if (chars2[i] == target) {
                System.out.println("First index: " + i);
                break;
            }
        }

        System.out.println();
        System.out.println("_______________ Bonus-2 _______________");

        char[] first = {'J', 'a', 'v', 'a'};
        char[] second = {'J', 'a', 'v', 'a'};
        int length = 0;
        boolean isEquals = true;

        if (first.length != second.length) {
            isEquals = false;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (first[i] != second[i]) {
                    isEquals = false;
                }
            }
        }

        System.out.println("Arrays are equal: " + isEquals);

        System.out.println();
        System.out.println("_______________ Bonus-3 _______________");

        char[] chars3 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        for (int i = 0; i < chars3.length; i++) {
            boolean isRepeated = false;
            for (int j = 0;j<i; j++) {
                if (chars3[i] == chars3[j]){
                    isRepeated = true;
                }
            }
            if (!isRepeated){
                System.out.print(chars3[i] + " ");
            }
        }
    }
}
