import java.util.ArrayList;
import java.util.List;

public class CycleSortProblem1 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> result = findDisappearedNumbers(nums);

        for (int i : result) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        cycleSort(nums);
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                result.add(i + 1);
            }
        }

        return result;
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

}
