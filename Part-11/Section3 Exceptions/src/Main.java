import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        readNumber(scanner);
    }

    public static int readNumber(Scanner scanner) {

        while (true) {
            System.out.println("Enter a number: ");

            try {
                int readNumber = Integer.parseInt(scanner.nextLine());
                return readNumber;
            } catch (Exception e) {
                System.out.println("Enter again dude!");
            }
        }
    }
}