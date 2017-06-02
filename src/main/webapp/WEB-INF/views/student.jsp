<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: lixingle
  Date: 2017/6/2
  Time: 上午9:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单处理</title>
</head>
<body>
<h2>用户信息</h2>
<form:form method="post" action="/maven/addStudent">
    <table>
        <tr>
            <td><form:label path="name">名字:</form:label> </td>
            <td><form:input path="name"/> </td>
        </tr>
        <tr>
            <td><form:label path="age">年龄:</form:label> </td>
            <td><form:input path="age"/> </td>
        </tr>
        <tr>
            <td><form:label path="id">编号:</form:label> </td>
            <td><form:input path="id"/> </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</form:form>

</body>
</html>