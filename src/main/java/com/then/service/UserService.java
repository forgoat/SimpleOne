package com.then.service;

import com.then.dao.StudentDao;
import com.then.dao.UserDao;
import com.then.entity.Student;
import com.then.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;
    @Autowired
    private StudentDao studentDao;
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

    public Student findStudent(String sno){
        List<Student> students=studentDao.findBySno(sno);
        Student student=students.get(0);
        return student;
    }

    public List<Student> findAll(){
        return studentDao.findAll();
    }
    public int deleteStudent(String sno){
        return studentDao.delete(sno);
    }
    public int saveStudent(Student student){
        return studentDao.save(student);
    }

    public User findByUsername(String username){
        List<User> users=userDao.findByUserName(username);
        User user=users.get(0);
        return user;
    }
    public int update(String sno,String sname,String ssex,String sbirth,String saddress,String syear,String sacademy,String sdepartment,String smajor,String classno){
        return studentDao.update(sno,sname,ssex,sbirth,saddress,syear,sacademy,sdepartment,smajor,classno);
    }
}
