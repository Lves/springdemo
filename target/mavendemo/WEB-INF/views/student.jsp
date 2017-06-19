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
            <td></td>
            <td><form:hidden path="id" value = "100"/> </td>
        </tr>
        <tr>
            <td><form:label path="password">密码：</form:label></td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td><form:label path="favoriteFrameworks">框架：</form:label></td>
            <td><form:checkboxes path="favoriteFrameworks" items="${webFrameworkList}"/></td>
        </tr>
        <tr>
            <td><form:label path="country">国家：</form:label></td>
            <td><form:select path="country">
                <form:option value="NONE" label="请选择..."/>
                <form:options items="${countryList}"/>
            </form:select> </td>
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
