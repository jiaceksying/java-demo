package com.example.demo.service;

import com.example.demo.model.entity.User;

import java.util.List;

/**
 * @author ksying
 * @date 2022/4/23 23:07
 */
public interface UserService {
    List<User> list();
    Integer add(User user);
    Integer update(User user);
    Integer delete(Integer id);
}
