package io.zipcoder.persistenceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by O581051 on 8/31/2017.
 */

@Service
public class PersonService {
    @Autowired
    NamedParameterJdbcTemplate namedParamTemplate;

    private static final String INSERT_PERSON =
            "INSERT INTO person (first_name, last_name, mobile, birthday) " +
                    "VALUES (:first_name, :last_name, :mobile, :birthday)";

    public void addPerson(Person person){
        Map<String, Object> personMap = new HashMap<>();
        personMap.put("first_name", person.getFirstName());
        personMap.put("last_name", person.getLastName());
        personMap.put("mobile", person.getMobile());
        personMap.put("birthday", person.getBirthday());

        namedParamTemplate.update(INSERT_PERSON, personMap);

    }
}