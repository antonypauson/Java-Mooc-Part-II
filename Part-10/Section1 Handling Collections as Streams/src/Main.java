import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();

            if (row.equals("end")) {
                break;
            }

            inputs.add(row);
        }
        long numbersDivisibleByThree = inputs.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .filter(number -> number % 3 == 0)
                .count();

        System.out.println("Divisible by three: " + numbersDivisibleByThree);

        double average = inputs.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .average()
                .getAsDouble();

        System.out.println("Average number: " + average);
    }

}