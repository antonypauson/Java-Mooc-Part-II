package application.person;

public class Person {
    private String name;
    private String socialSecurity;

    public Person(String name, String socialSecurity) {
        this.name = name;
        this.socialSecurity = socialSecurity;
    }


    public String getName() {
        return name;
    }

    public String getSocials() {
        return socialSecurity;
    }

}
