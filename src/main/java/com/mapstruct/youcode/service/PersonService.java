package com.mapstruct.youcode.service;

import com.mapstruct.youcode.dto.request.PersonRequest;
import com.mapstruct.youcode.dto.response.PersonResponse;
import com.mapstruct.youcode.mapper.PersonMapper;
import com.mapstruct.youcode.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonMapper personMapper;


    @Autowired
    public PersonService(PersonMapper personMapper) {
        this.personMapper = personMapper;
    }

    public PersonResponse getPersonResponse(PersonRequest request) {
        // Conversion de PersonRequest en Person
        Person person = personMapper.toPerson(request);

        // Conversion de Person en PersonResponse
        return personMapper.toPersonResponse(person);
    }
}