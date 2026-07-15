import java.util.*;

class BalancedBrackets {

    public boolean isValidConfig(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }

            else {

                if (stack.isEmpty())
                    return false;

                char top = stack.pop();

                if (ch == ')' && top != '(')
                    return false;

                if (ch == ']' && top != '[')
                    return false;

                if (ch == '}' && top != '{')
                    return false;
            }
        }

        return stack.isEmpty();
    }
}