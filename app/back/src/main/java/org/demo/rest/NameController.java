package org.demo.rest;

import org.demo.domain.Person;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@RestController
public class NameController {

    @RequestMapping("/")
    public Person index() {

        Person person = new Person();
        person.setFirstname("Marc");
        person.setLastname("Dupont");
        person.setBirthdate(new Date());

        return person;
    }

}