package com.mapstruct.youcode;

import com.mapstruct.youcode.dto.request.UserRequestDTO;
import com.mapstruct.youcode.dto.response.UserResponseDTO;
import com.mapstruct.youcode.mapper.UserMapper;
import com.mapstruct.youcode.model.User;
import com.mapstruct.youcode.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MapstructApplication {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MapstructApplication.class, args);
        MapstructApplication app = context.getBean(MapstructApplication.class);
        app.someMethod();
    }

    @PostConstruct
    public void someMethod() {
        UserRequestDTO userRequest = new UserRequestDTO();
        userRequest.setName("Douaa");
        userRequest.setEmail("douaa@example.com");

        UserResponseDTO userResponse = userService.createUser(userRequest);
        System.out.println("User Response: ");
        System.out.println("ID: " + userResponse.getId());
        System.out.println("Name: " + userResponse.getName());
        System.out.println("Email: " + userResponse.getEmail());
    }
}
