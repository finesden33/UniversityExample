package data_access;

import entity.Person;

public interface UniversityDataAccessInterface {
    void save(Person person);

    Person get(String utorid);
}
