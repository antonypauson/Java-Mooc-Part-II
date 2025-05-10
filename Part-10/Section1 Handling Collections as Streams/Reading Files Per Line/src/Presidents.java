import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Presidents {
    public static void main(String[] args) {
        List<PersonNew> presidents = new ArrayList<>();

        try {
            Files.lines(Paths.get("presidents.txt"))
                    .map(row -> row.split(";"))
                    .filter(parts -> parts.length >= 2)
                    .map(parts -> new PersonNew(parts[0], Integer.parseInt(parts[1])))
                    .forEach(person -> presidents.add(person));


        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
