import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your roll no:");
        int roll_no = sc.nextInt();

        System.out.println("My name is " + name + " and Roll no is " + roll_no);

        sc.close();
    }
}