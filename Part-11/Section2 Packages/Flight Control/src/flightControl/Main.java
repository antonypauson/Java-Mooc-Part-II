package flightControl;

import flightControl.logic.FlightControl;
import flightControl.ui.TextUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightControl fl = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI ui = new TextUI(fl, scanner);
        ui.start();
    }
}
