package barcharts;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class CycleDataFormat {

    private List<String> rows;

    public CycleDataFormat(String file) {
        try {
            this.rows = Files.lines(Paths.get(file))
                    .collect(Collectors.toCollection(ArrayList::new));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public List<String> locations() {
        List<String> locations = Arrays.stream(rows.get(0).split(";")).collect(Collectors.toList());
        return locations.subList(1, locations.size());
    }

    private String stringToMonthNumber(String month) {
        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        int number = months.indexOf(month) + 1;

        if (number < 10) {
            return "0" + number;
        }

        return "" + number;
    }

    public Map<String, Integer> monthlyCyclists(String location) {
        List<String> locations = locations();
        if (locations.indexOf(location) < 0) {
            return new HashMap<>();
        }

        Map<String, List<Integer>> monthlyValues = new TreeMap<>();

        int index = locations.indexOf(location) + 1;
        this.rows.stream().map(string -> string.split(";"))
                .filter(array -> array.length > 10)
                .forEach(array -> {
                    String[] dateArray = array[0].split(" ");
                    if (dateArray.length < 3) {
                        return;
                    }

                    String month = dateArray[3] + " / " + stringToMonthNumber(dateArray[2]);

                    monthlyValues.putIfAbsent(month, new ArrayList<>());

                    int count = 0;

                    if (!array[index].isEmpty()) {
                        count = Integer.parseInt(array[index]);
                    }

                    monthlyValues.get(month).add(count);
                    });

        Map<String, Integer> cyclistCounts = new TreeMap<>();
        monthlyValues.keySet().stream().forEach(value -> {
            cyclistCounts.put(value, monthlyValues.get(value).stream().mapToInt(a -> a).sum());
        });

        return cyclistCounts;

    }



}
