import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many Fibonacci numbers to print: ");
        int count = input.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + " " + second);

        for (int i = 2; i < count; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }
    }
}
