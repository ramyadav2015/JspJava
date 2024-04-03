<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>this is index page</h2>  
  
<jsp:forward page="send.jsp" >  
<jsp:param name="name" value="java" />  
</jsp:forward>
</body>
</html>