package com.then.dao;

import com.then.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserDao {
    public List<User> findByUserName(String username);
}
