public class BinarySearch7 {
    public static void main(String[] args) {
        // System.out.println("Minimum per hour: " + minEatingSpeed(new int[] { 3, 6, 7,
        // 11
        // }, 8));
        // System.out.println("Minimum per hour: " + minEatingSpeed(new int[] { 30, 11,
        // 23,
        // 4, 20 }, 5));
        // System.out.println("Minimum per hour: " + minEatingSpeed(new int[] { 30, 11,
        // 23,
        // 4, 20 }, 6));
        System.out
                .println("Minimum per hour: "
                        + minEatingSpeed(new int[] { 805306368, 805306368, 805306368 }, 1000000000));
    }

    static boolean isPossible(int mid, int h, int[] piles) {
        long k = 0;

        for (int i = 0; i < piles.length; i++) {
            k += piles[i] / mid;
            if (piles[i] % mid != 0) {
                k++;
            }
        }

        System.out.println("k: " + k + " h: " + h);

        return k <= h;
    }

    static int minEatingSpeed(int[] piles, int h) {
        // int res = -1;

        int start = 1;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < piles.length; i++) {
            end = Math.max(end, piles[i]);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(mid, h, piles)) {
                // res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

            System.out.println("start: " + start + " end: " + end + " mid: " + mid);

            // Alternate method
            // int k = 0;

            // for (int i = 0; i < piles.length; i++) {
            // k += piles[i] / mid;
            // if (piles[i] % mid != 0) {
            // k++;
            // }
            // }

            // if (k > h) {
            // start = mid + 1;
            // } else {
            // res = mid;
            // end = mid - 1;
            // }
        }

        return start;
    }
}
