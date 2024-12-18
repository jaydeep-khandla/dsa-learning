public class BinarySearch12 {
    public static void main(String[] args) {
        System.out.println("Kth element is: " + kthElement(new int[] { 2, 6, 8 }, new int[] { 3, 6, 8 }, 5));
    }

    static long kthElement(int[] arr1, int[] arr2, int k) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        if (n1 > n2) {
            return kthElement(arr2, arr1, k);
        }

        if (n1 == 0) {
            return arr2[(int) (k - 1)];
        }

        if (k == 1) {
            return Math.min(arr1[0], arr2[0]);
        }

        // int N = n1 + n2;
        int start = Math.max(0, k - n2);
        int end = Math.min(k, n1);

        while (start <= end) {
            int cut1 = start + (end - start) / 2;
            int cut2 = k - cut1;

            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = cut1 == n1 ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2 == n2 ? Integer.MAX_VALUE : arr2[cut2];

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                end = cut1 - 1;
            } else {
                start = cut1 + 1;
            }
        }
        return 0;
    }
}
