package com.then.dao;

import com.then.entity.Grade;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GradeDao {
    public List<Grade> findBySno(String sno);
}
