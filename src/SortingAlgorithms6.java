public class SortingAlgorithms6 {
    public static void main(String[] args) {
        int[] arr = { 8, 3, 2, 7, 4, 6, 8 };
        int[] sortedArr = pegionholeSort(arr);
        for (int i : sortedArr) {
            System.out.print(i + " ");
        }
    }

    /*
     * Pegionhole Sort
     * 
     * Algorithm:
     * 1. Find the minimum and maximum values in the array.
     * 2. Create a pegionhole array of size (max - min + 1).
     * 3. Traverse the array and increment the pegionhole[arr[i] - min].
     * 4. Traverse the pegionhole array and update the original array.
     * 
     * The above algorithm sorts the array in ascending order.
     * 
     * Algorithm Properties:
     * - Time complexity: O(n + range)
     * - Space complexity: O(range)
     * [where n is the number of elements in the array and range is the difference
     * between the maximum and minimum values in the array.]
     * - Stable: Yes i.e., it preserves the relative order of equal elements.
     * - In-place: No i.e., it requires extra space for the pegionhole array.
     * - Adaptive: No i.e., it does not perform better when the input array is
     * partially sorted.
     * 
     * The algorithm is suitable for small arrays or arrays with a limited range of
     * values.
     * 
     * Not Suitable for:
     * - Large arrays
     * - Arrays with a large range of values
     * - Parallel processing
     * - Distributed systems
     * - Real-time systems
     *
     * Note: Pegionhole Sort is a non-comparison-based sorting algorithm that sorts
     * the elements based on their values. It is efficient for small arrays or
     * arrays with a limited range of values.
     * 
     */

    static int[] pegionholeSort(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int range = max - min + 1;
        int[] pegionhole = new int[range];

        for (int i = 0; i < arr.length; i++) {
            pegionhole[arr[i] - min]++;
        }

        int index = 0;
        for (int i = 0; i < range; i++) {
            while (pegionhole[i] > 0) {
                arr[index++] = i + min;
                pegionhole[i]--;
            }
        }

        return arr;
    }

}
