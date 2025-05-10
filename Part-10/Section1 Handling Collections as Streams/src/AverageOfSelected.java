import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelected {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();
        System.out.println("Input numbers, type 'end' to stop");
        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }

            numbers.add(input);
        }
        System.out.println("Print the average of negative numbers or positive numbers? (n/p)");
        String input = scanner.nextLine();

        if (input.equals("n")) {
            double negativeAverage = numbers.stream()
                    .mapToInt(s -> Integer.parseInt(s))
                        .filter(n -> n < 0)
                                .average()
                                        .getAsDouble();
            System.out.println("Average of negative numbers: " + negativeAverage);
        } else {
            double positiveAverage = numbers.stream()
                            .mapToInt(s -> Integer.parseInt(s))
                                    .filter(n -> n >= 0)
                                            .average()
                                                    .getAsDouble();
            System.out.println("Average of positive numbers: " + positiveAverage);
        }
    }
}
