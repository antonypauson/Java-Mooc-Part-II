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

    public String translate(String word) {
        String translateWord = "";
       if (this.words.containsKey(word)) {
           translateWord = this.words.get(word);
       } else if (this.words.containsValue(word)) {
           for (String meaning : this.words.keySet()) {
               if (this.words.get(meaning).equals(word)) {
                   translateWord = meaning;
               }
           }
       } else {
           translateWord = null;
       }
       return translateWord;
    }

    public static void main(String[] args) {
        SaveableDictionary dictionary = new SaveableDictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("apina", "apfe");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("monkey"));
        System.out.println(dictionary.translate("ohjelmointi"));
        System.out.println(dictionary.translate("banana"));
    }
}

