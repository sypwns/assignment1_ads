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
    /**
     * Problem 4
     * This method calculates the factorial of a given number
     * It uses recursive approach
     * Time complexity: 0(n), where n is the input number.
     * The recursive algorithm iterates through all numbers from n to resulting in linear time complexity.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number
     */
    public static int factorial(int n) {
        if (n == 1 || n == 0) return 1;
        else return n * factorial(n - 1);
    }
    /**
     * Problem 5
     * This method finds n-th elements in Fibonacci sequence
     * It uses recursive approach
     * Time complexity: 0(n), where n is the input number.
     * The recursive algorithm iterates through all numbers from n to resulting in linear time complexity.
     *
     * @param n The number is nth element in sequence
     *@return The fibonacci number of the given number
     */
    public static int calculateFib(int n) {
        if(n == 1 || n == 0){
            return n;
        }
        return  calculateFib(n-1) + calculateFib(n-2);
    }
    /**
     * Problem 6
     * This method finds power of a to n
     * It uses recursive approach
     * Time complexity: 0(n), n is the input number.
     * The recursive algorithm iterates through all numbers from n to resulting in linear time complexity.
     *
     * @param a, n The number a is powered to number n
     * @return The power a of to n
     */
    public static int power(int a, int n) {
        if (n == 0) return 1;
        else return a * power(a, n - 1);
    }
    /**
     * Problem 7
     * This method reverses array
     * It uses recursive approach
     * Time complexity: 0(n), n and n numbers as input.
     * The recursive algorithm iterates through all numbers from n to resulting in linear time complexity.

     * @param index, array The number n-1 is index of arr
     */
    public static void reverse(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reverse(arr, index - 1);
    }
    /**
     * Problem 8
     * This method check if String consists only of digits
     * It uses recursive approach
     * Time complexity: 0(n)
     * It iterates through the string
     *
     * @param s, index The s is some string that would be checked and index is its every element
     * @return true or false
     */
    public static boolean isAllDigits(String s, int index) {
        if (index == s.length()) return true;
        if (!Character.isDigit(s.charAt(index))) return false;
        return isAllDigits(s, index + 1);
    }
    /**
     * Problem 9
     * This method finds C(n, k) binomial coefficient
     * It uses recursive approach
     * Time complexity: 0(2^n), n is input
     *
     * @param n, k The numbers for calculation
     * @return binomial coefficient
     */
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) return 1;
        return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
    }
    /**
     * Problem 10
     * This method calculates GCD(a, b)
     * It uses recursive approach
     * Time complexity: 0(log min(a, b)), a and b as inputs
     *
     * @param a, b The numbers for calculation
     * @return gcd , number - Greatest common divisor
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
