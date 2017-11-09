package com.example.demo.controller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * @author 郭朝彤
 * @date 2017/11/9.
 */
@RestController
public class StudentClassController {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    StudentRepository studentRepository;

    @RequestMapping("/stucou")
    public Set<Student> test() throws Exception {

        //取学生
//        Student student1 = studentRepository.findByStudentName("Student1");
//        System.out.print("student1.getStudentName()" + student1.getStudentName());

        //取课程
//        Course course2 = courseRepository.findByCourseName("course2");
//        System.out.print("course2.getCourseName()" + course2.getCourseName());

        Course course = courseRepository.findByCourseName("course2");
        Set<Student> student = course.getStudent();
        System.err.println(student);
        return student;
    }
}
