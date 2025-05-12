import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter("file.txt");
        writer.print("Hello file!");
        writer.print("Hey there");
        writer.print("WOW WOWO WOW ");
        writer.close();
    }
}