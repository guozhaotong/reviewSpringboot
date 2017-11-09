package com.example.demo.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * @author 郭朝彤
 * @date 2017/11/9.
 */
@Entity
@Table(name = "student")
public class Student {
    private String pid;
    private String studentName;
    private Set<Course> course;    //选修课程

    public Student() {

    }

    public Student(String pid, String studentName, Set<Course> course) {
        this.pid = pid;
        this.studentName = studentName;
        this.course = course;
    }

    @Id
    @Column(name = "pid", unique = true, nullable = false, length = 32)
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "uuid")
    public String getPid() {
        return pid;
    }

    @Column(name = "student_name", unique = true, length = 64)
    public String getStudentName() {
        return studentName;
    }

    /**
     * Hibernate 会自动创建一张关系表stu_cou， 里边有俩字段stu_id和cou_idfen分别为两表主键
     *
     * @return
     */
    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH}, fetch = FetchType.EAGER)
    @JoinTable(name = "stu_cou", joinColumns = {@JoinColumn(name = "stu_id")}, inverseJoinColumns = {@JoinColumn(name = "cou_id")})
    public Set<Course> getCourse() {
        return course;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCourse(Set<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "pid='" + pid + '\'' +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
