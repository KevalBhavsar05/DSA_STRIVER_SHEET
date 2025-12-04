public class twoDimensionalRray {
    public static void main(String args[]) {
        // Declaration and initialization of a 3x4 matrix
        int[][] matrix = new int[3][4];

        // Assigning a value
        matrix[0][0] = 1;
        matrix[1][2] = 5;

        // Traversing a 2D array
        System.out.println("\n2D Matrix:");
        for (int i = 0; i < matrix.length; i++) { // iterates through rows
            for (int j = 0; j < matrix[i].length; j++) { // iterates through columns of current row
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }

        // Initialization with values
        int[][] initializedMatrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
    }
}
