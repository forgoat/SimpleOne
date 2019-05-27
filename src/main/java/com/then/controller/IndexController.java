package com.then.controller;

import com.then.entity.Course;
import com.then.entity.Student;
import com.then.entity.User;
import com.then.pojo.StudentScore;
import com.then.service.CourseService;
import com.then.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserService userService;
    @Autowired
    private CourseService courseService;

    @PostMapping(value = "login")
    public String login(Model model, @RequestParam("username")String username, @RequestParam("password")String password){
        User user=userService.login(username,password);
        if (user!=null){
            model.addAttribute("user",user);
            if (user.getRole().equals("学生")){
                Student student=userService.findStudent(username);
                List<StudentScore> studentScores=courseService.findStudentScore(username);
                model.addAttribute("student",student);
                model.addAttribute("scores",studentScores);
                return "user";
            }
            else if (user.getRole().equals("管理员")){
                model.addAttribute("username",user.getUserName());
                List<Student> students=userService.findAll();
                model.addAttribute("students",students);
                return "manager";

            }
            else {
                return "/";
            }
        }
        else {
            return "/";
        }
    }

    @PostMapping(value = "deleteStudent")
    public String deleteStudent(Model model, @RequestParam("sno")String sno, @RequestParam("username")String username){
        userService.deleteStudent(sno);
        List<Student> students=userService.findAll();
        User user=userService.findByUsername(username);
        model.addAttribute("students",students);
        model.addAttribute("user",user);
        model.addAttribute("username",username);
        return "manager";
    }
    @PostMapping(value = "saveStudent")
    public String saveAlumni(Model model,Student student,@RequestParam("username")String username){
        userService.saveStudent(student);
        User user=userService.findByUsername(username);
        List<Student> students=userService.findAll();
        model.addAttribute("students",students);
        model.addAttribute("user",user);
        model.addAttribute("username",username);
        return "manager";
    }

    @PostMapping(value = "Info")
    public String toOne(Model model,@RequestParam("username")String username,@RequestParam("sno")String sno){
        Student student=userService.findStudent(sno);
        model.addAttribute("username",username);
        model.addAttribute("student",student);
        return "studentInfo";
    }

    @PostMapping(value = "update")
    public String updateInfo(Model model, @RequestParam("username")String username, @RequestParam("sno")String sno, @RequestParam("sname")String sname, @RequestParam("ssex")String ssex, @RequestParam("sbirth")String sbirth, @RequestParam("saddress")String saddress, @RequestParam("syear")String syear, @RequestParam("sacademy")String sacademy, @RequestParam("sdepartment")String sdepartment, @RequestParam("smajor")String smajor, @RequestParam("classno")String classno){
        userService.update(sno,sname,ssex,sbirth,saddress,syear,sacademy,sdepartment,smajor,classno);
        Student student=userService.findStudent(sno);
        model.addAttribute("username",username);
        model.addAttribute("student",student);
        return "studentInfo";
    }

    @PostMapping(value = "getback")
    public String getback(Model model,@RequestParam("username")String username){
        User user=userService.findByUsername(username);
        if (user!=null){
            model.addAttribute("user",user);
            if (user.getRole().equals("学生")){
                Student student=userService.findStudent(username);
                List<StudentScore> studentScores=courseService.findStudentScore(username);
                model.addAttribute("student",student);
                model.addAttribute("scores",studentScores);
                return "user";
            }
            else if (user.getRole().equals("管理员")){
                model.addAttribute("username",user.getUserName());
                List<Student> students=userService.findAll();
                model.addAttribute("students",students);
                return "manager";

            }
            else {
                return "/";
            }
        }
        else {
            return "/";
        }
    }
    @GetMapping("/")
    public String quit(){
        return "index";
    }
}
