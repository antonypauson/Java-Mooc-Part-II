import java.util.Scanner;

public class PlusOperation extends Operation {

    public PlusOperation() {
        super("PlusOperation");
    }

    public void execute(Scanner scanner) {
        System.out.println("First number:");
        int first = Integer.parseInt(scanner.nextLine());
        System.out.println("Second number: ");
        int second = Integer.parseInt(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second));
    }
}
