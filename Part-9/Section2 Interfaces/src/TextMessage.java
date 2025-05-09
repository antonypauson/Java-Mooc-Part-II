import java.util.ArrayList;

public class TextMessage implements Readable {
    private String sender;
    private String content;

    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    public String read() {
        return this.content;
    }

    public static void main(String[] args) {
        TextMessage message = new TextMessage("ope", "Its going great");
        System.out.println(message.read());

        ArrayList<TextMessage> textMessages = new ArrayList<>();
        textMessages.add(new TextMessage("private number", "I hid the body"));
    }
}
