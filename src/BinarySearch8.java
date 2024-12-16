public class BinarySearch8 {
    public static void main(String[] args) {
        System.out.println("Smallest divisor: " + smallestDivisor(new int[] { 1, 2, 5, 9 }, 6));
        System.out.println("Smallest divisor: " + smallestDivisor(new int[] { 44, 22, 33, 11, 1 }, 6));
        System.out.println("Smallest divisor: " + smallestDivisor(new int[] { 44, 22, 33, 11, 1 }, 5));
    }

    static boolean isPossible(int mid, int threshold, int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i] / mid;

            if (nums[i] % mid != 0) {
                sum++;
            }
        }
        return sum <= threshold;
    }

    static int smallestDivisor(int[] nums, int threshold) {
        int start = 1;
        int end = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            end = Math.max(end, nums[i]);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isPossible(mid, threshold, nums)) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
