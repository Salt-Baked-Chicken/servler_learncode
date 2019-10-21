package servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter(filterName = "f_t")
// 拦截地址设置在web.xml文件中
// 用url-pattern子标签设置拦截地址
// 支持/index.jsp的资源匹配
// 支持*.jsp的后缀名匹配
// 支持/servlet/*以目录匹配
// 支持/*通配符拦截服务器下所有web资源
// 过滤器加载顺序由xml的mapping标签先后顺序决定
public class f_t implements Filter {
    public void destroy() {

    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("网址：shit");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {
        String site = config.getInitParameter("site");
        System.out.println("网站名称" + site);
    }
}
