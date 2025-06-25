import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * The SortedLinkedList class reads integers from user input,
 * stores them in a LinkedList, sorts them, and prints the result.
 *
 * Reuses: Java Collections Framework for storage and sorting.
 */
public class SortedLinkedList {

    /**
     * Main method to read input, sort it, and display the sorted list.
     *
     * Reuses: Scanner for input handling, LinkedList for storage,
     * and Collections.sort for sorting functionality.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> numbers = new LinkedList<>();

        System.out.println("Enter one integer at a time and press Enter after each entry.");
        System.out.println("To stop entering numbers, type any non-integer (like 'x') and press Enter.");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                numbers.add(num);
            } else {
                // Escape condition: stop reading if input is not an integer
                break;
            }
        }

        Collections.sort(numbers);

        System.out.println("Sorted Linked List:");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
