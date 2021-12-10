package com.example.bakeryProject.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Transient;

import javax.validation.constraints.*;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Long id;

    @NotBlank
    @Max(25)
    @Size(min = 3, message = "Мінімум 3 символи")
    private String firstName;

    @NotBlank
    @Max(25)
    @Size(min = 3, message = "Мінімум 3 символи")
    private String lastName;

    @NotBlank
    @Max(25)
    @Size(min = 3, message = "Мінімум 3 символи")
    private String userName;

    @NotBlank
    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$")
    @Max(13)
    @Size(min = 10, message = "Мінімум 10 символи")
    private String phone;

    @NotBlank
    @Max(25)
    @Size(min = 3, message = "Мінімум 3 символи")
    private String password;

    @Transient
    private String passwordConfirm;
    @Email
    @NotBlank
    private String email;

    @NotBlank
    @Max(25)
    private String role;

    private List<OrderDTO> orderDTOs;




}
