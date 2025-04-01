import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose one problem 1 - 10");

        Scanner scanner = new Scanner(System.in);
        int problem = scanner.nextInt();

        ProblemController problemController = new ProblemController();

        if (problem == 1) {
            System.out.print("Enter the number of elements (n): ");
            int n = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }

            double startTime = System.nanoTime();
            int result = problemController.minOfArray(arr);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            System.out.println("The minimum element of array is " + result);
            System.out.println("Time taken in milliseconds: " + duration);
        }


        if (problem == 2) {
            System.out.print("Enter the number of elements (n): ");
            int n = scanner.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr.add(scanner.nextInt());
            }


            double startTime = System.nanoTime();
            double result = problemController.averageOfArray(arr);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            System.out.println("The average number of array is: " + result);
            System.out.println("Time taken in milliseconds: " + duration);

        }

        if (problem == 3) {
            System.out.println("Enter number for checking:");
            int n = scanner.nextInt();

            double startTime = System.nanoTime();
            int result = problemController.isPrime(n);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            if (result == 1)
                System.out.println("Yes, it is prime number");
            else if (result == 0)
                System.out.println("No, it composite number");

            System.out.println("Time taken in milliseconds: " + duration);

        }
        if (problem == 4) {
            System.out.println("Enter number for checking:");
            int n = scanner.nextInt();

            double startTime = System.nanoTime();
            int result = problemController.factorial(n);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            System.out.println("The factorial of your number is: " + result);
            System.out.println("Time taken in milliseconds: " + duration);
        }
        if (problem == 5) {
            System.out.println("Enter number for checking:");
            int n = scanner.nextInt();

            double startTime = System.nanoTime();
            int result = problemController.calculateFib(n);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            System.out.println("The fibonacci number is: " + result);
            System.out.println("Time taken in milliseconds: " + duration);
        }
        if (problem == 6) {
            System.out.println("Enter 2 numbers:");
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            double startTime = System.nanoTime();
            int result = problemController.power(n, k);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            System.out.println("The power of numbers is: " + result);
            System.out.println("Time taken in milliseconds: " + duration);
        }
        if (problem == 7) {
            System.out.print("Enter the number of elements (n): ");
            int n = scanner.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }


            double startTime = System.nanoTime();
            System.out.println("The reversed array is: ");
            problemController.reverse(arr, n-1);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            System.out.println("\nTime taken in milliseconds: " + duration);
        }
        if (problem == 8) {
            System.out.print("Enter string for checking: ");
            String s = scanner.next();

            double startTime = System.nanoTime();
            boolean result = problemController.isAllDigits(s, 0);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            if (result)
                System.out.println("Yes, it is all digits");
            else
                System.out.println("No, it contains non-digits");
            System.out.println("Time taken in milliseconds: " + duration);
        }
        if (problem == 9) {
            System.out.print("Enter 2 correct numbers for finding binomial coefficient: ");
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            double startTime = System.nanoTime();
            int result = problemController.binomialCoeff(n, k);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            System.out.println("The binomial coefficient is: " + result);
            System.out.println("Time taken in milliseconds: " + duration);
        }

    }
}