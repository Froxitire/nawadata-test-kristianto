import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a number (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                NumberOne.run();
                break;

            case 2:
                NumberTwo.run();
                break;

            default:
                System.out.println("Invalid choice! Please choose 1 or 2.");
                break;
        }
    }
}
