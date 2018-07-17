<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Login</title>
</head>

<body>
    <h1>登录页面----${message }</h1>
    <%-- <img alt="" src="${pageContext.request.contextPath }/pic.jpg"> --%>
    <form id='login' action="${pageContext.request.contextPath }/login.do" method="post" style="padding-top:5px;">
        用户名：<input name="username"   id="username" >
        <br />
        密码：<input name="password"   id="password"  >
        <input id="addPaSub" type="submit" value="提交"/>
    </form>
</body>
</html>