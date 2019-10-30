<%--
  Created by IntelliJ IDEA.
  User: yanru
  Date: 2019/10/28
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  end
  <%
      if (session.getAttribute("shit1") != null) {
          for (int i = 0; i < 4;i++){
              out.println(session.getAttribute("shit"+i));
              out.println(session.getAttribute("shit"+i+"a"));
              session.removeAttribute("shit"+i);
              session.removeAttribute("shit"+i+"a");
          }
      }
  %>
  </body>
</html>
