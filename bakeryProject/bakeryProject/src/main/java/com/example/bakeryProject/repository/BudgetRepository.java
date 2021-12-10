package com.example.bakeryProject.repository;

import com.example.bakeryProject.model.Budget;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BudgetRepository extends CrudRepository<Budget,Long> {
    List<Budget> getAllBudgets();
    Budget findBudgetsById(Long id);

}
