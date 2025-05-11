import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {
        System.out.println("Provide an indian number:");
//        Scanner scanner = new Scanner(System.in);
//
//        String number = scanner.nextLine();
//
//        if (number.matches("91[6-9][0-9]{9}")) {
//            System.out.println("Correct Indian Number");
//        } else {
//            System.out.println("Incorrect Indian Number");
//        }

        //vertical line optional
        System.out.println("000".matches("00|11|000|111"));
        System.out.println("1".matches("00|11|000|111"));

        //parenthesis
        //only allow 00001 or 00000
        System.out.println("00000".matches("0000(0|1)"));
        System.out.println("car".matches("car(|s|)"));

        //quantifiers
        //* 0 to n times
        System.out.println("trolololololololo".matches("tro(lo)*"));
        //+ 1 to n times
        System.out.println("tro".matches("tro(lo)+")); //lo should be atleast one time
        System.out.println("trolo".matches("tro(lo)*"));//lo can be 0 times
        //? 0 or 1 times
        System.out.println("You have to accidentally delete the whole thing"
                .matches("You have to accidentally (delete)? the whole thing"));
        //{n} repeats that many times
        System.out.println("1010".matches("(10){2}"));
        //{a,b} repeats a to b times
        System.out.println("101010".matches("(10){1,3}"));
        //{a,} repeats a to any times
        System.out.println("1010101010".matches("(10){1,}"));

    }
}
