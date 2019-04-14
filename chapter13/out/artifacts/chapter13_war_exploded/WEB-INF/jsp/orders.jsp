<%--
  Created by IntelliJ IDEA.
  User: xunqi
  Date: 2019/4/14
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8" />
    <title>绑定包装POJO</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/orders/findOrdersWithUser" method="post">
        订单编号：<input type="text" name="ordersID" />
        <br/>
        所需用户：<input type="text" name="user.username"    />
        <br/>
        <input type="submit" value="查询" />
    </form>
</body>
</html>
