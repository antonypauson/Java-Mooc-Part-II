public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (name.isEmpty() || name.length() > 40 || name == null) {
            throw new IllegalArgumentException("Illegal name");
        }
            else if (age < 0 || age > 120) {
                throw new IllegalArgumentException("Age out of range");
            }
        }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
