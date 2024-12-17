public class BinarySearch9 {
    public static void main(String[] args) {
        System.out.println("Maximum products given: " + minimizedMaximum(6, new int[] { 11, 6 }));

        System.out.println("Maximum products given: " + minimizedMaximum(7, new int[] { 15, 10, 10 }));
    }

    static boolean isPossible(int mid, int n, int[] quantities) {
        int total = 0;
        for (int i = 0; i < quantities.length; i++) {
            total += quantities[i] / mid;
            if (quantities[i] % mid != 0) {
                total++;
            }
        }
        return total <= n;
    }

    static int minimizedMaximum(int n, int[] quantities) {
        int start = 1; // to avoid divide by zero error
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < quantities.length; i++) {
            end = Math.max(end, quantities[i]);
        }

        int res = -1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            // int total = 0;
            // for (int i = 0; i < quantities.length; i++) {
            // total += quantities[i] / mid;
            // if (quantities[i] % mid != 0) {
            // total++;
            // }
            // }

            System.out.println("start: " + start + " end: " + end + " mid: " + mid);

            if (isPossible(mid, n, quantities)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return res;
    }
}
