import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is an Uppercase Alphabet.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("The character is a Lowercase Alphabet.");
        } else {
            System.out.println("The character is not an Alphabet.");
        }

        scanner.close();
    }
}
