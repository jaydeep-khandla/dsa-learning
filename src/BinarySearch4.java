public class BinarySearch4 {
    public static void main(String[] args) {
//        System.out.println("the element id found at index: " + searchInRotatedSortedArray(new int[]{5, 6, 7, 8, 1, 2, 3, 4}, 2));
//        System.out.println("the element id found at index: " + searchInRotatedSortedArrayII(new int[]{5, 5, 5, 5, 5, 5, 6, 7, 8, 1, 2, 2, 3, 4, 5}, 2));
//        System.out.println("the minimum element is: "+ findMinElementInRotatedSortedArray(new int[]{5, 6, 7, 8, 1, 2, 3, 4}));
//        System.out.println("the minimum element is: " + findMinElementInRotatedSortedArrayII(new int[]{5, 5, 5, 5, 5, 5, 6, 7, 8, 1, 2, 2, 3, 4, 5}));
        System.out.println("Number of Rotations in the array is: "+ findNumberOfRotations(new int[]{5, 6, 7, 8, 1, 2, 3, 4}));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

    static  int searchInRotatedSortedArray(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = mid;
            }

            if(arr[start] <= arr[mid]){
                if (target >= arr[start] && target <= arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return ans;
    }

    static boolean searchInRotatedSortedArrayII (int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean ans = false;

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                ans = true;
                break;
            }

            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
                start++;
                end--;
            } else if (arr[start] <= arr[mid]){
                if (target >= arr[start] && target <= arr[mid]){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= arr[mid] && target <= arr[end]){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return ans;
    }

    static int findMinElementInRotatedSortedArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        int min = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (arr[start] <= arr[mid]){
                min = Math.min(min, arr[start]);
                start = mid + 1;
            } else {
                min = Math.min(min, arr[mid]);
                end = mid - 1;
            }
        }

        return min;
    }

    static int findMinElementInRotatedSortedArrayII(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int min = Integer.MAX_VALUE;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (arr[start] == arr[mid] && arr[end] == arr[mid]){
                min = Math.min(min, arr[mid]);
                start++;
                end--;
            } else if (arr[start] <= arr[mid]){
                min = Math.min(min, arr[start]);
                start = mid + 1;
            } else {
                min = Math.min(min, arr[mid]);
                end = mid - 1;
            }
        }

        return min;
    }

    static int findNumberOfRotations(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else if (arr[start] > arr[mid]) {
                end = mid;
            } else {
                end--;
            }
        }

        return start;
    }

}
