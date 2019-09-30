package edu.pro.firstspring.service.person.impls;

import edu.pro.firstspring.model.Person;
import edu.pro.firstspring.repository.PersonRepository;
import edu.pro.firstspring.service.person.interfaces.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


@Service
public class PersonServiceImpl implements IPersonService {

    private final static Logger logger = Logger.getLogger(PersonServiceImpl.class.getName());
    List<Person> persons = new ArrayList<>(
            Arrays.asList(
                    new Person("Ivan", 20),
                    new Person("Ptero", 25),
                    new Person("Sidor", 18)
            )
    );

    @Autowired
    PersonRepository repository;

    @PostConstruct
    void init(){
        repository.deleteAll();
        repository.saveAll(persons);

    }




    @Override
    public List<Person> getAll() {
        logger.info("method getAll was called");
        return repository.findAll();
    }

    @Override
    public Person get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Person create(Person person) {
        return repository.save(person);
    }

    @Override
    public Person update(Person person) {
        return repository.save(person);
    }

    @Override
    public void delete(String id) {
         repository.deleteById(id);
    }

    @Override
    public Person getByName(String name) {
        return repository.findByName(name);
    }
}
