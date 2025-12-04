import java.util.ArrayList;
import java.util.Collections;

public class dynamicArray {
    public static void main(String[] args) {
        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements
        fruits.add("Apple"); // Index 0
        fruits.add("Banana"); // Index 1
        fruits.add("Cherry"); // Index 2
        fruits.add("Date"); // Index 3
        fruits.add("Banana"); // Duplicates are allowed

        System.out.println("Fruits: " + fruits); // Output: [Apple, Banana, Cherry, Date, Banana]

        // Get size
        System.out.println("Number of fruits: " + fruits.size()); // Output: 5

        // Access element by index
        System.out.println("Fruit at index 1: " + fruits.get(1)); // Output: Banana

        // Set/update an element
        fruits.set(1, "Blueberry");
        System.out.println("Fruits after update: " + fruits); // Output: [Apple, Blueberry, Cherry, Date, Banana]

        // Add at a specific index (shifts elements)
        fruits.add(1, "Orange"); // Inserts "Orange" at index 1, shifting Blueberry and others
        System.out.println("Fruits after adding at index 1: " + fruits); // Output: [Apple, Orange, Blueberry, Cherry,
                                                                         // Date, Banana]

        // Remove an element by index
        fruits.remove(0); // Removes "Apple"
        System.out.println("Fruits after removing index 0: " + fruits); // Output: [Orange, Blueberry, Cherry, Date,
                                                                        // Banana]

        // Remove an element by value
        fruits.remove("Banana"); // Removes the *first* occurrence of "Banana"
        System.out.println("Fruits after removing 'Banana': " + fruits); // Output: [Orange, Blueberry, Cherry, Date]

        // Check if an element exists
        System.out.println("Contains 'Cherry'? " + fruits.contains("Cherry")); // Output: true
        System.out.println("Contains 'Grape'? " + fruits.contains("Grape")); // Output: false

        // Get index of an element
        System.out.println("Index of 'Cherry': " + fruits.indexOf("Cherry")); // Output: 2 (if it exists)
        System.out.println("Last index of 'Cherry': " + fruits.lastIndexOf("Cherry")); // In this case, same as indexOf

        // Iterate through ArrayList
        System.out.println("\nIterating through fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Clear all elements
        fruits.clear();
        System.out.println("Fruits after clearing: " + fruits); // Output: []
        System.out.println("Number of fruits after clearing: " + fruits.size()); // Output: 0

        // Example with Integer
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(2);
        System.out.println("\nNumbers: " + numbers);

        // Sort an ArrayList
        Collections.sort(numbers);
        System.out.println("Numbers after sorting: " + numbers); // Output: [2, 5, 10, 20]
    }
}
