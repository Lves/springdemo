<%--
  Created by IntelliJ IDEA.
  User: lixingle
  Date: 2017/6/2
  Time: 上午9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC表单处理</title>
</head>
<body>
<h2>提交的信息如下</h2>
<table>
    <tr>
        <td>名称 </td>
        <td>${name}</td>
    </tr>
    <tr>
        <td>年龄 </td>
        <td>${age}</td>
    </tr>
    <tr>
        <td>编号 </td>
        <td>${id}</td>
    </tr>
    <tr>
        <td>密码 </td>
        <td>${password}</td>
    </tr>
    <tr>
        <td>喜欢的框架</td>
        <td><% String [] favoriteFrameworks = (String[]) request.getAttribute("favoriteFrameworks");
            for (String framework: favoriteFrameworks){
                out.println(framework);
            }

        %></td>

    </tr>

</table>

</body>
</html>
