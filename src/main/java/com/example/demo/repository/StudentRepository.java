package com.example.demo.repository;

import com.example.demo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 郭朝彤
 * @date 2017/11/9.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByStudentName(String name);
}
