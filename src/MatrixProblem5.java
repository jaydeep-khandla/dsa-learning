import java.util.ArrayList;
import java.util.List;

public class MatrixProblem5 {
    public static void main(String[] args) {
        // int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        // List<Integer> result = spiralOrder(matrix);

        // printMatrix(result);

        printMatrix(generateMatrix(1));

    }

    static void printMatrix(List<Integer> matrix) {
        for (int cell : matrix) {
            System.out.print(cell + " ");
        }
        System.out.println();
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    static List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> result = new ArrayList<>();

        int sc = 0, ec = matrix[0].length - 1;
        int sr = 0, er = matrix.length - 1;

        while (sr <= er && sc <= ec) {
            for (int j = sc; j <= ec; j++) {
                result.add(matrix[sr][j]);
            }

            sr += 1;

            for (int i = sr; i <= er; i++) {
                result.add(matrix[i][ec]);
            }

            ec -= 1;

            if (sr <= er) {
                for (int j = ec; j >= sc; j--) {
                    result.add(matrix[er][j]);
                }

                er -= 1;
            }

            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    result.add(matrix[i][sc]);
                }

                sc += 1;
            }

        }

        return result;

    }

    static int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int val = 1;

        int sc = 0, ec = matrix[0].length - 1;
        int sr = 0, er = matrix.length - 1;

        while (sr <= er && sc <= ec) {
            for (int j = sc; j <= ec; j++) {
                matrix[sr][j] = val;
                val++;
            }

            sr += 1;

            for (int i = sr; i <= er; i++) {
                matrix[i][ec] = val;
                val++;
            }

            ec -= 1;

            if (sr <= er) {
                for (int j = ec; j >= sc; j--) {
                    matrix[er][j] = val;
                    val++;
                }

                er -= 1;
            }

            if (sc <= ec) {
                for (int i = er; i >= sr; i--) {
                    matrix[i][sc] = val;
                    val++;
                }

                sc += 1;
            }

        }

        return matrix;
    }
}
