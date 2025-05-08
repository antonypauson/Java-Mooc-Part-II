import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Container container;

    public UI(Scanner scanner, Container container) {
        this.scanner = scanner;
        this.container = container;
    }

    public void start() {
        System.out.println(container);

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] pieces = input.split(" ");
            String command = pieces[0];
            int value = Integer.parseInt(pieces[1]);
//            System.out.println("Command: " + command + "\nValue:" + value);

            if (command.equals("add")) {
                this.container.addContainer(value);
                System.out.println(container);
            }

            if (command.equals("move")) {
                this.container.moveContainer(value);
                System.out.println(container);
            }

            if (command.equals("remove")) {
                this.container.removeContainer(value);
                System.out.println(container);
            }
        }
    }
}
