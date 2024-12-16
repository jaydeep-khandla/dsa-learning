public class BInarySearch6 {
    public static void main(String[] args) {
        // System.out.println("Minimum number of pages: " + bookAllocation(new int[] {
        // 12, 34, 67, 90 }, 2));
        System.out.println(
                "Minimum number of capacity: " + shipWithinDays(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5));
    }

    static boolean isAllocationPossible(int maxPages, int students, int[] books) {
        int studentCount = 1;
        int pages = 0;
        for (int i = 0; i < books.length; i++) {
            if (pages + books[i] > maxPages) {
                studentCount++;
                pages = 0;
            }
            pages += books[i];

            if (studentCount > students) {
                return false;
            }
        }
        return studentCount <= students;
    }

    static int bookAllocation(int[] books, int students) {

        int res = -1;

        if (books.length < students) {
            return -1;
        }

        // Range will be max of books and sum of books
        int start = Integer.MIN_VALUE;
        int end = 0;

        for (int i = 0; i < books.length; i++) {
            start = Math.max(start, books[i]);
            end += books[i];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAllocationPossible(mid, students, books)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }

        return res;

    }

    // -----------------------------------------------------------------

    static int shipWithinDays(int[] weights, int days) {
        int res = -1;

        int start = Integer.MIN_VALUE;
        int end = 0;

        for (int i = 0; i < weights.length; i++) {
            start = Math.max(start, weights[i]);
            end += weights[i];
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAllocationPossible(mid, days, weights)) {
                res = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return res;
    }
}
