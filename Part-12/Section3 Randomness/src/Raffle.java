import java.util.Random;

public class Raffle {
    public static void main(String[] args) {
        Random ladyLuck = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = ladyLuck.nextInt(10);
            System.out.println(randomNumber);
        }
    }
}
