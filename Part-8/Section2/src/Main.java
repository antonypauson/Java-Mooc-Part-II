import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
        mattsIOU.setSum("Arthur", 10.5);
        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));






//        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
//        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");
//
//        Library library = new Library();
//        library.addBok(senseAndSensibility);
//        library.addBok(prideAndPrejudice);
//
//        System.out.println(library.getBook("SenSe and SensibiliTy"));
//
//        System.out.println(library.getBookByPart("sense"));
    }
}