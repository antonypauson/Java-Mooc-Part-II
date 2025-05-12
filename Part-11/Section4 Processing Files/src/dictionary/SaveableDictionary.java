package dictionary;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class SaveableDictionary {
    private Map<String, String> words;
    private String file;

    public SaveableDictionary(String file) {
        this.words = new HashMap<>();
        this.file = file;
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);

            for (String key : words.keySet()) {
                writer.println(key+":"+words.get(key));
            }
            writer.println("Wrote");
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file));

            while (fileReader.hasNext()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(":");

               this.add(parts[0],parts[1]);
            }
            return true;

        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
            return false;
        }

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
        SaveableDictionary dictionary = new SaveableDictionary("words.txt");
        System.out.println(dictionary.load());
        System.out.println(dictionary.save());
    }
}

