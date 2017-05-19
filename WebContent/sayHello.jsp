<%@ page language="java" pageEncoding="utf-8"%>
<html>
	<head>
		<title>第一个Spring MVC实例</title>
	</head>
	<!-- 这里给出了2种方式来获取到model里的数据：
	     1:通过request attribute
	     2:通过el表达式 -->
	<%
		String str = (String) request.getAttribute("helloWorld");
	%>
	${helloWorld}
	<body>
		<h1>
			您输入的欢迎语是<%=str%></h1>
	</body>
</html>
