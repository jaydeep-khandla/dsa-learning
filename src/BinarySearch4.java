public class BinarySearch4 {
    public static void main(String[] args) {
        // System.out.println("Peak element index is: " +
        // findPeakIndexInBitonicArray(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
        // System.out.println("Smallest element is: " + smallestElement(new int[]{1, 2,
        // 3, 4, 5, 4, 3, 2}));
        // System.out.println("Is the array a mountain array: " +
        // validateMountainArray(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1}));
        System.out.println(
                "Is the array a mountain array: " + findInBitonicArray(new int[] { 1, 2, 3, 5, 4, 3, 2, 1 }, 4));
    }

    static int findPeakIndexInBitonicArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int smallestElement(int[] arr) {
        int n = arr.length;
        if (arr[0] < arr[n - 1]) {
            return arr[0];
        } else {
            return arr[n - 1];
        }
    }

    static boolean validateMountainArray(int[] arr) {
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }
        while (j > 0 && arr[j] < arr[j - 1]) {
            j--;
        }
        return i > 0 && i == j && j < n - 1;

    }

    static int findInBitonicArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int peakIndex = findPeakIndexInBitonicArray(arr);

        int inc = binarySearch(arr, target, start, peakIndex - 1, false);
        int dec = binarySearch(arr, target, peakIndex + 1, end, true);
        // int dec = binarySearchDecsending(arr, target, peakIndex+1, end);
        if (inc == -1 && dec == -1) {
            return -1;
        } else if (inc == -1) {
            return dec;
        } else if (dec == -1) {
            return inc;
        } else {
            return Math.min(inc, dec);
        }
    }

    static int binarySearch(int[] arr, int key, int start, int end, boolean isDescending) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                if (isDescending) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
                // start = mid + 1;
            } else {
                if (isDescending) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
                // end = mid - 1;
            }
        }
        return -1;
    }

    // static int binarySearch(int[] arr, int key, int start, int end) {
    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (arr[mid] == key) {
    // return mid;
    // } else if (arr[mid] < key) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }

    // static int binarySearchDecsending(int[] arr, int key, int start, int end) {
    // while (start <= end) {
    // int mid = start + (end - start) / 2;
    // if (arr[mid] == key) {
    // return mid;
    // } else if (arr[mid] > key) {
    // start = mid + 1;
    // } else {
    // end = mid - 1;
    // }
    // }
    // return -1;
    // }
}
