<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@include file="/basePage/base.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
<script src="/jquery-1.9.1.min.js"></script>

<script  type="text/javascript">
$(function(){
	$('#b').click(function() {
		alert('asd');
	});
		
});
</script>
</head>
<body>
	<input id="b" type="button" value="button"/>
</body>
</html>