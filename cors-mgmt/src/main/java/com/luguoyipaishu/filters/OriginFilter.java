package com.luguoyipaishu.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 采用过滤器的方式实现跨域请求
 *
 * @author 路过一排树
 * @date 2020/10/29 22:07
 */
@WebFilter(urlPatterns = "/*")
public class OriginFilter implements Filter {

    //这里面 填写不需要 被拦截的地址
//    private static final Set<String> ALLOWED_PATHS = Collections.unmodifiableSet(
//            new HashSet<String>(Arrays.asList("/login"))
//    );

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        String requestURI = request.getRequestURI();
        if (!requestURI.equals("/filter/login")) {
            chain.doFilter(request, response);
            return;
        }
        //解决跨域的问题
        response.setHeader("Access-Control-Allow-Origin", request.getHeader("origin"));  //可以根据不同环境进行适配
//        response.setHeader("Access-Control-Allow-Origin", "http://localhost:8080");  //可以根据不同环境进行适配
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type,Content-Length, Authorization, Accept,X-Requested-With,X-App-Id, X-Token");
        response.setHeader("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
        response.setHeader("Access-Control-Max-Age", "3600");

        if (request.getMethod().equals("OPTIONS")) {
            response.getWriter().println("ok");
            return;
        }
        String path = request.getRequestURI().substring(request.getContextPath().length()).replaceAll("[/]+$", "");
//        boolean allowePath = ALLOWED_PATHS.contains(path);
//        if (!allowePath) {  //需要拦截的方法
//            Object aa = request.getSession().getAttribute("user");
//            if (aa != null) {
//                chain.doFilter(request, response);
//            } else {
//                response.getWriter().write("noLogin");
//            }
//        } else {  //不需要被拦截的方法
        //直接放行
        chain.doFilter(request, response);
//        }
    }
}
