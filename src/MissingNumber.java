import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();
        int[] arr = new int[n - 1];

        System.out.println("Enter " + (n - 1) + " numbers:");
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        int total = n * (n + 1) / 2;
        int missing = total - sum;
        System.out.println("The missing number is: " + missing);

        scanner.close();
    }
}
