package com.mapstruct.youcode.mapper;

import com.mapstruct.youcode.dto.response.PersonResponse;
import com.mapstruct.youcode.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ExtendedPersonMapper extends PersonMapper {
    @Mapping(expression = "java(person.getFirstName() + \" \" + person.getLastName())", target = "fullName")
    @Override
    PersonResponse toPersonResponse(Person person);

}