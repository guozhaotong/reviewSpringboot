package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author 郭朝彤
 * @date 2017/11/9.
 */
public interface CourseRepository extends JpaRepository<Course, Long> {
    Course findByCourseName(String name);

//    @Query("SELECT s FROM Student s JOIN s.course c WHERE c.courseName=?1")
//    List<Student> findByCouName(@Param("name") String name);
}
