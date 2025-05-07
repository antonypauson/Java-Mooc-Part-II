import java.util.Scanner;

//Program finds average of positive numbers only

public class AverageOfPositveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            int input = Integer.parseInt(scanner.nextLine());

            if (input == 0) {
                break;
            }

            if (input > 0) {
                count++;
                sum += input;
            }
         }

        if (count < 0) {
            System.out.println("Can't calculate the average");
        } else {
            System.out.println(1.0 * sum / count);
        }
    }
}
