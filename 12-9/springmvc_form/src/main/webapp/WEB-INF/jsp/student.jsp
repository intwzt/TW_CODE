<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring MVC Form Handling</title>
</head>
<body>

<h2>User Information</h2>
<!--表示方法是post，post的路径是/HelloWeb/addStudent，交给controller中特定的方法处理 -->
<form:form method="POST" action="/springmvc_form/addStudent">
   <table>
    <tr>
        <td><form:label path="username">用户名</form:label></td>
        <td><form:input path="username" /></td>
    </tr>
    <tr>
        <td><form:label path="userpassword">密码</form:label></td>
        <td><form:input path="userpassword" /></td>
    </tr>
    <tr>
        <td><form:label path="sex">性别</form:label></td>
        <td><form:input path="sex" /></td>
    </tr>
    <tr>
        <td><form:label path="birthday">生日</form:label></td>
        <td><form:input path="birthday" /></td>
    </tr>
    <tr>
        <td><form:label path="email">E-Mail</form:label></td>
        <td><form:input path="email" /></td>
    </tr>
    <tr>
        <td><form:label path="address">地址</form:label></td>
        <td><form:input path="address" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Submit"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>
