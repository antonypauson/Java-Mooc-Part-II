public class Main {
    public static void main(String[] args) {
//        Engine engine = new Engine("combustion", "hz", "volkswagen", "VW GOLF 1L 86-91");
//        System.out.println(engine.getEngineType());
//        System.out.println(engine.getManufacturer());

        Superclass sup = new Superclass();
        Subclass sub = new Subclass();

        System.out.println(sup);
        System.out.println(sub);
    }

}