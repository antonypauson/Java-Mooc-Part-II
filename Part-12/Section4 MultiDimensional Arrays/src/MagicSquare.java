import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {
    private int[][] square;
    private Scanner scanner;

    public MagicSquare() {
        square = new int[3][3];
        scanner = new Scanner(System.in);
    }

    public void addNumbers() {
        System.out.println("Enter numbers: ");
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                int num = scanner.nextInt();
                square[row][col] = num;
            }
        }
        printMagicSquare();
    }

    public ArrayList<Integer> sumsOfRows() {
        ArrayList<Integer> listOfSums = new ArrayList<>();
        for (int row = 0; row < square.length; row++) {
            int sum = 0;
            for (int col = 0; col < square[row].length; col++) {
                sum += square[row][col];
            }
            listOfSums.add(sum);
        }
        return listOfSums;
    }

    public ArrayList<Integer> sumOfColumns() {
        ArrayList<Integer> listOfSums = new ArrayList<>();
        int j = 0;

        while (j < square.length) {
            int sum = 0;
            for (int i = 0; i < square.length; i++) {
                sum += square[i][j];
            }
            listOfSums.add(sum);
            j++;
        }
        return listOfSums;
    }

    public void printMagicSquare() {
        System.out.println("Printing: ");
        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                System.out.print(square[row][col]);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        MagicSquare magicSquare = new MagicSquare();
        magicSquare.addNumbers();
        System.out.println(magicSquare.sumsOfRows());
        System.out.println(magicSquare.sumOfColumns());
    }

}
