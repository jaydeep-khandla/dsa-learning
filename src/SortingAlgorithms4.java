public class SortingAlgorithms4 {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
        int[] sortedArr = countingSort(arr);

        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i] + " ");
        }

        System.out.println();
    }

    /*
     * Counting Sort
     * 
     * Algorithm:
     * 1. Find the maximum element in the array.
     * 2. Create a count array of size max + 1.
     * 3. Iterate over the array and increment the count of the element in the count
     * array.
     * 4. Iterate over the count array and update the count of the element with the
     * sum of the
     * current count and the previous count.
     * 5. Create an output array of the same size as the input array.
     * 6. Iterate over the input array in reverse order and place the elements in
     * the output array
     * based on the count array.
     * 7. Return the output array.
     * 
     * The above algorithm sorts the array in ascending order.
     * 
     * Algorithm Properties:
     * - Time complexity: O(n + k)
     * - Space complexity: O(n + k)
     * [where n is the number of elements in the array and k is the range of the
     * input.]
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
     * Note: Counting Sort is a non-comparison-based sorting algorithm that sorts
     * the elements based on their count in the input array. It is efficient for
     * small arrays or arrays with a limited range of values.
     * 
     */

    static int[] countingSort(int[] arr) {
        int n = arr.length;
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int[] output = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            output[--count[arr[i]]] = arr[i];
        }

        return output;
    }
}
