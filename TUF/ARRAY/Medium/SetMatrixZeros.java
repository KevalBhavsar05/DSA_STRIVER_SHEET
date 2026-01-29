public class SetMatrixZeros {
    public void setZeroes(int[][] matrix) {
        // m = rows, n = columns
        int m = matrix.length, n = matrix[0].length;

        // flags to indicate whether first row and first column need to be zeroed
        boolean row0 = false, col0 = false;

        // check first row and first column for zeros
        for (int i = 0; i < m; i++)
            if (matrix[i][0] == 0)
                col0 = true;
        for (int j = 0; j < n; j++)
            if (matrix[0][j] == 0)
                row0 = true;

        // use first row and first column as markers
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;

        // set matrix cells to zero based on markers
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;

        // finally, zero out first row and first column if needed
        if (col0)
            for (int i = 0; i < m; i++)
                matrix[i][0] = 0;
        if (row0)
            for (int j = 0; j < n; j++)
                matrix[0][j] = 0;
    }

}
// TC : O(m*n)
// SC : O(1)



// Better Approach
// int[] row = new int[m]; --> m[i,0]
// int[] col = new int[n]; --> m[0,j]

// Mark row and col which has zero
// for (int i = 0; i < m; i++) {
// for (int j = 0; j < n; j++) {
// if (matrix[i][j] == 0) {
// row[i] = 1;
// col[j] = 1;
// }
// }
// }

// Set zeros
// for (int i = 0; i < m; i++) {
// for (int j = 0; j < n; j++) {
// if (row[i] == 1 || col[j] == 1) {
// matrix[i][j] = 0;
// }
// }
// }

// TC : O(m*n)
// SC : O(m + n)