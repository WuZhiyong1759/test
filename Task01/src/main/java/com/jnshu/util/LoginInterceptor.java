package com.jnshu.util;

import com.jnshu.service.StudentService;
import com.jnshu.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Tom on 2017/5/4.
 */
public class LoginInterceptor implements HandlerInterceptor {
    Logger log=Logger.getLogger(LoginInterceptor.class);

    @Autowired
    private StudentService studentService;
    @Autowired
    UserService userService;
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
       log.info("拦截器被调用");
        Cookie[] cookies=httpServletRequest.getCookies();
        if(cookies!=null){
            for (Cookie cookie:cookies){
                log.info("cookie不为空：正在遍历");
                if(cookie.getName().equals("token")){
                    String token=cookie.getValue();
                    byte[] tk1=DesUtil.decrypt(TypeUtil.hexStringToByte(token),"12345678");
                    String tk2=new String(tk1);
                    String id="";
                    String time="";
                    log.info("将cookie中的token进行解密中");
                    for (int j = 0; j < tk2.length(); j++) {
                        char c=tk2.charAt(j);
                        if(c=='='){
                            for (int k = j+1; k < tk2.length(); k++) {
                                time=time+tk2.charAt(k);
                            }
                            break;
                        }
                        id=id+c;
                        log.info(" 截取后的ID值为："+id);
                    }
                    if(userService.selectById(Integer.parseInt(id))!=null){
                        return true;
                    }
                }
            }
            httpServletRequest.getSession();
            String contextpath=httpServletRequest.getScheme()+"://"+httpServletRequest.getServerName()+":"+httpServletRequest.getServerPort()+httpServletRequest.getContextPath();
            String uri=contextpath+"/login";
            httpServletResponse.sendRedirect(uri);
            return true;

        }


        return false;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
