public class MatrixProblem4 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        transpose(matrix);
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

    static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    static void rotateby90AntiClock(int mat[][]) {
        // code here
        transpose(mat);

        int l = 0, r = mat.length - 1;

        while (l < r) {
            int[] temp = mat[l];
            mat[l] = mat[r];
            mat[r] = temp;
            l++;
            r--;
        }
    }

    static void rotateby90Clock(int mat[][]) {
        // code here
        transpose(mat);

        int l = 0, r = mat[0].length - 1;

        while (l < r) {
            for (int i = 0; i < mat.length; i++) {
                int temp = mat[i][l];
                mat[i][l] = mat[i][r];
                mat[i][r] = temp;
            }
            l++;
            r--;
        }
    }

}
