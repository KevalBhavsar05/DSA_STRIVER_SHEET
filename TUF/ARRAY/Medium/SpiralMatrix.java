import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> printSpiral(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int m = matrix.length; // number of rows
        int n = matrix[0].length;// number of columns
        int top = 0;
        int right = n - 1;
        int bottom = m - 1;
        int left = 0;

        // eg. matrix = [
        // [1, 2, 3],
        // [4, 5, 6],
        // [7, 8, 9]
        // ]

        while (top <= bottom && left <= right) {
            // left to right
            for (int i = left; i <= right; i++)
                result.add(matrix[top][i]);

            top++;

            // top to bottom
            for (int i = top; i <= bottom; i++)
                result.add(matrix[i][right]);

            right--;

            // right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result.add(matrix[bottom][i]);

                bottom--;
            }

            // bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result.add(matrix[i][left]);

                left++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        printSpiral(matrix);
    }
}
