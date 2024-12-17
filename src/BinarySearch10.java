import java.util.Arrays;

public class BinarySearch10 {
    public static void main(String[] args) {
        System.out.println(aggresiveCows(new int[] { 1, 2, 4, 8, 9 }, 3));
        System.out.println(aggresiveCows(new int[] { 10, 1, 2, 7, 5 }, 3));
        System.out.println(aggresiveCows(new int[] { 2, 12, 11, 3, 26, 7 }, 5));
    }

    static boolean isPossible(int[] stalls, int mid, int k) {
        int cow = 1;
        int lastPos = stalls[0];
        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPos >= mid) {
                cow++;
                lastPos = stalls[i];
                if (cow == k) {
                    return true;
                }
            }
        }
        return false;
    }

    static int aggresiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);

        int start = 1;
        int end = stalls[stalls.length - 1] - stalls[0];
        int res = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // System.out.println("start: " + start + " end: " + end + " mid: " + mid);

            if (isPossible(stalls, mid, k)) {
                res = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return res;
    }
}
