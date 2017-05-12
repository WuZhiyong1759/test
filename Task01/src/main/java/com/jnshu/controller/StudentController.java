package com.jnshu.controller;
import com.jnshu.model.Student;
import com.jnshu.model.User;
import com.jnshu.service.StudentService;
import com.jnshu.service.UserService;
import com.jnshu.util.DesUtil;
import com.jnshu.util.MD5Util;
import com.jnshu.util.TypeUtil;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 2017/4/15.
 */
@Controller
public class StudentController {
    Logger log=Logger.getLogger(StudentController.class);
    @Resource
    private StudentService studentService;
    @Resource
    UserService userService;

    @RequestMapping("/regist")
    public String regist(Model model,User user){
        log.info("regist方法被调用！");
//        Student student=new Student();
//        model.addAttribute("student",student);
        return "adminregist";
    }
    @RequestMapping(value="/register",method = RequestMethod.POST)
    public String register(
            @RequestParam String UserName ,
            @RequestParam String pwd,
            Model model){
        String md= MD5Util.stringToMD5(pwd);
        User user=new User();
        user.setUserName(UserName);
        user.setPwd(md);
        log.info("register方法被调用==参数user："+user);
//        long timeNow=System.currentTimeMillis();
        userService.insert(user);
//        user.setCreate_at(timeNow);
//        studentService.addStudent(user);
        return "redirect:/home";
    }
    @RequestMapping("/login")
    public String login(){
        return "adminlogin";
    }

    @RequestMapping("/loginer")
    public String login(
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam String UserName,
            @RequestParam String pwd
                        ){
        log.info("login方法被调用！name="+UserName+",password="+pwd);
        String md= MD5Util.stringToMD5(pwd);
        User user=new User();
        user.setUserName(UserName);
        user.setPwd(md);
        int id=userService.select(user).getId();
        log.info("===1");
        if(userService.select(user)!=null){
            String source=id+"="+System.currentTimeMillis();
//            String token=new String(DesUtil.encrypt(source,"12345678"));
            String token= TypeUtil.bytesToHexString(DesUtil.encrypt(source,"12345678"));
            Cookie name3=new Cookie("token",token);
            name3.setMaxAge(60*60*24);
            log.info("===2");
            response.addCookie(name3);

            return "redirect:/home";
        }else {
            return "login";
        }
    }
    @RequestMapping("/add")
    public String add(Model model){
        log.info("add方法被调用");
        model.addAttribute("student",new Student());
        return "addstudent";
    }
    @RequestMapping(value = "addstudent")
    public String addStudent(@ModelAttribute Student student,Model model){
        log.info("addstudent方法被调用 student："+student);
        long timeNow=System.currentTimeMillis();
        student.setCreate_at(timeNow);
        studentService.addStudent(student);
        return "redirect:/showList";
    }
    @RequestMapping("/showList")
    public String showList(Model model){
        log.info("showList方法被调用");
        List<Student> studentList= new ArrayList<Student>();
        studentList=studentService.getAllStudent();
        model.addAttribute("studentList",studentList);
        return "showlist";
    }
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id){
        log.info("delete方法被调用 id="+id);
        studentService.deleteStudent(id);
        return "redirect:/showList";
    }
    @RequestMapping(value = "/update/{id}",method = RequestMethod.GET)
    public String update(@PathVariable int id,Model model){
        log.info("update方法被调用 id="+id);
        Student student=studentService.getStudentById(id);
        model.addAttribute("student",student);
        return "update";
    }@RequestMapping(value = "/updateNow",method = RequestMethod.POST)
    public String updateNow(@ModelAttribute Student student){
        log.info("updateNow方法被调用。student："+student);
        long timeNow=System.currentTimeMillis();
        student.setUpdate_at(timeNow);
        studentService.updateStudent(student);
        return "redirect:/showList";
    }
    @RequestMapping("/getBId")
    public String getbyid( int id,Model model){
        log.info("getbyid方法被调用==ID为："+id);
        Student student=studentService.getStudentById(id);
        log.info(student);
        model.addAttribute("student",student);
        return "student";
    }
    @RequestMapping("/home")
    public String home(Model model){
        log.info("home方法被调用");
        long count=studentService.getStudentCount();
        log.info("学生列表的count值为："+count);
        model.addAttribute("count",count);
        List<Student> studentList=new ArrayList<Student>();
        studentList=studentService.getStudentByFin(1);
        log.info("获取的优秀学生为stuList:"+studentList);
        model.addAttribute("studentList",studentList);
        return "home";
    }
}
