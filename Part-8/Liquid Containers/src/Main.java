import java.util.Scanner;
//we have two containers -> first and second
//both can hold maximum 100
//add: only adds to first
//move: moves from first to second
//remove: removes from second

public class Main {
    public static void main(String[] args) {

//        System.out.println("Hello, World!");
        Scanner scanner = new Scanner(System.in);
        Container container = new Container();
        UI ui = new UI(scanner, container);
        ui.start();
    }
}

//output
//First: 0/100
//Second: 0/100
//remove 10
//
//First: 0/100
//Second: 0/100
//add 20
//
//First: 20/100
//Second: 0/100
//remove 5
//
//First: 20/100
//Second: 0/100
//move 15
//
//First: 5/100
//Second: 15/100
//remove 5
//
//First: 5/100
//Second: 10/100
//remove 20
//
//First: 5/100
//Second: 0/100
//quit