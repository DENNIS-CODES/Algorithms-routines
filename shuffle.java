/*The shuffle() method of the Java collections framework is used to destroy any kind of order present in the data structure. It does just the opposite of the sorting*/
import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {

        // Creating an array list
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Sorted ArrayList: " + numbers);

        // Using the shuffle() method
        Collections.shuffle(numbers);
        System.out.println("ArrayList using shuffle: " + numbers);

    }
}