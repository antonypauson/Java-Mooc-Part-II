package linecharts;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PartyFormat {
    private List<Integer> years;
    private HashMap<String, List<Double>> map;
    private String fileName;

    public PartyFormat() {
        years = new ArrayList<>();
        map = new HashMap<>();
        fileName = "partiesdata.txt";
        loadDataYears();
        loadDataMap();
    }

    public void loadDataYears() {
        try {
           String header = String.valueOf(Files.lines(Paths.get(fileName)).findFirst().orElse(""));

            String[] parts = header.trim().split(" ");

            for (int i = 1; i < parts.length; i++) {
                years.add(Integer.parseInt(parts[i]));
            }


            for (Integer year : years) {
                System.out.println(year);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void loadDataMap() {
        try {
            Files.lines(Paths.get(fileName))
                    .skip(1)
                    .map(row -> row.split(" "))
                    .forEach(parts -> {
                        String partyName = parts[0];

                        List<Double> percentages = new ArrayList<>();
                        for (int i = 1; i < parts.length; i++) {
                            if (parts[i].equals("-")) {
                                percentages.add(0.0);
                            } else {
                                percentages.add(Double.parseDouble(parts[i]));
                            }
                        }

                        map.put(partyName, percentages);
                    });

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        PartyFormat pf = new PartyFormat();

    }

}
