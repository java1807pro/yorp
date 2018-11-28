package com.qy.controller;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginController implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        Object usee=request.getSession().getAttribute("USER_SESSION_KEY");
              String path=request.getContextPath();
              String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
              if (usee==null){
                  System.out.println("尚未登录，跳到登录页面");
                  response.sendRedirect(basePath+"background/login.html");
               return false;
              }
       System.out.println("000");
        return true;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        System.out.println("postHandle");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("afterCompletion");
    }
}
