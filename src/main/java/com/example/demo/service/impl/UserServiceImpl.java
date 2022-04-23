package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.model.entity.User;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ksying
 * @date 2022/4/23 23:07
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    public Integer add(User user) {
        return userMapper.add(user);
    }

    @Override
    public Integer update(User user) {
        return userMapper.update(user);
    }

    @Override
    public Integer delete(Integer id) {
        return userMapper.delete(id);
    }
}
