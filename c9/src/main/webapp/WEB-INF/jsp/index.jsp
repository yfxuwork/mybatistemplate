<%@page import="java.util.Date" %>
<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<meta http-equiv=Content-Type content="text/html;charset=utf-8">
<body>
<h2>Hello World!</h2>

服务器时间:<fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/>
</body>
</html>
