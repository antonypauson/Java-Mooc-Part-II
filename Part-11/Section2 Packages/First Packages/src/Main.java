import mooc.ui.UserInterface;
import mooc.ui.TextInterface;
import mooc.logic.ApplicationLogic;

public class Main {
    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}