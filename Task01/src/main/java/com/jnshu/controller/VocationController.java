package com.jnshu.controller;

import com.jnshu.model.Student;
import com.jnshu.model.Vocation_msg;
import com.jnshu.service.StudentService;
import com.jnshu.service.VocationService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tom on 2017/4/26.
 */
@Controller
public class VocationController {
    Logger log =Logger.getLogger(VocationController.class);

    @Resource
    VocationService vocationService;
    @Autowired
    StudentService studentService;

    @RequestMapping("/u/getvocation")
    public String getVocation(@RequestParam("id") int id,
                              Model model,
                              HttpServletRequest request,
                              HttpServletResponse response){
        log.info("getVocation 方法被调用");

        List<Vocation_msg> listVocation=new ArrayList<Vocation_msg>();
        Vocation_msg vocation_msg=new Vocation_msg();
        String msg="传入的参数有误";
//        String name="";
//        String pwd="";
//        Cookie[] cookies=request.getCookies();
//        for (Cookie cookie:cookies){
//            log.info(" "+cookie.getValue());
//            if(cookie.getName().equals("name")){
//                name=cookie.getValue();
//                log.info("name="+name);
//            }
//            if(cookie.getName().equals("password")){
//                pwd=cookie.getValue();
//                log.info("pwd="+pwd);
//            }
//        }
//        List<Student> stulist=studentService.getByNameAndPwd(name,pwd);
//        if(!(stulist.size()>0)){
//            log.info("cookie的内容不对"+studentService.getByNameAndPwd(name,pwd));
//            return "redirect:/login";
//            try {
//                response.sendRedirect("/login");
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        switch (id){
            case 0:
                listVocation= vocationService.getAllVocation();
                model.addAttribute("list",listVocation);
                log.info("取得的全部职业信息为："+listVocation);
                return "t11";
            case 1:
                vocation_msg=vocationService.getVocationById(id);
                model.addAttribute("",vocation_msg);
                return "home";
            case 2:
                vocation_msg=vocationService.getVocationById(id);
                model.addAttribute("",vocation_msg);
                return "home";


        }
//        model.addAttribute("",msg);
        return "home";
    }
    @RequestMapping("/test")
    public String testcookie(HttpServletRequest request, HttpServletResponse response){
        log.info("testcookie方法被调用");
//        Cookie[] cookies=request.getCookies();
//        for (Cookie cookie:cookies) {
//            log.info("cookie的内容为："+cookie);
//        }
        return "test";
    }
    @RequestMapping("/main")
    public String main(HttpServletRequest request,HttpServletResponse response){
        return "main";
    }
    @RequestMapping("cookie")
    public String cookie(HttpServletRequest request,HttpServletResponse response){
        return "cookie";
    }
}