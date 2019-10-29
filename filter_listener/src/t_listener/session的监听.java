package t_listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//session的监听
public class session的监听 implements HttpSessionListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("一个session被创建了！");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("一个session被销毁了！");
    }
}
