package com.then.service;

import com.then.dao.CourseDao;
import com.then.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseDao courseDao;

    public List<Course> findAllCourse(){
        return courseDao.findAll();
    }
}
