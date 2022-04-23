package com.example.demo.controller;

import com.example.demo.model.entity.User;
import com.example.demo.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author ksying
 * @date 2022/4/23 23:03
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/list")
    public List<User> getUserList(){
        return userService.list();
    }

    @PostMapping("/add")
    public boolean addUser(@RequestBody User user){
        Integer addCount = userService.add(user);
        return addCount > 0;
    }

    @PutMapping("/update")
    public boolean updateUser(@RequestBody User user){
        Integer addCount = userService.update(user);
        return addCount > 0;
    }

    @DeleteMapping("/delete/{id}")
    public boolean delUser(@PathVariable Integer id){
        Integer addCount = userService.delete(id);
        return addCount > 0;
    }

}
