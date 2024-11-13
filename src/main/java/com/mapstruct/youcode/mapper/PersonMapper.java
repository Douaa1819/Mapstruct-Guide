package com.mapstruct.youcode.mapper;

import com.mapstruct.youcode.dto.request.PersonRequest;
import com.mapstruct.youcode.dto.response.PersonResponse;
import com.mapstruct.youcode.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    @Mapping(source = "firstName", target = "firstName")
    @Mapping(source = "lastName", target = "lastName")
    PersonResponse toPersonResponse(Person person);

    Person toPerson(PersonRequest request);
}
