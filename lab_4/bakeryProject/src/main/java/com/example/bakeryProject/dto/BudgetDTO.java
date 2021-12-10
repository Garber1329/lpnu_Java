package com.example.bakeryProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class BudgetDTO {
    private Long id;
    @NotNull
    private Double money;
}
