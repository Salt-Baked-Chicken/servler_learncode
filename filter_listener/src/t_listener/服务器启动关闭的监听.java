package t_listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//服务器启动关闭的监听
public class 服务器启动关闭的监听 implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("他他他被创建了！！");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("他他他被销毁了！！");
    }
}
