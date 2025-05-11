import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {
        System.out.println("Provide an indian number:");
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        if (number.matches("91[6-9][0-9]{9}")) {
            System.out.println("Correct Indian Number");
        } else {
            System.out.println("Incorrect Indian Number");
        }
    }
}
