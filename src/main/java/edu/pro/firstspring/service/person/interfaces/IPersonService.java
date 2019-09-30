package edu.pro.firstspring.service.person.interfaces;

import edu.pro.firstspring.model.Person;

import java.util.List;

public interface IPersonService {
    List<Person> getAll();
    Person get(String id);
    Person create(Person person);
    Person update(Person person);
    void delete(String id);
    Person getByName(String name);
}
