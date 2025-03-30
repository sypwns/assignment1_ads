import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose a problem 1 - 10");

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

    }
}