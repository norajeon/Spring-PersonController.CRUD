package io.zipcoder.crudapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepo;

    public Person createPerson (Person p) {
        Person person = new Person();
        person.setFirstName(p.getFirstName());
        person.setLastName(p.getLastName());
        person.setId(p.getId());
        return person;
    }

    public Person getPerson(int id) {
        return personRepo.findOne(id);
    }

    public List<Person> getPersonList() {
        return (List<Person>) personRepo.findAll();
    }

    public Person updatePerson(Person p) {
        return personRepo.updatePerson;
    }

    public void DeletePerson(int id) {
        personRepo.delete(id);
    }
    
}
