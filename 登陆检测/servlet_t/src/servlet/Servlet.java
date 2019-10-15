package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class Servlet extends HttpServlet{
    // 覆盖doGet() / doPost() 方法
    @Override
    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String login = request.getParameter("login");
        String psw = request.getParameter("psw");

        if (login.equals("admin") && psw.equals("admin")){
            response.getWriter().write(login);
            response.getWriter().write(psw);
            response.getWriter().write("s yes!.!");
        }else {
            response.getWriter().write(login);
            response.getWriter().write(psw);
            response.getWriter().write("</br>");
            response.getWriter().write("fuckyou=。=");
        }
    }
}