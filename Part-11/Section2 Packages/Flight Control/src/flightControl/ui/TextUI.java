package flightControl.ui;

import flightControl.domain.Airplane;
import flightControl.domain.Flight;
import flightControl.domain.Place;
import flightControl.logic.FlightControl;
import java.util.Scanner;

public class TextUI {
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {
        startAssetControl();
        System.out.println();
        startFlightControl();
        System.out.println();
    }

    private void startFlightControl() {
        System.out.println("Flight Control");
        System.out.println("----------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplanes details");
            System.out.println("[x] Quit");

            System.out.println("> ");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                printAirplanes();
            } else if (input.equals("2")) {
                printFlights();
            } else if (input.equals("3")) {
                printAirplaneDetails();
            } else if (input.equals("x")) {
                break;
            }
        }
    }

    private void printAirplanes() {
        for (Airplane plane : flightControl.getAirplanes()) {
            System.out.println(plane);
        }
    }

    private void printFlights() {
        for (Flight flight : flightControl.getFlights()) {
            System.out.println(flight);
            System.out.println("");
        }
    }

    private void printAirplaneDetails() {
        System.out.println("Give the airplane id: ");
        String enteredID = scanner.nextLine();
        Airplane plane = askForAirplane(enteredID);
        System.out.println(plane);
        System.out.println();
    }

    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("-----------------");
        System.out.println();

        while (true) {
            System.out.println("Choose and action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");

            System.out.println("> ");
            String answer = scanner.nextLine();

            if (answer.equals("1")) {
                addAirplane();
            } else if (answer.equals("2")) {
                addFlight();
            } else if (answer.equals("x")) {
                break;
            }
        }
    }

    private void addAirplane() {
        System.out.println("Give the airplane id: ");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        int capacity = Integer.parseInt(scanner.nextLine());

        this.flightControl.addAirplane(id,capacity);
    }

    private void addFlight() {
        System.out.println("Give the airplane id:");
        String enteredID = scanner.nextLine();
        Airplane plane = askForAirplane(enteredID);
        System.out.println("Give the departure airport id: ");
        String departureID = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String destinationID = scanner.nextLine();

        this.flightControl.addFlight(plane, departureID, destinationID);
    }

    private Airplane askForAirplane(String input) {
        Airplane airplane = null;
        while (airplane == null) {
            airplane = flightControl.getAirplane(input);

            if (airplane == null) {
                System.out.println("No airplane was found with the id " + input);
            }
        }
        return airplane;
    }


}
