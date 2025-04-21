import java.util.ArrayList;
public class ArrayList_ex {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Print the ArrayList
        System.out.println("ArrayList: " + numbers);

        // Access an element from the ArrayList
        int firstElement = numbers.get(0);
        System.out.println("First element: " + firstElement);

        // Remove an element from the ArrayList
        numbers.remove(1); // Removes the element at index 1 (20)
        System.out.println("After removal: " + numbers);

        // Get the size of the ArrayList
        int size = numbers.size();
        System.out.println("Size of ArrayList: " + size);

        // Check if the ArrayList contains a specific element
        boolean contains30 = numbers.contains(30);
        System.out.println("Contains 30: " + contains30);  
        
        // Clear the ArrayList
        numbers.clear();    
        System.out.println("After clearing: " + numbers);

        // Check if the ArrayList is empty
        boolean isEmpty = numbers.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);

        // Add elements again
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println("ArrayList after adding elements again: " + numbers);

        //Add a new element at a specific index
        numbers.add(3, 45); // Adds 45 at index 3
        System.out.println("ArrayList after adding 45 at index 3: " + numbers);
        
        // Get the index of a specific element
        int indexOf50 = numbers.indexOf(50);
        System.out.println("Index of 50: " + indexOf50);

        // Get the last index of a specific element
        numbers.add(50); // Adding another 50 for demonstration
        int lastIndexOf50 = numbers.lastIndexOf(50);
        System.out.println(numbers);
        System.out.println("Last index of 50: " + lastIndexOf50);

        // Get a sublist from the ArrayList
        ArrayList<Integer> sublist = new ArrayList<>(numbers.subList(1, 4)); // Gets elements from index 1 to 3
        System.out.println("Sublist (index 1 to 3): " + sublist);

        // Sort the ArrayList
        numbers.sort(null); // Sorts the ArrayList in natural order
        System.out.println("Sorted ArrayList: " + numbers);

        // Reverse the ArrayList
        ArrayList<Integer> reversedList = new ArrayList<>(numbers);
        java.util.Collections.reverse(reversedList); // Reverses the ArrayList
        System.out.println("Reversed ArrayList: " + reversedList);

        // Convert ArrayList to an array
        Integer[] array = new Integer[numbers.size()];
        numbers.toArray(array); // Converts ArrayList to array
        System.out.print("Array from ArrayList: ");
        for (Integer num : array) {
            System.out.print(num + " ");
        }
        System.out.println();  

        // Convert array back to ArrayList
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for (Integer num : array) {
            newArrayList.add(num); // Adds each element of the array to the new ArrayList
        }
        System.out.println("New ArrayList from array: " + newArrayList);

        // Check if the ArrayList is equal to another ArrayList
        ArrayList<Integer> anotherList = new ArrayList<>();
        anotherList.add(40);
        anotherList.add(45);
        anotherList.add(50);
        boolean isEqual = numbers.equals(anotherList);
        System.out.println("Is numbers equal to anotherList? " + isEqual);

    }
}
