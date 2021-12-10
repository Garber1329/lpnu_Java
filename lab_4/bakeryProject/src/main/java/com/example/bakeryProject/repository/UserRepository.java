package com.example.bakeryProject.repository;


import com.example.bakeryProject.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User,Long> {
    User findUserById(Long idUser);
    User findUserByEmail(String email);
    User findUserByLastName(String lastName);
    User findUserByPhone(String phone);
    User findUserByUserName(String username);
    List<User> getAllUsers();
    User updateUser(User user );


}
