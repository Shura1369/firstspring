package edu.pro.firstspring.repository;

import edu.pro.firstspring.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
    Person findByName(String name);
    List<Person> findByAgeAfter(int age);
}
