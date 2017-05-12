<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Tom
  Date: 2017/4/15
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h3>注册页面</h3>
<form:form action="/Task01/register" method="post" modelAttribute="student">
    <table>
        <tr>
            <td><table>名字：</table></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><table>密码：</table></td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td><table>抵达时间：</table></td>
            <td><form:input path="arrival_time"/></td>
        </tr>
        <tr>
            <td><table>qq：</table></td>
            <td><form:input path="qq"/></td>
        </tr>
        <tr>
            <td><table>学习类型：</table></td>
            <td><form:input path="study_type"/></td>
        </tr>
        <tr>
            <td><table>线上学号：</table></td>
            <td><form:input path="number_online"/></td>
        </tr>
        <tr>
            <td><table>日报链接：</table></td>
            <td><form:input path="diary_link"/></td>
        </tr>
        <tr>
            <td><table>毕业学校：</table></td>
            <td><form:input path="school"/></td>
        </tr>
        <tr>
            <td><table>立愿：</table></td>
            <td><form:input path="vow"/></td>
        </tr>
        <tr>
            <td><table>审核师兄：</table></td>
            <td><form:input path="assessor"/></td>
        </tr>
        <tr>
            <td><table>引荐师兄：</table></td>
            <td><form:input path="referee"/></td>
        </tr>
        <tr>
            <td><table>职业：</table></td>
            <td><form:input path="vocation"/></td>
        </tr>
        <tr>
            <td><table>介绍：</table></td>
            <td><form:input path="introduce"/></td>
        </tr>
        <tr>
            <td><table>是否优秀：</table></td>
            <td><form:input path="fin"/></td>
        </tr>
        <tr>
            <td><input id="submit" type="submit" value="注册"></td>
        </tr>
    </table>
    </form:form>
</body>
</html>