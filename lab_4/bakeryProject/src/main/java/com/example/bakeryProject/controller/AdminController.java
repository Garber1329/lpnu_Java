package com.example.bakeryProject.controller;

import com.example.bakeryProject.dto.BudgetDTO;
import com.example.bakeryProject.dto.RawMaterialDTO;
import com.example.bakeryProject.dto.UserDTO;
import com.example.bakeryProject.model.Budget;
import com.example.bakeryProject.model.User;
import com.example.bakeryProject.service.RawMaterialService;
import com.example.bakeryProject.service.imp.BudgetServiceImp;
import com.example.bakeryProject.service.imp.RawMaterialServiceImp;
import com.example.bakeryProject.service.imp.UserServiceImp;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;

@Controller
@Log4j
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private UserServiceImp userService;
    @Autowired
    private RawMaterialServiceImp rawMaterialService;
    @Autowired
    private BudgetServiceImp budgetService;

    @GetMapping("/admin")
    public String indexAx(){
        return "indexAdmin";
    }


    @GetMapping("/addMaterial")
    public String addMaterial(final Model model){
        log.info("Add material method get");
        model.addAttribute("addCategory", new RawMaterialDTO ());

        return "indexAdmin";
    }


    @PostMapping("/addMaterial")
    public String addMaterials(@ModelAttribute("addMaterial") @Valid final RawMaterialDTO rawMaterialDTO, final Principal principal, final Model model) {
        log.info("Add material method post");
        final UserDTO useDTO = userService.findUserDTOByUserName (principal.getName ());

        if (!rawMaterialService.addRawMaterials (rawMaterialDTO) ){
            model.addAttribute("rawMaterialError", "Даний продукт уже існує");
            return "indexAdmin";
        }

        return "redirect:/admin/indexAdmin";
    }
    @GetMapping("/searchUsers")
    public List<BudgetDTO> searchUserGet(final Model model) {

        log.info ("Search list budget get");
        final List<BudgetDTO> budgetDTOS = budgetService.getAllBudgets ();
        model.addAttribute ("userList", budgetDTOS);
        return budgetDTOS;

    }

    @PostMapping("/addMoney")
    public String addMoneyPost(@RequestParam final Long id, @RequestParam final Double money){
        log.info("Add money post");
        budgetService.addMoneyToBudget (id,money);
        return "indexAdmin";
    }




}
