package com.mapstruct.youcode;

import com.mapstruct.youcode.dto.request.UserRequestDTO;
import com.mapstruct.youcode.dto.response.UserResponseDTO;
import com.mapstruct.youcode.mapper.UserMapper;
import com.mapstruct.youcode.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MapstructApplication {

    public static void main(String[] args) {
        // Exemple de requête pour créer un utilisateur
        UserRequestDTO userRequestDTO = new UserRequestDTO();
        userRequestDTO.setName("Douaa");
        userRequestDTO.setEmail("douaa@example.com");

        User user = UserMapper.INSTANCE.userRequestDTOToUser(userRequestDTO);

        // Vérifier si le mapping a fonctionné
        if (user != null) {
            // Supposons qu'on ait persisté cet utilisateur en base de données et qu'il ait un ID
            user.setId(1L); // Simuler un ID après enregistrement

            // Mapper User vers UserResponseDTO
            UserResponseDTO userResponseDTO = UserMapper.INSTANCE.userToUserResponseDTO(user);

            // Afficher les informations du UserResponseDTO
            System.out.println("UserResponseDTO ID: " + userResponseDTO.getId());
            System.out.println("UserResponseDTO Name: " + userResponseDTO.getName());
            System.out.println("UserResponseDTO Email: " + userResponseDTO.getEmail());
        } else {
            System.out.println("Erreur: le mapping de UserRequestDTO vers User a échoué.");
        }
    }
}
