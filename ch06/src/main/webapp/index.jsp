<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/1/30
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <h2>添加学生</h2>
    <form method="post" action="${pageContext.request.contextPath}/stuAction/addStudent">
        学生姓名:<input name="sname"/><br/>
        学生年龄:<input name="sage"/><br/>
        学生性别:<input name="ssex" value="男"/><br/>
        <input type="submit" value="添加学生">
    </form>
    <br/>
    <a href="${pageContext.request.contextPath}/stuAction/stuList">学生信息列表</a>
    <hr>
    <a href="${pageContext.request.contextPath}/empAction/toAddEmp">添加员工</a><br/>
    <a href="${pageContext.request.contextPath}/empAction/findEmpList">查询所有员工</a>
</body>
</html>
