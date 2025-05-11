import java.util.Scanner;

public class Checker {

    public static boolean isDayOfWeek(String string) {
        if (string.matches(
                "mon|tue|wed|thu|fri|sat|sun"
        ))    {
            return true;
        }
        return false;
    }

    public static boolean allVowels(String string) {
        if (string.matches("[aeiou]+")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                break;
            }

//            if (isDayOfWeek(input)) {
//                System.out.println("The form is correct");
//            } else {
//                System.out.println("The form is incorrect");
//            }

            if (allVowels(input)) {
                System.out.println("The form is correct");
            } else {
                System.out.println("The form is incorrect");
            }
        }
    }

}
