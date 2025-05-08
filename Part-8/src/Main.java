import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> postalCodes = new HashMap<>();

        postalCodes.put("MyCode", "Atlanta");
        postalCodes.put("MyCodey", "Montana");

        System.out.println(postalCodes.get("MyCode"));
        System.out.println(postalCodes.get("MyCodey"));

    }
}