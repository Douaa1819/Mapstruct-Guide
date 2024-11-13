package com.mapstruct.youcode.mapper;

import com.mapstruct.youcode.dto.request.UserRequestDTO;
import com.mapstruct.youcode.dto.response.UserResponseDTO;
import com.mapstruct.youcode.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(target = "id", ignore = true)
    User toUser(UserRequestDTO userRequestDTO);
    UserResponseDTO toUserResponse(User user);
}

//    @Mapping(source = "firstName", target = "fullName")