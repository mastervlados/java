package service.Interfaces;

import domain.Classes.Person.Person;

public interface iPersonController<T extends Person> {
    void create(String firstName, String SecondName, int age);
}
