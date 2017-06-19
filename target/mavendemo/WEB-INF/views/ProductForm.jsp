<%--
  Created by IntelliJ IDEA.
  User: lixingle
  Date: 2017/6/16
  Time: 上午10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加产品表单</title>
</head>
<body>

<form action="/maven/product_save" method="post">
    <fieldset>
        <legend>添加一个商品</legend>
        <p>
            <label for="name">产品名：</label>
            <input type="text" id="name" name="name" tabindex="1"/>
        </p>
        <p>
            <label for="description">详情：</label>
            <input type="text" id="description" name="description" tabindex="2"/>
        </p>
        <p>
            <label for="price">价格：</label>
            <input type="text" id="price" name="price" tabindex="3"/>
        </p>
        <p id = "button">
            <input id="reset" type="reset" tabindex="4">
            <input id="submit" type="submit" tabindex="5" value="提交">
        </p>
    </fieldset>
</form>

</body>
</html>
