public class SortingAlgorithms7 {
    public static void main(String[] args) {
        int[] arr1 = { 4, 5, 2, 7, 6, 2, 3, 1 };
        int[] sortedArr1 = cycleSortVariant(arr1);
        for (int i : sortedArr1) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr2 = { 6, 4, 5, 1, 3, 2 };
        int[] sortedArr2 = cycleSort(arr2);
        for (int i : sortedArr2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int[] cycleSortVariant(int[] arr) {
        int n = arr.length;
        int index = 0;

        while (index < n) {
            int value = arr[index];
            int correctIndex = value - 1;

            if (arr[correctIndex] != arr[index]) {
                int temp = arr[correctIndex];
                arr[correctIndex] = value;
                arr[index] = temp;
            } else {
                index++;
            }
        }

        return arr;
    }

    /*
     * Cycle Sort
     * 
     * Algorithm:
     * 1. Iterate over the array.
     * 2. For each element, find the correct position in the array.
     * 3. Swap the element with the element at the correct position.
     * 4. Repeat the above steps until the array is sorted.
     * 
     * The above algorithm sorts the array in ascending order.
     * 
     * Algorithm Properties:
     * - Time complexity: O(n^2)
     * - Space complexity: O(1)
     * - Stable: No i.e., it does not preserve the relative order of equal elements.
     * - In-place: Yes i.e., it does not require extra space.
     * - Adaptive: Yes i.e., it performs better when the input array is partially
     * sorted.
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
     * Note: Cycle Sort is an in-place, unstable sorting algorithm that minimizes
     * the number of memory writes. It is efficient for small arrays or arrays with
     * a limited range of values.
     * 
     */

    // Fixing the cycleSort implementation.
    static int[] cycleSort(int[] arr) {
        int n = arr.length;

        for (

                int cycle = 0; cycle < n - 1; cycle++) {
            int item = arr[cycle];

            // Find the position where we put the current element
            int position = cycle;
            for (int i = cycle + 1; i < n; i++) {
                if (arr[i] < item) {
                    position++;
                }
            }

            // If the element is already in the correct position, no need to swap
            if (position == cycle) {
                continue;
            }

            // Otherwise, put the item to the correct position
            while (item == arr[position]) {
                position++;
            }
            int temp = arr[position];
            arr[position] = item;
            item = temp;

            // Rotate the cycle until the element is in the correct position
            while (position != cycle) {
                position = cycle;

                // Find the correct position of the item
                for (int i = cycle + 1; i < n; i++) {
                    if (arr[i] < item) {
                        position++;
                    }
                }

                // Skip duplicate elements
                while (item == arr[position]) {
                    position++;
                }

                // Swap the item with the element at the correct position
                temp = arr[position];
                arr[position] = item;
                item = temp;
            }
        }

        return arr;
    }
}
