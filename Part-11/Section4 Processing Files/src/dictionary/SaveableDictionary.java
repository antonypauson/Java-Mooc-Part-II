package dictionary;

import java.util.HashMap;
import java.util.Map;

public class SaveableDictionary {
    Map<String, String> words;

    public SaveableDictionary() {
        this.words = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.words.putIfAbsent(word, translation);
    }

    public void delete(String word) {
        String itemReturned = "";
        if (this.words.containsKey(word)) {
            itemReturned = word;
        } else if (this.words.containsValue(word)) {
            for (String key : words.keySet()) {
                if (this.words.get(key).equals(word)) {
                    itemReturned = key;
                }
            }
        } else {
            itemReturned = null;
        }

        this.words.remove(itemReturned);
    }

    public String translate(String word) {
        String itemReturned = "";
        if (this.words.containsKey(word)) {
            itemReturned = this.words.get(word);
        } else if (this.words.containsValue(word)) {
            for (String key : this.words.keySet()) {
                if (this.words.get(key).equals(word)) {
                    itemReturned = key;
                }
            }
        } else {
            itemReturned = null;
        }
        return itemReturned;
    }

    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("ohjelmointi", "programming");
        dictionary.delete("apina");
        dictionary.delete("banana");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("banana"));
        System.out.println(dictionary.translate("banaani"));
        System.out.println(dictionary.translate("ohjelmointi"));
    }
}

