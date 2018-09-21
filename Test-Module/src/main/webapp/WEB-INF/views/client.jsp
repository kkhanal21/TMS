<%-- 
    Document   : client
    Created on : 30-Nov-2017, 09:52:14
    Author     : kamal
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Clients! ! !</h1>
        <c:forEach var="c" items="cList">
            <ul>
                <li>c.cId</li>
                <li>c.companyName</li>
            </ul>
        </c:forEach>
    </body>
</html>
