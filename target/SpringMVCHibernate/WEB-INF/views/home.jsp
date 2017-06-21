<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Palinsesto Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h3>Palinsesto List</h3>
<c:if test="${!empty listPalinsesti}">
    <table class="tg">
        <tr>
            <th width="80">Palinsesto ID</th>
            <th width="120">Nome</th>
            <th width="120">Vai alle Partite</th>
        </tr>
        <c:forEach items="${listPalinsesti}" var="palinsesto">
            <tr>
                <td>${palinsesto.id}</td>
                <td>${palinsesto.nomepalinsesto}</td>
                <td><a href="<c:url value='/partitepal/${palinsesto.id}' />" >Lista Partite</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
