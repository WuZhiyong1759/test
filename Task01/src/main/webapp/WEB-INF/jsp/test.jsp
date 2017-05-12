<%--
  Created by IntelliJ IDEA.
  User: Tom
  Date: 2017/4/29
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%--<!DOCTYPE html>--%>
<html>
<head>
    <%--<meta charset="utf-8">--%>
    <title>菜鸟教程(runoob.com)</title>
</head>
<body>
<form action="/Task01/main" method=GET>
    站点名: <input type="text" name="name">
    <br />
    网址: <input type="text" name="url" />
    <input type="submit" value="提交" />
</form>
</body>
</html>
