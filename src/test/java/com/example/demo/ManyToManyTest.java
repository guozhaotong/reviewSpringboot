package com.example.demo;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repository.CourseRepository;
import com.example.demo.repository.StudentRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 郭朝彤
 * @date 2017/11/9.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyTest {
    @Autowired
    CourseRepository courseRepository;

    @Autowired
    StudentRepository studentRepository;

    @Before
    public void testData(){

        //Course
        Course course1 = new Course();
        course1.setCourseName("course1");
        Course course2 = new Course();
        course2.setCourseName("course2");
        Course course3 = new Course();
        course3.setCourseName("course3");

        courseRepository.save(course1);
        courseRepository.save(course2);
        courseRepository.save(course3);

        //Student
        Student student1 = new Student();
        student1.setStudentName("Student1");
        Student student2 = new Student();
        student2.setStudentName("Student2");
        Student student3 = new Student();
        student3.setStudentName("Student3");

        // 学生1 选修课程12
        Set<Course> courses = null;
        courses = new HashSet<>();
        courses.add(course1);
        courses.add(course2);
        student1.setCourse(courses);
        studentRepository.save(student1);

        // 学生2 选修课程23
        courses = new HashSet<>();
        courses.add(course2);
        courses.add(course3);
        student2.setCourse(courses);
        studentRepository.save(student2);

    }

    @Test
    public void test() throws Exception {

        //取学生
        Student student1 = studentRepository.findByStudentName("Student1");
        System.out.print("student1.getStudentName()" + student1.getStudentName());

        //取课程
        Course course2 = courseRepository.findByCourseName("course2");
        System.out.print("course2.getCourseName()" + course2.getCourseName());
    }
}
