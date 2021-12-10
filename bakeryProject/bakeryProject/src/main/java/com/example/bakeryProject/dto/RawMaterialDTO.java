package com.example.bakeryProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RawMaterialDTO {
    private Long id;
    @NotBlank
    @Max(25)
    @Size(min = 3, message = "Мінімум 3 символи")
    private String nameRawMaterial;
    @NotBlank
    @Max(25)
    @Size(min = 3, message = "Мінімум 3 символи")
    private Double price;

    @NotBlank
    @Max(25)
    @Size(min = 3, message = "Мінімум 3 символи")
    private Integer countRaMaterial;
}
