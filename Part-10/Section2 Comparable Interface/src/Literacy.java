import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Literacy implements Comparable<Literacy>{
    private double litRate;
    private String country;
    private int year;
    private String gender;

    public Literacy(String country, int year, String gender, double litRate) {
        this.country = country;
        this.year = year;
        this.gender = makeGenderBetter(gender);
        this.litRate = litRate;
    }

    public String makeGenderBetter(String gender) {
        String newGen = gender.trim();
        if (newGen.charAt(0) == 'm') {
            return "male";
        } else {
            return "female";
        }
    }

    public double getLitRate() {
        return this.litRate;
    }

    @Override
    public int compareTo(Literacy literacy) {
        return ((int) this.litRate - (int)literacy.getLitRate());
    }

    @Override
    public String toString() {
        return this.country + "(" + this.year + "), " + this.gender +
                ", " + this.litRate;
    }

    public static void main(String[] args) {

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(parts -> new Literacy(parts[3], Integer.parseInt(parts[4]), parts[2], Double.parseDouble(parts[5])))
                    .sorted()
                    .forEach(row -> System.out.println(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
