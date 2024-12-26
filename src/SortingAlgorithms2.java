public class SortingAlgorithms2 {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        arr = selectionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
    }

    /*
     * Selection Sort
     * 
     * Algorithm:
     * 1. Iterate over the array starting from the first element.
     * 2. Assume the current element is the minimum element.
     * 3. Iterate over the elements from the current element to the last element.
     * 4. If the current element is less than the minimum element, update the
     * minimum element.
     * 5. Swap the minimum element with the current element.
     * 6. Return the sorted array.
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
     * - The algorithm can be optimized by using a binary search to find the minimum
     * element.
     * 
     */

    static int[] selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    /*
     * Bidirectional Selection Sort
     * 
     * Algorithm:
     * 1. Iterate over the array starting from the first element to the middle
     * element.
     * 2. Assume the current element is the minimum element.
     * 3. Assume the current element is the maximum element.
     * 4. Iterate over the elements from the current element to the last element.
     * 5. If the current element is less than the minimum element, update the
     * minimum element.
     * 6. If the current element is greater than the maximum element, update the
     * maximum element.
     * 7. Swap the minimum element with the first element.
     * 8. If the maximum element is the first element, update the maximum element to
     * the minimum element.
     * 9. Swap the maximum element with the last element.
     * 10. Return the sorted array.
     * 
     */

    static int[] bidirectionSelectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int minIndex = i;
            int maxIndex = i;

            for (int j = i + 1; j < n - i; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }

                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            if (maxIndex == i) {
                maxIndex = minIndex;
            }

            temp = arr[maxIndex];
            arr[maxIndex] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        return arr;
    }
}
