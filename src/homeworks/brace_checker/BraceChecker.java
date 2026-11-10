package homeworks.brace_checker;

import java.util.Stack;

public class BraceChecker {

    public boolean check(String text) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            switch (character) {
                case '{':
                case '[':
                case '(':
                    stack.add(character);
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    } else if (stack.peek() == '{' && character == '}') {
                        stack.pop();
                    } else if (stack.peek() == '[' && character == ']') {
                        stack.pop();
                    } else if (stack.peek() == '(' && character == ')') {
                        stack.pop();
                    } else {
                        return false;
                    }
            }
        }
        return stack.isEmpty();
    }
}
