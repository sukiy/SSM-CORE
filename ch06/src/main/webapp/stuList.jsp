<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <h2>学生信息列表</h2>
    <table border="1" width="600">
        <tr>
            <td>编号</td><td>学生姓名</td>
            <td>年龄</td><td>性别</td>
        </tr>
        <c:forEach items="${stuList}" var="st" varStatus="ids">
        <tr>
            <td>${ids.count}</td><td>${st.sname}</td>
            <td>${st.sage}</td><td>${st.ssex}</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
