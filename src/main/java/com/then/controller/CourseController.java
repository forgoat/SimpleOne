package com.then.controller;

import com.then.entity.Course;
import com.then.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping(value = "")
    public List<Course> findAll(){
        return courseService.findAllCourse();
    }
}
