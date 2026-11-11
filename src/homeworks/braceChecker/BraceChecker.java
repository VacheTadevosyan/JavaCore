package homeworks.braceChecker;

import java.util.Stack;

public class BraceChecker {
    private final String text;
    public BraceChecker(String text) {
        this.text = text;
    }

    public void check() {
        Stack<Character> stack = new Stack<Character>();
        boolean hasError = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            switch (c) {
                case '(':
                case '[':
                case '{':
                    stack.push(c);
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) {
                        System.out.println("Error: closed " + c + " but not opened at " + i);
                        return;
                    }
                    char open = stack.pop();
                    if ((open == '(' && c != ')') || (open == '[' && c != ']') || (open == '{' && c != '}')) {
                        System.out.println("Error: opened " + open + " but closed " + c + " at " + i);
                        return;
                    }
                    break;
            }
        }
        if (!stack.isEmpty()) {
            System.out.println("Error: opened " + stack.pop() + " but not closed");
        } else {
            System.out.println("No errors");
        }
    }
}
