import java.util.HashMap;

public class PrintMeMyHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashMap, String key) {
        for (String keys : hashMap.keySet()) {
            if (keys.contains(key)) {
                System.out.println(hashMap.get(keys));
            }
        }
    }

    public static void printKeys(HashMap<String, String> hashMap) {
        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashMap, String where) {
        for (String key : hashMap.keySet()) {
            if (key.contains(where)) {
                System.out.println(key);
            }
        }
    }
}
