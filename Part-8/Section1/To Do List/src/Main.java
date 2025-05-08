import java.util.Scanner;
//to do list task
//add: asks for a task, task is added with a task number
//list: lists every tasks added
//completed: asks for the task number, that task is removed
//stop: ends

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tasks tasks = new Tasks();
        UI ui = new UI(scanner, tasks);
        ui.start();
    }
}

//Command: add
//Task: go to the store
//Command: add
//Task: vacuum clean
//Command: list
//1: go to the store
//2: vacuum clean
//Command: completed
//Which task was completed? 2
//go to the store
//Command: list
//1: go to the store
//Command: add
//Task: program
//Command: list
//1: go to the store
//2: program
//Command: stop