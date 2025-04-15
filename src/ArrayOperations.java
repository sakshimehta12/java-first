import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Choose an operation:");
        System.out.println("1. Display all elements");
        System.out.println("2. Search for an element");
        System.out.println("3. Find sum of elements");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Array elements:");
                for (int num : numbers) {
                    System.out.print(num + " ");
                }
                break;

            case 2:
                System.out.print("Enter element to search: ");
                int search = scanner.nextInt();
                boolean found = false;
                for (int num : numbers) {
                    if (num == search) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    System.out.println("Element found.");
                } else {
                    System.out.println("Element not found.");
                }
                break;

            case 3:
                int sum = 0;
                for (int num : numbers) {
                    sum += num;
                }
                System.out.println("Sum of elements: " + sum);
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}
