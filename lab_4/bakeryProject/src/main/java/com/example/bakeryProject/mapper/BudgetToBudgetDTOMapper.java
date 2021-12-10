package com.example.bakeryProject.mapper;

import com.example.bakeryProject.dto.BudgetDTO;
import com.example.bakeryProject.model.Budget;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class BudgetToBudgetDTOMapper {
    public Budget toEntity(final BudgetDTO budgetDTO){
        final Budget budget = new Budget();

        budget.setId(budgetDTO.getId());
        budget.setMoney(budgetDTO.getMoney());
        
        return budget;
    }

    public BudgetDTO toDTO(final Budget budget){
        final BudgetDTO budgetDTO = new BudgetDTO();

        budget.setId(budgetDTO.getId());
        budget.setMoney(budgetDTO.getMoney());

        return budgetDTO;
    }
}
