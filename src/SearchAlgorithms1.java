public class SearchAlgorithms1 {
    public static void main(String[] args) {
        // System.out.println(
        // "(Jump Search) Element is at Index: " + jumpSearch(new int[] { 1, 2, 3, 4, 5,
        // 6, 7, 8, 9, 10 }, 5));
        System.out.println("(Ternary Search) Element is at Index: "
                + ternarySearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5));
        System.out.println(
                "(Exponential Search) Element is at Index: "
                        + exponentialSearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5));
        System.out.println("(Interpolation Search) Element is at Index: "
                + interpolationSearch(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5));
    }

    static int jumpSearch(int[] arr, int target) {
        int n = arr.length;
        int step = (int) Math.sqrt(n);
        int prev = 0;
        while (arr[step] < target) {
            prev = step;
            step += (int) Math.sqrt(n);
            if (step >= n) {
                return -1;
            }
        }
        while (arr[prev] < target) {
            prev++;
            if (prev == step) {
                return -1;
            }
        }
        if (arr[prev] == target) {
            return prev;
        }
        return -1;
    }

    static int ternarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid1 = start + (end - start) / 3;
            int mid2 = end - (end - start) / 3;
            if (arr[mid1] == target) {
                return mid1;
            } else if (arr[mid2] == target) {
                return mid2;
            } else if (arr[mid1] < target) {
                start = mid1 + 1;
            } else if (arr[mid2] > target) {
                end = mid2 - 1;
            } else {
                start = mid1 + 1;
                end = mid2 - 1;
            }
        }
        return -1;
    }

    static int exponentialSearch(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (arr[end] < target) {
            start = end;
            end *= 2;
        }

        if (end >= arr.length) {
            end = arr.length - 1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    static int interpolationSearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high && target >= arr[low] && target <= arr[high]) {
            if (arr[low] == arr[high]) {
                if (arr[low] == target) {
                    return low;
                } else {
                    return -1;
                }
            }
            int mid = low + (target - arr[low]) * (high - low) / (arr[high] - arr[low]);
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
