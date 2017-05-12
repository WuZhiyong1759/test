package com.jnshu.impl;

import com.jnshu.dao.StudentDao;
import com.jnshu.model.Student;
import com.jnshu.service.StudentService;
import com.jnshu.util.MemcachedUtils;
import com.jnshu.util.Redis;
import com.jnshu.util.RedisService;
import com.jnshu.util.SerializeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Tom on 2017/4/14.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class StudentServiceImpl implements StudentService{
    @Resource
    @Autowired
    private StudentDao studentDao;
    @Resource
    @Autowired
    MemcachedUtils memcachedUtils;
//    @Autowired
    SerializeUtil serializeUtil;
    @Autowired
    Redis redis;
//

        @Autowired
        RedisService redisService;


//    Jedis jedis=redis.getJedis();
    public void addStudent(Student student) {

        studentDao.addStudent(student);
    }
    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
//        if(memcachedUtils.get("student_"+id)!=null){
//            memcachedUtils.delete("student_"+id);
//        }

        if(redisService!=null&&redisService.exists("student_"+id)){
            redisService.del(("student_"+id).getBytes());
        }
    }
    public void updateStudent(Student student) {
//        studentDao.updateStudent(student);
//        memcachedUtils.set("student_"+student.getId(),student);
        studentDao.updateStudent(student);
        if(redisService!=null&&redisService.exists("student_"+student.getId())){
            redisService.set(("student_"+student.getId()).getBytes(),serializeUtil.serialize(student));
        }
    }

    public Student getStudentById(int id) {
        Student student = new Student();
//        if(memcachedUtils.get("student_"+id)!=null){
//            student= (Student) this.memcachedUtils.get("student_"+id);
//            System.out.println("本次操作是在缓存中获取");
//        }else {
//            student=studentDao.getStudentById(id);
//            this.memcachedUtils.add("student_"+id,student);
//            System.out.println("本次操作是在数据库中获取");
//        }



            if (redisService.getJedis() != null && redisService.exists(("student_" + id))) {
                student = (Student) serializeUtil.unserizlize(redisService.get(("student_" + id).getBytes()));
            } else {
            student = studentDao.getStudentById(id);
                if (redisService.getJedis() != null) {
                    redisService.set(("student_" + id).getBytes(), serializeUtil.serialize(student));
                }
            }

        return student;
//     return studentDao.getStudentById(id);
    }
    public List<Student> getAllStudent() {
        //获取学生列表的ID的集合
        List<Integer> intList=studentDao.getStudentIdList();
        List<Student> studentList=new ArrayList<Student>();
        Student student;
        //遍历id集合
        for (Integer id:intList){
            Jedis jedis=redisService.getJedis();
            if (jedis!=null){
                if (jedis.exists(SerializeUtil.serialize("student_"+id))) {
                    student = (Student) SerializeUtil.unserizlize(jedis.get(SerializeUtil.serialize("student_" + id)));
                    studentList.add(student);
                }else {
                    student=studentDao.getStudentById(id);
                    jedis.set(SerializeUtil.serialize("student_"+id),SerializeUtil.serialize(student));
                    studentList.add(student);
                    System.out.println("jedis!=null,bud 但是里边没有值，从数据库获取并添加到缓存");
                }
                jedis.close();
            System.out.println("=======缓存中");
            }else {
                student=studentDao.getStudentById(id);
                studentList.add(student);
                System.out.println("========数据库中获取");
            }


//            System.out.println(redis);
//            if (redis.getJedis()!=null&&redis.getJedis().exists(SerializeUtil.serialize("student_"+id))!=null){
//                student=(Student)SerializeUtil.unserizlize(redis.getJedis().get(SerializeUtil.serialize("student_"+id)));
//                studentList.add(student);
//                System.out.println("========从缓存中获取"+student);
//            }else {
//                student=studentDao.getStudentById(id);
//                if (redis.getJedis()!=null){
//                    redis.getJedis().set(SerializeUtil.serialize("student_"+id),SerializeUtil.serialize(student));
//                    studentList.add(student);
//                    System.out.println("=========从数据库中获取"+student);
//                }
//            }




//            System.out.println(redisService.getJedis());
//            if (redisService.getJedis()!=null&&redisService.getJedis().exists(("student_"+id))){
//                student=(Student)serializeUtil.unserizlize(redisService.getJedis().get(("student_"+id).getBytes()));
//                studentList.add(student);
//                System.out.println("从缓存中获取Student：ID="+id);
//                redisService.getJedis().close();
//            }else {
//                student=studentDao.getStudentById(id);
//                if (redisService.getJedis()!=null){
//                    redisService.getJedis().set(("student_"+id).getBytes(),serializeUtil.serialize(student));
//                    redisService.getJedis().close();
//                }
//                System.out.println("从数据库中获取Student：ID="+id);
//                studentList.add(student);
//
//            }


            //            if(memcachedUtils.get("student_"+id)!=null){          //如果缓存中存在
//                student= (Student) memcachedUtils.get("student_"+id);   //从缓存中获取student
//                System.out.println("从缓存中获取Student：ID="+id);
//                studentList.add(student);   //将获取的student存入studentList中
//            }else {                                               //如果缓存中不存在
//                student=studentDao.getStudentById(id);            //从数据库中获取Student
//                System.out.println("从数据库中获取Student：ID="+id);
//                memcachedUtils.add("student_"+id,student);        //将数据库中获取的student存入缓存中
//                studentList.add(student);                         //并将student添加到studentList中
//            }
        }

        return studentList;                 //返回studentList
//        return studentDao.getAllStudent();
    }

    public Student getByNameAndPwd(String name, String pwd) {
        return studentDao.getByNameAndPwd(name,pwd);
    }

    public long getStudentCount(){return studentDao.getStudentCount();}

    @Override
    public List<Student> getStudentByFin(int fin) {
        return studentDao.getStudentByFin(fin);
    }


}
