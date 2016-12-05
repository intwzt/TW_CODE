<%--
  Created by IntelliJ IDEA.
  User: ztWang
  Date: 11/29/16
  Time: 2:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>新用户注册</title>
</head>
<body>
<form method="POST" action="servlet/AcceptUserReg" name="form1" onsubmit="return on_submit()">
  新用户注册<br>
  用户名(*):<input type="text" name="username" size="20"><br>
  密 码(*):<input type="password" name="userpassword" size="20"><br>
  性别:<input type="radio" value="male" checked name="sex">男<input type="radio" name="sex" value="female">女<br>
  出生年月:<input name="year" size="4" maxlength=4>年
  <input name="month" size="3" maxlength=4>月
  <input name="day" size="3" maxlength=4>日<br>
  电子邮箱(*):<input name="E-mail" maxlength=28><br>
  家庭住址:<input type="text" name="address" size="20"><br>
  <input type="submit" value="提交" name="B1"><br>
</form>
</body>
</html>
