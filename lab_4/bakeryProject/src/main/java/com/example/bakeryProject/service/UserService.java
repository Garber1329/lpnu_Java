package com.example.bakeryProject.service;

import com.example.bakeryProject.dto.UserDTO;
import com.example.bakeryProject.model.User;

import java.util.List;


public interface UserService {
    UserDTO findUserById(Long id);
    UserDTO findUserByLastName(String lastName);
    UserDTO findUserByEmail(String email);
    UserDTO findUserDTOByPhone(String phone);
    UserDTO findUserDTOByUserName(String username);
    List<UserDTO> getAllUsers();
    boolean deleteUser(Long user);
    UserDTO updateUser(final UserDTO userDTO);

}
