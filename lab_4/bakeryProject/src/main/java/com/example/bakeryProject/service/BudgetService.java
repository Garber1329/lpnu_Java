package com.example.bakeryProject.service;

import com.example.bakeryProject.dto.BudgetDTO;

import java.util.List;

public interface BudgetService {
    List<BudgetDTO> getAllBudgets();

    boolean deleteBudgetById(Long budgetId);

    void addBudget(BudgetDTO budgetDTO);

    BudgetDTO findBudgetById(Long id);

    void  addMoneyToBudget(Long id, Double money);
}
