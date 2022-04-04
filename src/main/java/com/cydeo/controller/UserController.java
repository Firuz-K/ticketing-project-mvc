package com.cydeo.controller;

import com.cydeo.bootstrap.DataGenerator;
import com.cydeo.dto.RoleDTO;
import com.cydeo.dto.UserDTO;
import com.cydeo.service.RoleService;
import com.cydeo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    RoleService roleService;
    UserService userService;

    public UserController(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @GetMapping("/create")
    public String createUser(Model model, RoleDTO roleDTO){

        model.addAttribute("user", new UserDTO());
        model.addAttribute("roles",roleService.findAll() );
        model.addAttribute("users",userService.findAll());

        return "user/create";
    }

    @PostMapping("/create")
    public String insertUser(@ModelAttribute("user") UserDTO userDTO, Model model){


        userService.save(userDTO);

        return "redirect:/user/create";
    }


    @GetMapping("/update/{username}")
    public String editUser(@PathVariable("username") String username, Model model){

        model.addAttribute("user",userService.findById(username));
        model.addAttribute("roles",roleService.findAll() );
        model.addAttribute("users",userService.findAll());

        return "user/update";
    }

    @PostMapping("/update")
    public String editUser2(UserDTO userDTO){


        userService.update(userDTO);

        return "redirect:/user/create";
    }

    @GetMapping("/delete/{username}")
    public String deleteUser1(@PathVariable("username") String username, Model model){

        userService.deleteById(username);

        return "redirect:/user/create";
    }







}
