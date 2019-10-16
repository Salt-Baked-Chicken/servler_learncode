<%@ page import="servlet.yan" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>try_code_EL</title>
</head>
<body>
    <!--建立对象及一些变量，用于在下方输出显示-->
    <%
        String s = "字符串及变量显示";

        yan y = new yan();
        y.setName("对象属性显示");

        List name = new ArrayList();
        name.add(0, "我是集合值嗷");
        name.add(1,"我也是嗷");
        request.setAttribute("names",name);

        request.setAttribute("sc", s);
        request.setAttribute("ob", y);
    %>

    <!--用EL在页面输出变量-->
    ${sc}
    <br/><br/>
    <!--用EL在页面输出对象属性-->
    <%=((yan)request.getAttribute("ob")).getName()%>
    <br/><br/>
    输出数组下标位的内容：${ names[0] }<br/>
</body>
</html>
