<%--
  Created by IntelliJ IDEA.
  User: JRK
  Date: 2023/10/15
  Time: 0:15
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>错误提示</title>
</head>
  <body>
    系统出现异常。
    <c:if test="${message != null}">
      异常原因：${message}
    </c:if>
  </body>
</html>