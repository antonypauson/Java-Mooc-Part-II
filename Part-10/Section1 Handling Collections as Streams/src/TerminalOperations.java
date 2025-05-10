import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperations {
    //terminal operations are:
    //count()
    //collect()
    //forEach()
    //reduce()

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(2);
        values.add(17);
        values.add(6);
        values.add(8);

        //count
        System.out.println("No of values: " + values.stream().count());

        //forEach
        values.stream()
                .filter(val -> val % 2 == 0)
                .forEach(val -> System.out.println(val + "i s divisilbe by 2"));

        //collect
        List<Integer> list = values.stream()
                .map(val -> val + 1)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
