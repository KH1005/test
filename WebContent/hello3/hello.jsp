<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="/Struts2/hello3/hello3.action">
	<c:if test="${!empty FieldErrors.validate }">
		input your name:<input type="text" name="name" ><font color="red">${ FieldErrors.validate}</font><br>
	</c:if>
	<c:if test="${empty FieldErrors.validate }">
		input your name:<input type="text" name="name"><br>
	</c:if>
	<input type="submit">
</form>

</body>
</html>