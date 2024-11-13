package com.mapstruct.youcode.service;

import com.mapstruct.youcode.dto.request.UserRequestDTO;
import com.mapstruct.youcode.dto.response.UserResponseDTO;
import com.mapstruct.youcode.mapper.UserMapper;
import com.mapstruct.youcode.model.User;
import com.mapstruct.youcode.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    public UserResponseDTO createUser(UserRequestDTO userRequestDTO) {
        User user = userMapper.toUser(userRequestDTO);
        user = userRepository.save(user);
        return userMapper.toUserResponse(user);
    }

    public UserResponseDTO getUser(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
        return userMapper.toUserResponse(user);
    }
}
