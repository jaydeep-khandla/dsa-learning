public class MatrixProblem3 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        System.out.println(searchMatrix(matrix, 13));
    }

    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0;
        int c = cols - 1;
        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] < target) {
                r += 1;
            } else {
                c -= 1;
            }
        }

        return false;
    }

    static boolean searchMatrix1(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0;
        int c = cols - 1;
        while (r < rows && c >= 0) {
            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] < target) {
                r += 1;
            } else {
                c -= 1;
            }
        }

        return false;
    }
}
