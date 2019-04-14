<%--
  Created by IntelliJ IDEA.
  User: xunqi
  Date: 2019/4/14
  Time: 16:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" context="text/html" charset="UTF-8" />
    <title>DataBinder_Userregister</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/registerUser" method="post">
        用户名：<input type="text" name="username"  />
        <br />
        密&nbsp;&nbsp;&nbsp;码：<input type="text" name="password" />
        <br />
        <input type="submit" name="注册"  />
    </form>
</body>
</html>
