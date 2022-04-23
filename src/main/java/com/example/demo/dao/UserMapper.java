package com.example.demo.dao;

import com.example.demo.model.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ksying
 * @date 2022/4/23 23:08
 */
@Mapper
@Repository
public interface UserMapper {
    @Select(value = "SELECT * FROM user")
    List<User> list();

    @Insert(value = "INSERT INTO user (NAME,PASSWORD) VALUES ('${user.name}','${user.password}')")
    Integer add(@Param(value = "user") User user);

    @Update(value = "UPDATE user SET NAME='${user.name}', PASSWORD='${user.password}' WHERE ID=${user.id}")
    Integer update(@Param(value = "user") User user);

    @Delete(value = "DELETE FROM user WHERE ID = #{id}")
    Integer delete(@Param(value = "id")Integer id);
}
