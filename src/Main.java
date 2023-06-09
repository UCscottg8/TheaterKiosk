import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Output statement
        System.out.println("Enter your age: ");
        // Input
        int age = scanner.nextInt();

        if (age >= 21) {
            // Output statement
            System.out.println("You get a wrist band.");
        }
    }
}