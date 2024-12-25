public class MatrixProblem1 {
    public static void main(String[] args) {

    }

    static int countElementsSmallerThanMedian(int mat[][], int assumedMedian) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            int start = 0, end = mat[i].length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (mat[i][mid] <= assumedMedian) {
                    // count += mid + 1;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            count += start;
        }
        return count;
    }

    static int median(int mat[][]) {
        int N = mat.length * mat[0].length;
        int medianIndex = N / 2;

        int start = 1, end = 2000;

        while (start <= end) {
            int assumedMedian = start + (end - start) / 2;
            int count = countElementsSmallerThanMedian(mat, assumedMedian);
            if (count <= medianIndex) {
                start = assumedMedian + 1;
            } else {
                end = assumedMedian - 1;
            }

        }

        return start;
    }

}
