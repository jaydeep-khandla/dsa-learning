public class SortingAlgorithms1 {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        arr = insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    /*
     * Insertion Sort
     * 
     * Alogorithm:
     * 
     * 1. Iterate over the array starting from the second element.
     * 2. Store the current element in a variable key.
     * 3. Iterate over the elements from the current element to the first element.
     * 4. If the current element is greater than the key, shift the current element
     * to the right.
     * 5. Insert the key at the correct position.
     * 6. Return the sorted array.
     * 
     * The above algorithm sorts the array in ascending order.
     * 
     * The algorithm is called insertion sort because it inserts the current element
     * at the correct position in the sorted part of the array.
     * 
     * Algorithm Properties:
     * - Time complexity: O(n^2)
     * - Space complexity: O(1)
     * [where n is the number of elements in the array.]
     * - Stable: Yes i.e., it preserves the relative order of equal elements.
     * - In-place: Yes i.e., it does not require any extra space.
     * - Adaptive: Yes i.e., it performs better when the input array is partially
     * sorted.
     * 
     * The algorithm is suitable for small arrays or partially sorted arrays.
     * 
     * Not Suitable for:
     * - Large arrays
     * - Arrays with large values
     * - Arrays with duplicate elements
     * - Parallel processing
     * - Distributed systems
     * - Real-time systems
     * - Embedded systems
     * - Systems with limited memory
     * - Systems with limited processing power
     * - Systems with limited battery life
     * 
     * Note: The algorithm can be optimized by using binary search to find the
     * correct position to insert the key.
     * - The algorithm can be optimized by using a sentinel value to avoid checking
     * for the boundary condition.
     *
     */

    static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }

        return arr;
    }
}
