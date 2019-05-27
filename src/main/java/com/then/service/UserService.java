package com.then.service;

import com.then.dao.UserDao;
import com.then.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    public User login(String username,String password){
        List<User> users=userDao.findByUserName(username);
        User user=users.get(0);
        if (user.getPassword().equals(password)){
            return user;
        }
        else {
            return null;
        }
    }
}
