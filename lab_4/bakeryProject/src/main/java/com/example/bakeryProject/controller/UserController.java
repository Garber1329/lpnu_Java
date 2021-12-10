package com.example.bakeryProject.controller;

import com.example.bakeryProject.dto.OrderDTO;
import com.example.bakeryProject.dto.UserDTO;
import com.example.bakeryProject.model.User;
import com.example.bakeryProject.service.imp.OrderServiceImp;
import com.example.bakeryProject.service.imp.UserServiceImp;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.security.Principal;
import java.util.List;
@Log4j
@Controller
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    @Autowired
     private UserServiceImp userService;
    @Autowired
    private OrderServiceImp orderService;

    @GetMapping("/user_all")
    public List<UserDTO> getAllUser() {
        return userService.getAllUsers ();
    }

    @GetMapping("/user/{id}")
    public UserDTO getUserById(@PathVariable final long id) {
        return userService.findUserById (id);
    }

    @GetMapping("/user/{username}")
    public UserDTO getUserByUserName(@PathVariable final String userName) {
        return userService.findUserDTOByUserName (userName);
    }

    @PutMapping("/users")
    public UserDTO updateUser(@RequestBody @Validated final UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity deleteUserById(@PathVariable final long id) {
        userService.deleteUser (id);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = {"/addOrder"})
    public ModelAndView addOrder(final Principal principal){
        log.info("Registration controller get");
        final UserDTO useDTO = userService.findUserDTOByUserName (principal.getName ());
        final ModelAndView modelAndView = new ModelAndView();
        try {
            modelAndView.addObject("orderModel", new OrderDTO ());
            modelAndView.setViewName("addOrder");
        }catch (final Exception exception){
            log.info("Exception  add Order user get");
        }
        return modelAndView;


    }
    @PostMapping("/addOrder")
    public String addOrderPost(@ModelAttribute("orderModel") @Valid final OrderDTO orderDTO,
                               final BindingResult result, final ModelMap model){
        log.info("add order");
        if (result.hasErrors()) {
            model.addAttribute("orderError", "Exception order doesn't save");
            return "/addOrder";
        }

        if (!orderService.addOrder (orderDTO)){
            model.addAttribute("orderError", "Such a order already exists");
            return "/addOrder";
        }
        return "redirect:/index";
    }

}
