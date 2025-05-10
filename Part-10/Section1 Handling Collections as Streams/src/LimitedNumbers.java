import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>();

        while (true) {
            String row = scanner.nextLine();

            if (Integer.parseInt(row) < 0) {
                break;
            }

            inputs.add(row);
        }

        inputs.stream()
                .mapToInt(num -> Integer.parseInt(num))
                .filter(num -> num >= 1 && num <= 5)
                .forEach(num -> System.out.println(num));

    }
}
