public class SortingAlgorithms5 {
    public static void main(String[] args) {
        int[] arr = { 170, 45, 75, 90, 802, 24, 2, 66 };
        int[] sortedArr = radixSort(arr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }

        System.out.println();
    }

    /*
     * Radix Sort
     * 
     * Algorithm:
     * 1. Find the maximum element in the array.
     * 2. Iterate over the digits of the maximum element.
     * 3. Perform counting sort on the array based on the current digit.
     * 4. Repeat the above step for all digits.
     * 5. Return the sorted array.
     * 
     * The above algorithm sorts the array in ascending order.
     * 
     * Algorithm Properties:
     * - Time complexity: O(n * k)
     * - Space complexity: O(n + k)
     * [where n is the number of elements in the array and k is the number of digits
     * in the maximum element.]
     * - Stable: Yes i.e., it preserves the relative order of equal elements.
     * - In-place: No i.e., it requires extra space for the count array.
     * - Adaptive: No i.e., it does not perform better when the input array is
     * partially sorted.
     * 
     * The algorithm is suitable for small arrays or arrays with a limited range of
     * values.
     * 
     * Not Suitable for:
     * - Large arrays
     * - Arrays with a large range of values
     * - Arrays with duplicate elements
     * - Parallel processing
     * - Distributed systems
     * - Real-time systems
     * 
     * Note: Radix Sort is a non-comparison-based sorting algorithm that sorts the
     * elements based on their digits. It is efficient for small arrays or arrays
     * with a limited range of values.
     * 
     * Counting Sort is used as a subroutine in Radix Sort to sort the elements
     * based on the current digit.
     */

    static int[] radixSort(int[] arr) {
        int n = arr.length;

        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int digit = 1; max / digit > 0; digit *= 10) {
            arr = countingSort(arr, digit);
        }

        return arr;
    }

    static int[] countingSort(int[] arr, int digit) {
        int n = arr.length;

        int[] count = new int[10];

        for (int i = 0; i < n; i++) {
            count[(arr[i] / digit) % 10]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            output[--count[(arr[i] / digit) % 10]] = arr[i];
        }

        return output;
    }
}
