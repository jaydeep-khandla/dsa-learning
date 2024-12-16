public class BinarySearch2 {
    public static void main(String[] args) {
        // System.out.println("The element is first occured at index: " +
        // binarySearchFirstOccurence(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 6}, 2));
        // System.out.println("The element is last occured at index: " +
        // binarySearchLastOccurence(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 6}, 2));
        // System.out.println("The no of occurence for the element is: " +
        // binarySearchOccurenceOfElements(new int[]{1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6},
        // 2));
        // System.out.println("The greatest element smaller than the target is: " +
        // binarySearchFloor(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 6}, 5));
        System.out.println("The smallest element greater than the target is: "
                + binarySearchCeiling(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 6 }, 5));
    }

    static int binarySearchFirstOccurence(int[] arr, int key) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int binarySearchLastOccurence(int[] arr, int key) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                ans = mid;
                start = mid + 1;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int binarySearch(int[] arr, int key, boolean findFirst) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                ans = arr[mid];
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static int binarySearchFloor(int[] arr, int key) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                ans = arr[mid];
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
                ans = arr[mid];
            }
        }
        return ans;
    }

    static int binarySearchCeiling(int[] arr, int key) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                ans = mid;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
                ans = arr[mid];
            }
        }
        return ans;
    }

    static int binarySearchOccurenceOfElements(int[] arr, int key) {
        int ans = -1;
        int fist = binarySearch(arr, key, true);
        int last = binarySearch(arr, key, false);
        if (fist != -1 && last != -1) {
            ans = last - fist + 1;
        }
        return ans;
    }
}
