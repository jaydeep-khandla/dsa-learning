public class StackProblem3 {
    public static void main(String[] args) {
        String s = "[]][][]][[";

        System.out.println(minimumNumberOfSwaps(s));
    }

    static int minimumNumberOfSwaps(String s) {
        // code here
        int swaps = 0;
        int open = 0, close = 0;
        int unbalanced = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[') {
                open++;

                if (unbalanced > 0) {
                    swaps += unbalanced;
                    unbalanced -= 1;
                }
            }

            if (s.charAt(i) == ']') {
                close++;

                unbalanced = close - open;
            }
        }

        return swaps;
    }
}
