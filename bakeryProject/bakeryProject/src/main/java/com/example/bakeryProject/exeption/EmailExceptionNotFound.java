package com.example.bakeryProject.exeption;

import com.example.bakeryProject.model.User;

public class EmailExceptionNotFound extends RuntimeException {
    private User user;

    public EmailExceptionNotFound(final String message, final String email ) {
        super(message);
        user.setEmail (email);
    }


}
