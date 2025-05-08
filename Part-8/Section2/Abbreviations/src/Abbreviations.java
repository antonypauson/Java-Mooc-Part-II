import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbs;

    public Abbreviations() {
        this.abbs = new HashMap<>();
    }

    public void addAbbreviation(String shortForm, String longForm) {
        if (this.abbs.containsKey(shortForm)) {
            System.out.println("Already exists");
        } else {
            this.abbs.put(shortForm, longForm);
        }
    }

    public boolean hasAbbreviation(String part) {
        return this.abbs.containsKey(part);
    }

    public String findExplanationFor(String part) {
        return this.abbs.getOrDefault(part, "Not found");
    }
}
