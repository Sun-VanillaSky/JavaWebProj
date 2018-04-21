<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%-- 
	引入jstl标签 
	javax.servlet.jsp.jstl-api-1.2.1.jar
	standard-1.1.2.jar （jsp标签库）
--%>	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>



<!-- 引入jquery -->
<script type="text/javascript"
	src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	jquery(function (){
		  alert("${pageContext.request.contextPath }");
	});

</script>
</head>
<body>

	<p>hello！bye！中文</p>
	<c:out value="XXXL"  default="默认值"/>
</body>

</html>