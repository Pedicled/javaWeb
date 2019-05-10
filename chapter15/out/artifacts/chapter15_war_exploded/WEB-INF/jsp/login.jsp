<%--
  Created by IntelliJ IDEA.
  User: xunqi
  Date: 2019/5/10
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
    <title>login__用户登陆</title>
</head>
<body>
    ${msg}
    <form action="${pageContext.request.contextPath}/login" method="post"  >
        用户名：<input type="text" name="username"  />
        <br/>
        密&nbsp;&nbsp;&nbsp;码：<input type="password" name="password"   />
        <br/>
        <input type="submit" name="登陆"/>
    </form>
</body>
</html>
