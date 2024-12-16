public class BinarySearch3 {
    public static void main(String[] args) {
        // System.out.println("The minimum absolute difference is: " +
        // minimumAbsoluteDiff(new int[]{1, 3, 6, 10, 15}, 12));
        // System.out.println("The minimum absolute difference is: " +
        // minimumAbsoluteDiffBinarySearch(new int[]{3, 3, 6, 10, 15}, 2));
        // System.out.println("Element is found at index: " +
        // binarySearchInfiniteArray(new int[]{3, 3, 6, 10, 15}, 3));
        System.out.println("Element is found at index: "
                + binarySearchInfiniteArrayFirstOccurence(new int[] { 3, 3, 6, 6, 10, 15 }, 6));
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

    static int minimumAbsoluteDiff(int[] arr, int target) {
        int ans = Integer.MAX_VALUE;
        int floor = binarySearchFloor(arr, target);
        int ceiling = binarySearchCeiling(arr, target);
        if (floor == -1) {
            ans = Math.abs(ceiling - target);
        } else if (ceiling == -1) {
            ans = Math.abs(floor - target);
        } else {
            ans = Math.min(Math.abs(floor - target), Math.abs(ceiling - target));
        }

        return ans;
    }

    static int minimumAbsoluteDiffBinarySearch(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                ans = 0;
                return ans;
            } else if (arr[mid] < target) {
                start = mid + 1;
                ans = Math.min(ans, Math.abs(arr[mid] - target));
            } else {
                end = mid - 1;
            }
        }

        if (ans == -1) {
            if (start == arr.length) {
                ans = Math.abs(arr[end] - target);
            } else if (end == -1) {
                ans = Math.abs(arr[start] - target);
            } else {
                ans = Math.min(Math.abs(arr[start] - target), Math.abs(arr[end] - target));
            }
        }

        return ans;
    }

    static int binarySearchInfiniteArray(int[] arr, int key) {
        int start = 0;
        int end = 1;

        while (arr[end] < key) {
            start = end;
            end = end * 2;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int binarySearchInfiniteArrayFirstOccurence(int[] arr, int key) {
        int start = 0;
        int end = 1;
        int ans = -1;

        while (arr[end] < key) {
            start = end;
            end = end * 2;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= key) {
                ans = mid;
                end = mid - 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            }
        }
        return ans;
    }
}
