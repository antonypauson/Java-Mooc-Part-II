import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        //we have a greaterthanFive function in Screeners
        //which return true
        //that is called in the filter
        long greaterThan5 = inputs.stream()
                .mapToInt(s -> Integer.parseInt(s))
                .filter(Screeners::greaterThanFive)
                .count();

        System.out.println("Numbers greater than five: " + greaterThan5);

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(6);

        ArrayList<Integer> values = list.stream()
                .filter(val -> val > 5)
                .map(val -> val * 2)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(values);
    }

}