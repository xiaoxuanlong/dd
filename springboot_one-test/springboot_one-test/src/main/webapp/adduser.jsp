<%--
  Created by IntelliJ IDEA.
  User: 龙哥哥
  Date: 2021/8/20
  Time: 15:37
  To change this template use File | Settings | File Templates.
--%>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<base href="<%=basePath%>" />
<html>
<head>
</head>
<body>
<p>hello</p>
    <form action="user/insert" method="post">
        编号<input type="text" name="id"><br>
        姓名<input type="text" name="name"><br>
        年龄<input type="text" name="age"><br>
        电话<input type="text" name="phone"><br>
        地址<input type="text" name="address"><br>
        <input type="submit" value="用户注册">
    </form>
</body>
</html>
