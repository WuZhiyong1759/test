package com.jnshu.service;

import com.jnshu.model.Student;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by Tom on 2017/4/14.
 * 封装student增删改查功能的service层
 */

public interface StudentService {
    //添加Student
    void addStudent(Student student);
    //通过ID删除学生
    void deleteStudent(int id);
    //通过Studentmodel 更新学生
    void updateStudent(Student student);
    //通过i获取学生
    Student getStudentById(int id);
    //获取所有学生列表
    List<Student> getAllStudent();
    //通过名字和密码查询学生
    Student getByNameAndPwd(String name,String pwd);
    //获取学生的总数
    long getStudentCount();
    //获取优秀的Student
    List<Student> getStudentByFin(int fin);
}
