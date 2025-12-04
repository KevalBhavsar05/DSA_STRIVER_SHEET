import java.util.*;

public class staticArray {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] scores = new int[4];

        // Assign values
        scores[0] = 85;
        scores[1] = 92;
        scores[2] = 78;
        scores[3] = 95;

        // Access values
        System.out.println("Score at index 1: " + scores[1]); // Output: 92

        // Traverse the array
        System.out.println("All scores:");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "]: " + scores[i]);
        }

        // Enhanced for loop (for-each loop)
        System.out.println("\nScores using enhanced for loop:");
        for (int score : scores) {
            System.out.println(score);
        }

        // Trying to access out of bounds (will throw an exception)
        try {
            System.out.println(scores[4]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Sorting an array (using Arrays utility class)
        Arrays.sort(scores);
        System.out.println("\nScores after sorting: " + Arrays.toString(scores));
    }
}