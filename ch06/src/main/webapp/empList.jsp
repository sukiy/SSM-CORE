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
    <h2>员工信息列表</h2>
    <table border="1" width="600">
        <tr>
            <td>编号</td><td>部门名称</td><td>员工姓名</td>
            <td>年龄</td>
        </tr>
        <c:forEach items="${empList}" var="em" varStatus="ids">
        <tr>
            <td>${ids.count}</td><td>${em.dept.dname}</td>
            <td>${em.ename}</td><td>${em.eage}</td>
        </tr>
        </c:forEach>
    </table>
    <a href="${pageContext.request.contextPath}/stuAction/stuList">学生信息列表</a>
    <hr>
    <a href="${pageContext.request.contextPath}/empAction/toAddEmp">添加员工</a><br/>
    <a href="${pageContext.request.contextPath}/empAction/findEmpList">查询所有员工</a>
</body>
</html>
