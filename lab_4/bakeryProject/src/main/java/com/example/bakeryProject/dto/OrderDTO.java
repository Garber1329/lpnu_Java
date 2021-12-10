package com.example.bakeryProject.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO
{
    private Long id;
    @NotBlank
    @Max(25)
    @Size(min = 3, message = "Мінімум 3 символи")
    private String title;
    List<CommodityDTO> commodities = new ArrayList<> ();


}
