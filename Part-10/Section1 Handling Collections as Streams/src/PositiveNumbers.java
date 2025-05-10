import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(-1);
        numbers.add(100);
        numbers.add(-10);
        numbers.add(5);

        System.out.println(positive(numbers));

    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(num -> num > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }

}
