package com.jnshu.dao;

import com.jnshu.model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tom on 2017/4/14.
 * 封装student表crud方法的接口dao层
 */

@Repository
public interface StudentDao {
    /**
     * 添加Student的抽象方法
     * @param student 传入的待添加的student类
     @Component */
    void addStudent(Student student);

    /**
     * 删除Studnet的抽象方法
     * @param id 传入需要删除的Student的ID
     */
    void deleteStudent(@Param("id") int id);

    /**
     * 更新Student的抽象方法
     * @param student 传入需要更新的Student信息
     */
    void updateStudent(Student student);

    /**
     * 通过id值查找Student的抽象方法
     * @param id 输入传入的ID值
     * @return 返回一个Student类型的对象
     */
    Student getStudentById(@Param("id") int id);

    /**
     * 获取学生列表的抽象方法
     * @return 返回一个List Student列表
     */
    List<Student> getAllStudent();

    /**
     * 通过name名字和password密码 查询Student列表
     * @param name 传入的Student name名字
     * @param password 传入的Student password密码
     * @return 返回Student类型的列表
     */
    Student getByNameAndPwd(@Param("name") String name,@Param("password") String password);

    /**
     * 获取学生的总数
     * @return
     */
    long getStudentCount();

    /**
     * 获取优秀的学生
     * @param fin
     * @return
     */
    List<Student> getStudentByFin(@Param("fin") int fin);

    /**
     *
     * 获取Student列表ID的集合
     * @return
     */
    List<Integer> getStudentIdList();

}
