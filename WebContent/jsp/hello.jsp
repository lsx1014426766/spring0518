<%@ page language="java" pageEncoding="utf-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=GBK">
<title>Insert title here</title>
</head>
<body>
你好:<%=request.getAttribute("userId") %> : <%=request.getAttribute("loginUser") %>
<br/>
你好：${userId}, ${loginUser}
</body>
</html>

