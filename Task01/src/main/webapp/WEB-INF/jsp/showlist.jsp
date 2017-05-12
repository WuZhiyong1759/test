<%@ page import="java.util.Date" %>
<%@ page import="com.jnshu.model.Student"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<%@ taglib prefix="s" uri="http://java.sun.com/jstl/sql_rt" %>--%>
<%--<%@ taglib prefix="s" uri="http://java.sun.com/jstl/sql" %>--%>
<%@ taglib prefix="s" uri="http://java.sun.com/jsp/jstl/sql" %>
<%--
  Created by IntelliJ IDEA.
  User: Tom
  Date: 2017/4/16
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="/tags" prefix="date"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>详细信息列表<a href="/Task01/add">添加</a></h2>

<form>
    <table>
        <tr>
            <td>ID</td>
            <td>名字</td>
            <td>密码</td>
            <td>抵达时间</td>
            <td>QQ</td>
            <td>修真类型</td>
            <td>线上学号</td>
            <td>日报链接</td>
            <td>毕业院校</td>
            <td>立愿</td>
            <td>审核师兄</td>
            <td>引荐师兄</td>
            <td>职业</td>
            <td>介绍</td>
            <td>是否优秀</td>
            <td>创建日期</td>
            <td>更新日期</td>
            <td>删除</td>
            <td>更新</td>
        </tr>
        <c:forEach items="${studentList}" var="student">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.password}</td>
                <td>${student.arrival_time}</td>
                <td>${student.qq}</td>
                <td>${student.study_type}</td>
                <td>${student.number_online}</td>
                <td>${student.diary_link}</td>
                <td>${student.school}</td>
                <td>${student.vow}</td>
                <td>${student.assessor}</td>
                <td>${student.referee}</td>
                <td>${student.vocation}</td>
                <td>${student.introduce}</td>
                <td>${student.fin}</td>
                <%--<td>${student.create_at}</td>--%>
                <%--<td>${student.update_at}</td>--%>
            <%--<%=%>--%>
                <jsp:useBean id="createTime" class="java.util.Date" scope="page"></jsp:useBean>
                <jsp:setProperty property="time" name="createTime" value="${student.create_at}"/>
                <td><fmt:formatDate value="${createTime}" pattern="yyyy-MM-dd" /></td>
                <%--<jsp:useBean id="updateTime" class="java.util.Date" scope="page"></jsp:useBean>--%>
                <%--<jsp:setProperty property="time" name="updateTime" value="${student.update_at}"/>--%>
                <%--<td><fmt:formatDate value="${updateTime}" pattern="yyyy-MM-dd" /></td>--%>
                <td><date:date value="${student.update_at}"/>



                <%--<td><fmt:formatDate value="${student.create_at}" /></td>--%>
                <%--<td><fmt:formatDate value="${student.update_at}" /></td>--%>
            <%--<fmt:formatDate value="${student.create_at}" pattern="yyyy-MM-dd"></fmt:formatDate>--%>
            <%--<fmt:formatDate value="${student.update_at}" pattern="yyyy-MM-dd"></fmt:formatDate>--%>

            <%--<td><s:dateParam value="${student.create_at}" type="yyyy-MM-dd"></s:dateParam></td>--%>
            <%--<td><s:dateParam value="${student.update_at}" type="yyyy-MM-dd"></s:dateParam></td>--%>


                <td><a href="/Task01/delete/${student.id}">删除</a> </td>
                <td><a href="/Task01/update/${student.id}" >更新</a> </td>
                <%--<td>--%>
                    <%--<form:form action="/update" >--%>
                        <%--<input type="hidden" about="" value="${student}"/>--%>
                        <%--<input type="submit" value="更新" />--%>
                    <%--</form:form>--%>
                <%--</td>--%>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
