package com.then.dao;

import com.then.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CourseDao {
    public List<Course> findAll();
}
