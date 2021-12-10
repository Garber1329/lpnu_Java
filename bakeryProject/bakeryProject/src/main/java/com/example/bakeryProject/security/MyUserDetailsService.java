package com.example.bakeryProject.security;

import com.example.bakeryProject.repository.UserRepository;
import com.example.bakeryProject.model.User;
import lombok.extern.log4j.Log4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@Log4j
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        final User user = userRepository.findUserByUserName (username);
        if (user == null) {
            throw new UsernameNotFoundException ("User not found");
        }
        log.info("loadUserByUsername() : { "+ user.getUsername ()+ " }");
        return new MyUserDetails(user);
    }
}
