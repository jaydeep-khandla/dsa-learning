public class MatrixProblem6 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 5, 9 }, { 10, 0, 13 }, { 12, 13, 0 } };
        setMatrixZeroes(matrix);
        printMatrix(matrix);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    static void setMatrixZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        boolean isCol = false;

        for (int i = 0; i < rows; i++) {
            if (mat[i][0] == 0) {
                isCol = true;
            }

            for (int j = 1; j < cols; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        if (mat[0][0] == 0) {
            for (int j = 0; j < cols; j++) {
                mat[0][j] = 0;
            }
        }

        if (isCol) {
            for (int i = 0; i < rows; i++) {
                mat[i][0] = 0;
            }
        }
    }
}
