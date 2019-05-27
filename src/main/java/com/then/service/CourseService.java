package com.then.service;

import com.then.dao.CourseDao;
import com.then.dao.GradeDao;
import com.then.entity.Course;
import com.then.entity.Grade;
import com.then.entity.Student;
import com.then.pojo.StudentScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    private CourseDao courseDao;
    @Autowired
    private GradeDao gradeDao;

    public List<Course> findAllCourse(){
        return courseDao.findAll();
    }

    public List<StudentScore> findStudentScore(String sno){
        List<Grade> gradeList=gradeDao.findBySno(sno);
        List<StudentScore> studentScores=new ArrayList<StudentScore>();
        for (Grade grade:gradeList){
            List<Course> courses=courseDao.findByCno(grade.getCno());
            String cname=courses.get(0).getCname();
            StudentScore studentScore=new StudentScore(grade);
            studentScore.setCname(cname);
            studentScores.add(studentScore);
        }
        return studentScores;
    }

}
