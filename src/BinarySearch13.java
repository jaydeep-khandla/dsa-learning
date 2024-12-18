public class BinarySearch13 {
    public static void main(String[] args) {
        System.out.println("Single element is: " + singleNonDuplicate(new int[] { 3, 3, 7, 7, 10, 11, 11 }));
    }

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        if (nums.length == 1) {
            return nums[0];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    start = mid + 2;
                } else {
                    end = mid - 1;
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return nums[start];
    }
}
