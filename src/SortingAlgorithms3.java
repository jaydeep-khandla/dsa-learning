public class SortingAlgorithms3 {
    public static void main(String[] args) {

    }

    /*
     * Bubble Sort
     * 
     * Algorithm:
     * 1. Iterate over the array starting from the first element.
     * 2. Iterate over the elements from the first element to the last element.
     * 3. If the current element is greater than the next element, swap the
     * elements.
     * 4. Return the sorted array.
     * 
     * The above algorithm sorts the array in ascending order.
     * 
     * Algorithm Properties:
     * - Time complexity: O(n^2)
     * - Space complexity: O(1)
     * [where n is the number of elements in the array.]
     * - Stable: No i.e., it does not preserve the relative order of equal elements.
     * - In-place: Yes i.e., it does not require any extra space.
     * - Adaptive: No i.e., it does not perform better when the input array is
     * partially sorted.
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
     * Note: The algorithm can be optimized by using a sentinel value to avoid
     * checking for the boundary condition.
     * - The algorithm can be optimized by using a flag to check if any swaps were
     * made in the inner loop.
     * 
     */

    static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }

        return arr;
    }

    /*
     * Brick Sort / Odd-Even Sort / Parity Sort
     * 
     * Algorithm:
     * 1. Iterate over the array starting from the first element.
     * 2. Iterate over the elements from the first element to the last element in
     * steps of 2.
     * 3. If the current element is greater than the next element, swap the
     * elements.
     * 4. Iterate over the elements from the second element to the last element in
     * steps of 2.
     * 5. If the current element is greater than the next element, swap the
     * elements.
     * 
     * The above algorithm sorts the array in ascending order.
     * 
     * Algorithm Properties:
     * - Time complexity: O(n^2)
     * - Space complexity: O(1)
     * [where n is the number of elements in the array.]
     * - Stable: Yes i.e., it preserves the relative order of equal elements.
     * - In-place: Yes i.e., it does not require any extra space.
     * - Adaptive: No i.e., it does not perform better when the input array is
     * partially sorted.
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
     * Note: The algorithm can be optimized by using a flag to check if any swaps
     * were
     * made in the inner loop.
     * - The algorithm can be optimized by using a sentinel value to avoid checking
     * for the boundary condition.
     * 
     * 
     */

    static int[] brickSort(int[] arr) {
        int n = arr.length;

        boolean swapped = true;

        while (swapped) {
            swapped = false;

            for (int i = 0; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            for (int i = 1; i < n - 1; i += 2) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }

        return arr;
    }
}
