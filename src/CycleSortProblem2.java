import java.util.ArrayList;
import java.util.List;

public class CycleSortProblem2 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 7, 5, 6, 2, 3, 1 };

        System.out.println(findDuplicate(nums));
        System.out.println(findDuplicateV2(nums));

        // for (int i : nums) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
    }

    static int findDuplicate(int[] nums) {
        cycleSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return nums[i];
            }
        }

        return -1;
    }

    static void cycleSort(int[] nums) {
        int n = nums.length;
        int index = 0;

        while (index < n) {
            int value = nums[index];
            int correctIndex = value - 1;

            if (nums[correctIndex] != nums[index]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = value;
                nums[index] = temp;
            } else {
                index++;
            }
        }
    }

    static int findDuplicateV2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int absValue = Math.abs(nums[i]);
            if (nums[absValue - 1] < 0) {
                return Math.abs(nums[i]);
            } else {
                nums[absValue - 1] = -nums[absValue - 1];
            }

        }

        return -1;
    }

    static List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            int absValue = Math.abs(nums[i]);
            if (nums[absValue - 1] < 0) {
                // return absValue;
                duplicates.add(absValue);
            }
            nums[absValue - 1] = -nums[absValue - 1];
        }

        return duplicates;
    }

}
