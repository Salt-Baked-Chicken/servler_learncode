package com;

import javax.servlet.*;

public class f implements Filter {

    public void init(FilterConfig config) throws ServletException{
        String site = config.getInitParameter("site");
        System.out.println("网站名称" + site);
    }
    public void doFilter(ServletRequest request, ServletResponse response,FilterChain chain) throws  java.io.IOException,ServletException {
        System.out.println("网址：shit");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
