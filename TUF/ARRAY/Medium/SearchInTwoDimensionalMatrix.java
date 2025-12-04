

public class SearchInTwoDimensionalMatrix {
    // public boolean searchMatrix(int[][] matrix, int target) {
    // // bruteforce approach
    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[i].length; j++) {
    // if (matrix[i][j] == target)
    // return true;
    // }
    // }
    // return false;
    // }

    // Note: Given a matrix m x n, the cell location row = index i / m and column =
    // index i % m

    public static boolean binarySearch(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length * matrix[0].length - 1;
        while (left <= right) {
            int mid = (right + left) / 2;
            // m = matrix[0].length
            int row = mid / matrix[0].length;
            int col = mid % matrix[0].length;
            if (matrix[row][col] == target)
                return true;
            else if (target < matrix[row][col]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 3, 5, 7 },
                { 10, 11, 16, 20 },
                { 23, 30, 34, 60 }
        };
        int target = 17;
        boolean found = binarySearch(matrix, target);
        System.out.println("Target " + target + " found: " + found);
    }
}
