import java.util.ArrayList;

public class ReadingList implements Readable{
    private ArrayList<Readable> readables;

    public ReadingList() {
        readables = new ArrayList<>();
    }

    public void add(Readable readable) {
        this.readables.add(readable);
    }

    public int toRead() {
        return this.readables.size();
    }

    public String read() {
        String read = "";

        for (Readable readable : this.readables) {
            read = read + readable.read() + "\n";
        }

        this.readables.clear();
        return read;

    }

    public static void main(String[] args) {
        ReadingList jonisList = new ReadingList();
        jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
        jonisList.add(new TextMessage("arto", "have you checked the submissions yet?"));

        System.out.println("Joni's to-read: " + jonisList.toRead());
    }
}
