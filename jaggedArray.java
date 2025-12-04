
public class jaggedArray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][]; // Declare 3 rows, but not column sizes yet

        jaggedArray[0] = new int[2]; // Row 0 has 2 columns
        jaggedArray[1] = new int[4]; // Row 1 has 4 columns
        jaggedArray[2] = new int[1]; // Row 2 has 1 column

        // Assign values (example)
        jaggedArray[0][0] = 10;
        jaggedArray[0][1] = 20;
        jaggedArray[1][0] = 30;
        jaggedArray[1][1] = 40;
        jaggedArray[1][2] = 50;
        jaggedArray[1][3] = 60;
        jaggedArray[2][0] = 70;

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
