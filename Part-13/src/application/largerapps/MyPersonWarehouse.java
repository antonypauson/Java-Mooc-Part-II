package application.largerapps;

import java.util.Collection;
import java.util.List;

public class MyPersonWarehouse implements PersonWarehouse {

    @Override
    public void save(Person person) {

    }

    @Override
    public Person search(String socialSecurityNumber) {
        return null;
    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public void delete(String socialSecurityNumber) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Collection<Person> getAll() {
        return List.of();
    }
}
