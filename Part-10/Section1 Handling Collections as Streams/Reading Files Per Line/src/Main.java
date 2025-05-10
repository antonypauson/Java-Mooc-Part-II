import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println(read("presidents.txt"));
    }

    public static List<String> read(String file) {
        List<String> rows = new ArrayList<>();
        try {
            rows = Files.lines(Paths.get(file))
                    .map(row -> row + "\n")
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return rows;
    }


}