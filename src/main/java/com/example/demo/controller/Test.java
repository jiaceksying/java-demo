package com.example.demo.controller;

import com.example.demo.model.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ksying
 * @date 2022/4/25 21:53
 */
public class Test {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        User u1 = new User();
        u1.setName("晓梅");
        u1.setAge(18);
        u1.setEmail("a@1.com");
        users.add(u1);
        User u2 = new User();
        u2.setName("great");
        u2.setAge(18);
        u2.setEmail("a@1.com");
        users.add(u2);
        System.out.println(users);
        users.forEach(user -> {
            System.out.println(user.getName());
            System.out.println(user.getAge());
            System.out.println(user.getEmail());
        });
//        users.get(0);       item?index item?has_next
        users.get(1);

    }

//    [
//            {"name": "晓梅", "age":18, "email": "a@1.com"},
//            {"name": "晓梅", "age":18, "email": "a@1.com"},
//    ]









}
