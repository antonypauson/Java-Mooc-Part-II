package linecharts;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class DataFormat {
    private HashMap<Integer, Integer> values;
    private String fileName;
    public DataFormat() {
        this.values = new HashMap<>();
        this.fileName = "shanghai.txt";
    }

    public HashMap<Integer, Integer> getVals() {
        try {
            Files.lines(Paths.get(this.fileName))
                    .map(row -> row.split(" "))
                    .forEach(parts -> values.put(Integer.parseInt(parts[0]),Integer.parseInt(parts[1])));

//            for (Integer year : values.keySet()) {
//                System.out.println("rank:" + values.get(year));}

            return this.values;


        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }
        return this.values;

    }

}
