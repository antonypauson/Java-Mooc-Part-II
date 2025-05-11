public class Main {
    public static void main(String[] args) {
        //String uses new assignment during each call
        String numbers = "";
        for (int i = 1; i < 5; i++) {
            numbers += i;
        }
        System.out.println(numbers);

        //Lets use StringBuilder instead
        StringBuilder num = new StringBuilder();
        for (int i = 1; i < 5; i++) {
            num.append(i);
        }
        System.out.println(num);
    }
}