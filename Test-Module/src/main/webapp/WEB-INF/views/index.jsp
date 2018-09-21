<%-- 
    Document   : index
    Created on : 28-Nov-2017, 22:14:49
    Author     : kamal
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="${SITE_URL}/static/js/jquery.min.js" type="text/javascript"></script>
    </head>
    <body>
        <h1>Test TMS Project</h1>
<!--        <div id="result">

        </div>-->
<!--        <script>
            $(function () {
                var $("result").html("<h1>Loading...</h1>");
                        $.getJSON('${SITE_URL}/project/getAll', function (res) {
                            var table = "<table border='1'><tr><th>Id</th><th>startedDate</th><th>endDate</th><th>status</th><th>cId</th></tr>";
                            $.each(res.list, function (i, o) {
                                table += '<tr><td>' + o.PId + '</td>';
                            });
                            table += '</table>';
                            $result.html(table);
                        });
            });

        </script>-->
    </body>
</html>
