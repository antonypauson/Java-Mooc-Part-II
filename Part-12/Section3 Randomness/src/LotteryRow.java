import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        // Tests whether the number is already among the randomized numbers
        return this.numbers.contains(number);
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        random = new Random();

        // Implement the randomization of the numbers by using the method containsNumber() here


        while ((this.numbers.size() != 7)) {
            int randomNumber = random.nextInt(41);
            if (!(this.numbers.contains(randomNumber))) {
                this.numbers.add(randomNumber);
            }
        }
    }

    public boolean equals(Object other) {
        return false;
    }

    public static void main(String[] args) {
        LotteryRow row = new LotteryRow();
        ArrayList<Integer> lotteryNumbers = row.numbers();

        System.out.println("Lottery numbers:");
        for (int number: lotteryNumbers) {
            System.out.print(number + " ");
        }

        System.out.println("");
    }
}