<%@ page import="servlet.yan" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL</title>
</head>
<body>
    <c:out value="输出一些东西"/>
    <c:set var="salary" scope="session" value="${2000}"/>
    <br/>
    <c:out value="${ salary }"/>
    <c:remove var="salary" />
    <c:out value="${ salary }"/>
    <br/>
    <c:out value="上面输出了两次salary，值为2000，
        页面只显示一次，证明remove标签删除成功"/>

    <c:catch var = "catchException">
        <% int x = 5/0; %>
    </c:catch>

    <c:if test = "${catchException != null}">
        <p>异常为：${catchException} </br>
            发生了异常：${catchException.message}</p>
    </c:if>

    <c:choose>
        <c:when test="${salary <= 0}">
            太惨了。
        </c:when>
        <c:when test="${salary > 1000}">
            还不错嘛，能活
        </c:when>
        <c:otherwise>
            什么都么得。//因为你删掉了salary变量
            </br></br>
        </c:otherwise>
    </c:choose>

    <%
        Map<String, String> map = new HashMap<String, String>();
        map.put("tom",  "美国");
        map.put("lily",  "英国");
        map.put("jack", "中国");
        request.setAttribute("map",  map);
    %>
    //说明循环begin起始位是0</br>
    //end可以用来结束在哪个下标位，有数组越界风险</br>
    //step="num"表示循环一次，循环下标+num，跳几步走</br>
    <c:forEach  items="${requestScope.map}"
                var="entry" begin="1">
        ${ entry.key }
        ${ entry.value }
    </c:forEach>
</body>
</html>
