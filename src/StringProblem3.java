public class StringProblem3 {
    public static void main(String[] args) {
        String s = "a good example";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int sp = 0;

        for (int ep = 0; ep <= len; ep++) {

            if (ep == len || arr[ep] == ' ') {
                int left = sp;
                int right = ep - 1;

                while (left < right) {
                    char temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left++;
                    right--;
                }

                sp = ep + 1;
            }
        }

        return new String(arr);
    }

}
