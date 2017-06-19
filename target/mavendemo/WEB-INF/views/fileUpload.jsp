<%--
  Created by IntelliJ IDEA.
  User: lixingle
  Date: 2017/6/14
  Time: 上午8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="POST" action="/maven/fileUploadPage"
           enctype="multipart/form-data">
    请选择一个文件上传 :
    <input type="file" name="file" />
    <input type="submit" value="提交上传" />
</form:form>

</body>
</html>
