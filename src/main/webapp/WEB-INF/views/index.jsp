<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>Hello World!</h2>
<p>点击下面的按钮获得一个简单的HTML页面</p>
<form:form method="GET" action="/maven/staticPage">
    <table>
        <tr>
            <td>
                <input type="submit" value="获取HTML页面"/>
            </td>
        </tr>
    </table>
</form:form>
<p>点击下面的按钮将结果重定向到新页面</p>
<form:form method="GET" action="/maven/redirect">
    <table>
        <tr>
            <td><input type="submit" value="页面重定向" /></td>
        </tr>
    </table>
</form:form>
</body>
</html>
