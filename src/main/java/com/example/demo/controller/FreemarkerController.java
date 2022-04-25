package com.example.demo.controller;

import com.example.demo.model.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ksying
 * @date 2022/4/25 19:47
 */
@Controller
public class FreemarkerController {
    @GetMapping("/index")
    public String index(Model model) {
        List<User> list = getUsers();
        model.addAttribute("users", list);
        return "index";
    }

    private List<User> getUsers() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setName("晓梅");
        user.setAge(18);
        user.setEmail("abc@qq.com");
        list.add(user);
        User user1 = new User();
        user1.setName("晓梅");
        user1.setAge(18);
        user1.setEmail("abc@qq.com");
        list.add(user1);
        return list;
    }
}
