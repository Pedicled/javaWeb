<%--
  Created by IntelliJ IDEA.
  User: xunqi
  Date: 2019/6/4
  Time: 18:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.net.URLEncoder" %>
<html>
<head>
    <meta http-equiv="Content-Type" charset="UTF-8" content="text/html" />
</head>
<body>
    <a href="${pageContext.request.contextPath}/download?filename=1.jpg">
        文件下载
    </a>
    <a href="${pageContext.request.contextPath}/download?filename=<%=URLEncoder.encode("壁纸.jpg","UTF-8")%>">
        中文名文件下载
    </a>
</body>
</html>
