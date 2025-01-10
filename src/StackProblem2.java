import java.util.Stack;

public class StackProblem2 {
    public static void main(String[] args) {
        // String s = "(((";

        // System.out.println(minAddToMakeValid(s));

        String s = "[[][[[[][][[[[]]][][]]]]][[][[][][]][[[[]]][[]][[]][[]]]]]]]][]][]]][[]][[[[[[][[]][[[][]][[]]][";

        System.out.println(minSwaps(s));
    }

    static int minAddToMakeValid(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int open = 0;
        int close = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                open++;
            } else {
                if (open == 0) {
                    close++;
                } else {
                    open--;
                }
            }
        }

        return open + close;
    }

    static int minSwaps(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int swap = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '[') {
                swap++;
            } else if (swap > 0) {
                swap--;
            }
        }

        return (swap + 1) / 2;
    }
}
