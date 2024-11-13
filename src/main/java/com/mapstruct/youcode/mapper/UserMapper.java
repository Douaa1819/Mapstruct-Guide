package com.mapstruct.youcode.mapper;

import com.mapstruct.youcode.dto.request.UserRequestDTO;
import com.mapstruct.youcode.dto.response.UserResponseDTO;
import com.mapstruct.youcode.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserResponseDTO userToUserResponseDTO(User user);

    User userRequestDTOToUser(UserRequestDTO userRequestDTO);
}