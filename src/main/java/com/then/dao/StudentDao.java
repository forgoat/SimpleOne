package com.then.dao;

import com.then.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentDao {
    public List<Student> findBySno(String sno);
    public List<Student> findAll();
    public int delete(String sno);
    public int save(Student student);
    public int update(@Param("sno")String sno,@Param("sname")String sname,@Param("ssex")String ssex,@Param("sbirth")String sbirth,@Param("saddress")String saddress,@Param("syear")String syear,@Param("sacademy")String sacademy,@Param("sdepartment")String sdepartment,@Param("smajor")String smajor,@Param("classno")String classno);
}
