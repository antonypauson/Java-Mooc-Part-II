import java.util.Scanner;

public class UI {
    private Scanner scanner;
    private Tasks tasks;

    public UI(Scanner scanner, Tasks tasks) {
        this.scanner = scanner;
        this.tasks = tasks;
    }

    public void start() {
        int count = 0;
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("add")) {
                System.out.println("Task:");
                String task = scanner.nextLine();
                count++;
                this.tasks.addTask(task,count);
                System.out.println(this.tasks);
            }

            if (command.equals("list")) {
                System.out.println(this.tasks);
            }

            if (command.equals("completed")) {
                System.out.println("Which task was completed?");
                int taskNum = Integer.parseInt(scanner.nextLine());
                this.tasks.getTask(taskNum);
            }

        }
    }
}
