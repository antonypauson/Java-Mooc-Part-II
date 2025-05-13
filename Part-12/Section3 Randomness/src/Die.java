import java.util.Random;

public class Die {
    private Random random;
    private int numberOfFaces;

    public Die(int numberOfFaces) {
        this.random = new Random();
        this.numberOfFaces = numberOfFaces ;
    }

    public int throwDie() {
        return random.nextInt(numberOfFaces+1);
    }

    public static void main(String[] args) {
        Die die = new Die(6);

        for (int i = 0; i < 10; i++) {
            System.out.println(die.throwDie());
        }
    }
}
