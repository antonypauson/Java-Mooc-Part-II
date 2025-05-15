package application.vocabulary;

import java.util.*;

public class Dictionary {

    private List<String> words;
    private Map<String, String> translations;

    public Dictionary() {
        words = new ArrayList<>();
        translations = new HashMap<>();
        this.words.add("bang");
        this.translations.put("bang", "bang");
    }

    public String get(String word) {
        return this.translations.get(word);
    }

    public void add(String word, String translation) {
        if (!this.translations.containsKey(word)) {
            this.words.add(word);
        }
        this.translations.put(word, translation);

//        System.out.println((this.words));

//        System.out.println(this.translations.keySet());
    }

    public String getRandomWord() {
        Random random = new Random();


        String randomWord = this.words.get(random.nextInt(this.words.size()));

        return randomWord;
    }

    public void printWords() {
        System.out.println((this.words));
     }

     public void printTrans() {
         System.out.println(this.translations.keySet());
         System.out.println(this.translations.values());
     }


}
