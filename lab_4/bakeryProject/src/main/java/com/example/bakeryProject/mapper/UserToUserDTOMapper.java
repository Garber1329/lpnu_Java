package com.example.bakeryProject.mapper;

import com.example.bakeryProject.dto.OrderDTO;
import com.example.bakeryProject.model.Order;
import com.example.bakeryProject.model.User;
import com.example.bakeryProject.dto.UserDTO;
import org.springframework.stereotype.Component;

import javax.el.ArrayELResolver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class UserToUserDTOMapper {

    public User toModel(final UserDTO userDTO){
        final User user = new User();

        user.setId(userDTO.getId());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUsername (userDTO.getUserName());
        user.setRole (user.getRole ());
        user.setPassword (user.getPassword ());

        final List<Order> orders = new ArrayList<> ();
        user.setOrders (orders);

        return user;
    }

    public UserDTO toDTO(final User user){
        final UserDTO userDTO = new UserDTO();

        userDTO.setId(user.getId());
        userDTO.setEmail(user.getEmail());
        userDTO.setLastName(user.getLastName());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setUserName(user.getUsername ());
        userDTO.setPhone(user.getPhone());
        userDTO.setRole (user.getRole ());
        userDTO.setPassword (user.getPassword ());

        final List<OrderDTO> orderDTOSs= new ArrayList<> ();
        userDTO.setOrderDTOs (orderDTOSs);

        return userDTO;
    }
}
