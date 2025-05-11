public class Person {
    private String name;
    private Education edu;

    public Person(String name, Education edu) {
        this.name = name;
        this.edu = edu;
    }

    @Override
    public String toString() {
        return this.name + " " + this.edu;
    }

    public static void main(String[] args) {
        Person anna = new Person("Anna", Education.PHD);
        System.out.println(anna);
    }
}
