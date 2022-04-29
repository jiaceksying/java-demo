package com.example.demo.model.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * @author ksying
 * @date 2022/4/23 23:34
 */
@Setter
@Getter
public class User {
    private int id;
    private String name;
    private String password;
    private int age;
    private String email;
    private List<String> hobbies;

    public String doSomethine() {
        return "aaabbb";
    }
}
