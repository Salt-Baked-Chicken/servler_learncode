package t_listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

//request的监听
public class request的监听 implements ServletRequestListener {

    @Override
    public void requestDestroyed(ServletRequestEvent servletRequestEvent) {
        System.out.println("request请求因为已响应被销毁了");
        System.out.println("这个对象的地址名是"+servletRequestEvent.getServletRequest().getAttributeNames());
        System.out.println("==================================");
    }

    @Override
    public void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("一个request对象被创建了！");
    }
}