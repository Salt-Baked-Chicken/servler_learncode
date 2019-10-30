package t_servlet;

import JDBC_select.jdbc_select;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class try_servlet extends HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("shit","123");
        request.setAttribute("shit","Attribute is 123");
        System.out.println(request.getAttribute("shit"));
        request.setAttribute("shit","Attribute is not 123");
        System.out.println(request.getAttribute("shit"));
        request.removeAttribute("shit");
        session.setAttribute("shit","abc");
        session.removeAttribute("shit");
        //session.invalidate();
        jdbc_select s = new jdbc_select();
        for (int i = 0; i < 4 - 1; i++) {
            session.setAttribute("shit"+i,s.a().get(i).getId());
            session.setAttribute("shit"+i+"a",s.a().get(i).gettopic());
            System.out.println(session.getAttribute("shit"+i));
            System.out.println(session.getAttribute("shit"+i+"a"));
        }
        response.sendRedirect("index.jsp");
    }
}
