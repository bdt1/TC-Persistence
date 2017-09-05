package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by O581051 on 9/1/2017.
 */

@RestController
public class PersonController {

@Autowired
PersonService personService;

    @RequestMapping(value = "/people", method = RequestMethod.POST)
    public ResponseEntity<Person> addPerson(@RequestBody Person person) {
        personService.addPerson(person);
        return new ResponseEntity<Person>(person, HttpStatus.CREATED);
    }

    /*@RequestMapping(value = "/people", method = RequestMethod.GET)
    public ResponseEntity<Iterable<Person>> getPerson() {
        Iterable<Person> people = personService.findAll();
        return new ResponseEntity<Iterable<Person>>(people, HttpStatus.OK);
    }*/
}
