public class LinearSearch {
    public static void main(String[] args) {
        // linearSearch(new int[]{1, 2, 4, 4, 5}, 3);
        // multipleOccurenceLinearSearch(new int[]{1, 2, 4, 4, 5}, 9);
    }

    static void linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index: " + i);
                return;
            }
        }

        System.out.println("Not found");
    }

    static void multipleOccurenceLinearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found on index: " + i);
            }
        }
    }

    static void linearSearch2D(int[][] arr, int key, boolean findLast) {
        int outerIndex = -1;
        int innerIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    outerIndex = i;
                    innerIndex = j;
                }
                if (!findLast) {
                    break;
                }
            }
        }
        if (outerIndex == -1 && innerIndex == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Found at index: " + outerIndex + " " + innerIndex);
        }
    }

    static void linearSearchMultiple2D(int[][] arr, int key) {
        int size = 0;
        for (int i = 0; i < size; i++) {
            size += arr[i].length;

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Found at index: " + i + " " + j);
                    return;
                }
            }
        }

        System.out.println("Not found");
    }
}
