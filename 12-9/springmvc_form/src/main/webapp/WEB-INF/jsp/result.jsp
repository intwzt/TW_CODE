<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>注册用户信息</h2>
   <table>
    <tr>
        <td>用户名：</td>
        <!-- 获取controller中model传来的参数 -->
        <td>${username}</td>
    </tr>
    <tr>
        <td>密码：</td>
        <td>${userpassword}</td>
    </tr>
    <tr>
        <td>性别：</td>
        <td>${sex}</td>
    </tr>
    <tr>
        <td>生日：</td>
        <td>${birthday}</td>
    </tr>
    <tr>
        <td>E-Mail：</td>
        <td>${email}</td>
    </tr>
    <tr>
        <td>住址：</td>
        <td>${address}</td>
    </tr>
</table>  
</body>
</html>