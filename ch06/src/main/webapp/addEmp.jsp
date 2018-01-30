<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>addEmp</title>
</head>
<body>
    <h2>添加员工</h2>
    <form method="post" action="${pageContext.request.contextPath}/empAction/addEmp">
        员工姓名:<input name="ename"/><br/>
        员工年龄:<input name="eage"/><br/>
        所属部门:<select name="dept.dno">
                    <option value="">请选择部门</option>
                    <c:forEach items="${deptList}" var="de">
                        <option value="${de.dno}">${de.dname}</option>
                    </c:forEach>
                 </select>
        <br/>
        <input type="submit" value="添加员工">
    </form>
    <br/>
    <a href="${pageContext.request.contextPath}/stuAction/stuList">学生信息列表</a>
    <hr>
    <a href="${pageContext.request.contextPath}/empAction/toAddEmp">添加员工</a><br/>
    <a href="${pageContext.request.contextPath}/empAction/findEmpList">查询所有员工</a>
</body>
</html>
