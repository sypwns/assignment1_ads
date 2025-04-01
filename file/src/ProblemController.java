import java.util.ArrayList;

public class ProblemController {
    /**
     * Problem: Find the minimum element in an array.
     * This method takes an array and returns its minimum element.
     * It iterates through the array using an index-based for loop.
     *
     * Time Complexity: O(n), where n is the size of the array.
     *
     * @param arr The array to search.
     * @return The minimum element in the array.
     */
    public static int minOfArray(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;
    }


    /**
     Problem 2
     This method takes array and returns its average
     It uses for loop
     Time complexity: O(n), n is size of array
     It iterates through array, summarize elements and divides it by array size

     @param arr The array that would be iterated
     @return The average number of the given array
     */
    public static double averageOfArray(ArrayList<Integer> arr) {
        double summ = 0;
        for (int num : arr) {
            summ += num;
        }

        return summ / arr.size();
    }


    /**
     * Problem 3
     * This method checks if the given number is prime or composite
     * It uses for loop
     * Time complexity: O(n), n is input number
     * For loop iterates through 2 to number itself
     *
     * @param n The number that is checked
     * @return 1 or 0, depending on count
     */
    public static int isPrime(int n) {
        int counter = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }

        if (counter == 1) return 1;
        else return 0;
    }
}
