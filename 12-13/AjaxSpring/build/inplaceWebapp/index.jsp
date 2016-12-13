<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
<title>TestJSONForSpringMVC</title>
    <script type="text/javascript" src="http://ajax.microsoft.com/ajax/jquery/jquery-1.4.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
            $("#login").click(function () {
                $.ajax({
                    url: "test/testJSON.do",
                    type: "POST",
                    dataType: "json",
                    contentType: "application/json;charset=UTF-8",
                    data: JSON.stringify({
                        userName: $("#userName").val(),
                        userPassword: $("#userPassword").val()
                    }),
                    success: function (data) {
                        alert("新增成功！");

                    },
                    error: function (data) {
                        alert("发生错误！");
                    }
                });
            });
        })
    </script>
</head>
<body>
    用户名:
    <input id="userName" type="text" style="width:150px" />
    <br /> 
    <br />
    密&nbsp;&nbsp;&nbsp;&nbsp;码:
    <input id="userPassword" type="password" style="width:150px" />
    <br />
    <br />
    <input id="login" type="button" value="登录" />
</body>
</html>
