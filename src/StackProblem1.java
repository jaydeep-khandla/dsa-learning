import java.util.Stack;

public class StackProblem1 {
    public static void main(String[] args) {
        // String s1 = "((";
        // String s2 = "([{}])(";

        // System.out.println(isValid(s1));
        // System.out.println(isValid(s2));

        String s = "}}}}}}{}{}}}{{}}}}{}}{{{}{}{}{}}{{{{}}}{}}";

        System.out.println(countRev(s));
    }

    static boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.add(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = (char) stack.get(stack.size() - 1);
                stack.remove(stack.size() - 1);

                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    static int countRev(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '}' && !stack.isEmpty()) {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }

        int count = 0;

        while (!stack.isEmpty()) {
            char ch1 = stack.pop();
            char ch2 = stack.pop();

            if (ch1 == ch2) {
                count++;
            } else {
                count += 2;
            }
        }

        return count;
    }

    static int countRevV2(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }

        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{') {
                open++;
            } else {
                if (open == 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }

        return (int) (Math.ceil((double) open / 2) + Math.ceil((double) close / 2));
    }
}
