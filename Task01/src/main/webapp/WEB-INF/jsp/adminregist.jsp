<%--
  Created by IntelliJ IDEA.
  User: Tom
  Date: 2017/5/4
  Time: 16:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>注册页面</h3>
<form action="/Task01/register" method="POST">
    <table>
        <tr>
            <td><table>用户名：</table></td>
            <td><input type="text" id="UserName" name="UserName"/></td>
        </tr>
        <tr>
            <td><table>密  码：</table></td>
            <td><input type="text" id="pwd" name="pwd"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"/></td>
        </tr>
    </table>
</form>
</body>
</html>
