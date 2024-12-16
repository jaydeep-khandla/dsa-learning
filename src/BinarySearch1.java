public class BinarySearch1 {
    public static void main(String[] args) {
        // binarySearch(new int[]{1, 2, 4, 4, 5}, 4);
        // binarySearchDecsending(new int[]{1, 2, 4, 4, 5}, 4);
        // binarySearchOrderAgnostic(new int[]{1, 2, 3, 4, 5}, 4);
        // binarySearchOrderAgnostic(new int[]{5, 4, 3, 2, 1}, 4);
        // binarySearchRecursive(new int[]{1, 2, 4, 4, 5}, 4, 0, 4);

        // multipleOccurenceBinarySearch(new int[]{1, 2, 4, 4, 5}, 9);
        // binarySearch2D(new int[][]{{1, 2, 4, 4, 5}, {1, 2, 4, 4, 5}, {1, 2, 4, 4,
        // 5}}, 2, true);
    }

    static void binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Not found");
    }

    static void binarySearchDecsending(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] > key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Not found");
    }

    static void binarySearchOrderAgnostic(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] <= arr[end]) {
            binarySearch(arr, key);
        } else {
            binarySearchDecsending(arr, key);
        }
    }

    static void binarySearchRecursive(int[] arr, int key, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < key) {
                start = mid + 1;
                binarySearchRecursive(arr, key, start, end);
            } else {
                end = mid - 1;
                binarySearchRecursive(arr, key, start, end);
            }
        }

        System.out.println("Not found");
    }

    static void multipleOccurenceBinarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found on index: " + mid);
                start = mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

    }

    static void binarySearch2D(int[][] arr, int key, boolean findLast) {
        int outerIndex = -1;
        int innerIndex = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid][0] == key) {
                outerIndex = mid;
                innerIndex = 0;
                break;
            } else if (arr[mid][0] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (outerIndex == -1 && innerIndex == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + outerIndex + " " + innerIndex);
        }
    }
}
