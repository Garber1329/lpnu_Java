package com.example.bakeryProject.service.imp;

import com.example.bakeryProject.repository.UserRepository;
import com.example.bakeryProject.dto.UserDTO;
import com.example.bakeryProject.mapper.UserToUserDTOMapper;
import com.example.bakeryProject.model.User;
import com.example.bakeryProject.exeption.EmailExceptionNotFound;
import com.example.bakeryProject.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
@Log4j
public class UserServiceImp implements UserService {
    @Autowired
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserToUserDTOMapper userDTOMapper;

    @Override
    public UserDTO findUserById(final Long id) {
        log.info ("Method find User by id");
        return userDTOMapper.toDTO(userRepository.findUserById (id));
    }

    @Override
    public UserDTO findUserByLastName(final String lastName) {
        log.info ("Method find User by lastname");
        return userDTOMapper.toDTO (userRepository.findUserByLastName (lastName));

    }

    @Override
    public UserDTO findUserByEmail(final String email) {
        log.info ("Method find User by email");
        return userDTOMapper.toDTO (userRepository.findUserByEmail (email));
    }

    @Override
    public UserDTO findUserDTOByPhone(final String phone) {
        log.info ("Method find User by phone");
        return userDTOMapper.toDTO (userRepository.findUserByPhone (phone));
    }


    @Override
    public UserDTO findUserDTOByUserName(final String username) {
        log.info ("Method find User by userName");

        return userDTOMapper.toDTO (userRepository.findUserByUserName (username));
    }

    @Override
    public List<UserDTO> getAllUsers() {
        log.info ("Method all Users");
        return  userRepository.getAllUsers ().stream ().map(e -> userDTOMapper.toDTO(e))
                .collect(Collectors.toList());
    }

    @Override
    public boolean deleteUser(final Long userId) {
        log.info ("Method  User by id");
        if (userRepository.findById(userId).isPresent()) {
            userRepository.deleteById(userId);
            return true;
        }
        return false;
    }

    @Override
    public UserDTO updateUser(final UserDTO userDTO) {
        log.info ("Method all Users");

        final User user = userDTOMapper.toModel (userDTO);

        return userDTOMapper.toDTO(userRepository.save (user));
    }

    public boolean saveUser(final UserDTO userDTO) throws EmailExceptionNotFound {
        final UserDTO userFromDB = userDTOMapper.toDTO (userRepository.findUserByUserName (userDTO.getUserName ()));

        if (userFromDB != null) {
            return false;
        }

        final UserDTO userFromEmail = userDTOMapper.toDTO( userRepository.findUserByEmail (userDTO.getEmail ()));
        if (userFromEmail != null) {
             throw new EmailExceptionNotFound ("Not found email", userDTO.getEmail ());
        }

        final User user = userDTOMapper.toModel (userDTO);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword())); //password encryption users
        userRepository.save (user);
        return true;
    }




}
