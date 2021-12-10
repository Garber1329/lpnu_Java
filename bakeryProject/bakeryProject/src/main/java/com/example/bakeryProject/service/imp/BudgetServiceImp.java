package com.example.bakeryProject.service.imp;

import com.example.bakeryProject.dto.BudgetDTO;
import com.example.bakeryProject.mapper.BudgetToBudgetDTOMapper;
import com.example.bakeryProject.model.Budget;
import com.example.bakeryProject.repository.BudgetRepository;
import com.example.bakeryProject.service.BudgetService;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Log4j
@Service
public class BudgetServiceImp implements BudgetService {
    @Autowired
    private BudgetRepository budgetRepository;

    @Autowired
    private BudgetToBudgetDTOMapper budgetDTOMapper;


    @Override
    public List<BudgetDTO> getAllBudgets() {
        return budgetRepository.getAllBudgets ()
                .stream().map (b->budgetDTOMapper.toDTO (b)).collect(Collectors.toList());
    }

    @Override
    public boolean deleteBudgetById(final Long budgetId) {
        if (budgetRepository.findById(budgetId).isPresent()) {
            budgetRepository.deleteById (budgetId);
            return true;
        }
        return false;
    }

    @Override
    public void addBudget(final BudgetDTO budgetDTO) {
        final Budget  budget = budgetDTOMapper.toEntity (budgetDTO);

        budgetRepository.save (budget);

    }

    @Override
    public BudgetDTO findBudgetById(final Long id) {
        return budgetDTOMapper.toDTO (budgetRepository.findBudgetsById (id));
    }
    @Override
    public void  addMoneyToBudget(final Long id, final Double money){
        final BudgetDTO budgetDTO = findBudgetById (id);
        budgetDTO.setMoney (budgetDTO.getMoney ()+money);
        final Budget  budget = budgetDTOMapper.toEntity (budgetDTO);
        budgetRepository.save (budget);
    }
}
