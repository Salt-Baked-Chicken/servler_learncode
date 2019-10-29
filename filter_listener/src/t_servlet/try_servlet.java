package t_servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class try_servlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        request.setAttribute("shit","Attribute is 123");
        System.out.println(request.getAttribute("shit"));
        request.setAttribute("shit","Attribute is not 123");
        System.out.println(request.getAttribute("shit"));
        request.removeAttribute("shit");
    }
}
