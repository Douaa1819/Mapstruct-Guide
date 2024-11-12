package com.mapstruct.youcode.mapper;

import com.mapstruct.youcode.dto.request.UserRequestDTO;
import com.mapstruct.youcode.dto.response.UserResponseDTO;
import com.mapstruct.youcode.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    // Mapping pour convertir User vers UserResponseDTO
    UserResponseDTO userToUserResponseDTO(User user);

    // Mapping pour convertir UserRequestDTO vers User
    User userRequestDTOToUser(UserRequestDTO userRequestDTO);
}