<%--
  Created by IntelliJ IDEA.
  User: Tom
  Date: 2017/4/15
  Time: 13:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>登录页面</h3>
<form action="/Task01/loginer" method="get">
    <table>
    <tr>
        <td><table>用户名：</table></td>
        <td><input type="text" id="name" name="name"/></td>
    </tr>
    <tr>
        <td><table>密  码：</table></td>
        <td><input type="text" id="password" name="password"/></td>
    </tr>
    <tr>
        <td><input type="submit" value="登录"/></td>
    </tr>
    </table>
</form>
</body>
</html>
