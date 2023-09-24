package com.up.stores.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** 定义处理器拦截器 */
//通过将LoginInterceptor注册为处理器拦截器，可以实现对特定请求进行拦截，
// 并在用户未登录时进行重定向到登录页面的操作。这样可以确保只有经过登录认证的用户才能访问受保护的资源。
public class LoginInterceptor implements HandlerInterceptor {
    //preHandle方法在请求处理之前被调用，用于进行预处理操作。
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
       //获取当前会话中名为"uid"的属性值。
        if (request.getSession().getAttribute("uid") == null) {
            response.sendRedirect("/web/login.html");
            return false;
        }
        return true;
    }
}
