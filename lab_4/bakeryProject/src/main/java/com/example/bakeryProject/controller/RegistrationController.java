package com.example.bakeryProject.controller;

import com.example.bakeryProject.dto.UserDTO;
import com.example.bakeryProject.service.imp.UserServiceImp;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
@Controller
@AllArgsConstructor
@RequestMapping("/")
@Log4j
public class RegistrationController {
    @Autowired
    private UserServiceImp userService;
    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping(value = {"/registration"})
    public ModelAndView registration(){
        log.info("Registration controller get");
        final ModelAndView modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("userModel", new UserDTO ());
            modelAndView.setViewName("registration");
        }catch (final Exception exception){
            log.info("Exception  registation user get");
        }
        return modelAndView;


    }
    @PostMapping("/registration")
    public String registration(@ModelAttribute("userModel") @Valid final UserDTO userModel,
                               final BindingResult result, final ModelMap model){
        log.info("Registration controller post");
        if (result.hasErrors()) {
            model.addAttribute("emailError", "Email address is wrong");
            return "registration";
        }
        if (!userModel.getPassword().equals(userModel.getPasswordConfirm())){
            model.addAttribute("passwordError", "Passwords do not match");
            return "registrationCoach";
        }
        if (!userService.saveUser (userModel)){
            model.addAttribute("usernameError", "Such a user already exists");
            return "registration";
        }
        return "redirect:/";
    }
}
