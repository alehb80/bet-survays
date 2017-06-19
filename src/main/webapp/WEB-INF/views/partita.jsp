<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
    <title>Partita Page</title>
    <style type="text/css">
        .tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
        .tg td{font-family:Arial, sans-serif;font-size:14px;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
        .tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:10px 5px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
        .tg .tg-4eph{background-color:#f9f9f9}
    </style>
</head>
<body>
<h1>
    Aggiungi una Partita
</h1>

<c:url var="addAction" value="/partita/add" ></c:url>

<form:form action="${addAction}" commandName="partita">
    <table>
        <c:if test="${!empty partita.nome}">
            <tr>
                <td>
                    <form:label path="id">
                        <spring:message text="ID"/>
                    </form:label>
                </td>
                <td>
                    <form:input path="id" readonly="true" size="8"  disabled="true" />
                    <form:hidden path="id" />
                </td>
            </tr>
        </c:if>
        <tr>
            <td>
                <form:label path="nome">
                    <spring:message text="Inserisci il nome di una p:"/>
                </form:label>
            </td>
            <td>
                <form:input path="nome" />
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <c:if test="${!empty partita.nome}">
                    <input type="submit"
                           value="<spring:message text="Edit Partita"/>" />
                </c:if>
                <c:if test="${empty partita.nome}">
                    <input type="submit"
                           value="<spring:message text="Add Partita"/>" />
                </c:if>
            </td>
        </tr>
    </table>
</form:form>
<br>
<h3>Partite List</h3>
<c:if test="${!empty listPartite}">
    <table class="tg">
        <tr>
            <th width="80">Partita ID</th>
            <th width="120">Nome</th>
            <th width="60">Edit</th>
            <th width="60">Delete</th>
            <th width="120">Vai alle Quote</th>
        </tr>
        <c:forEach items="${listPartite}" var="partita">
            <tr>
                <td>${partita.id}</td>
                <td>${partita.nome}</td>
                <td><a href="<c:url value='/edit/${partita.id}' />" >Edit</a></td>
                <td><a href="<c:url value='/remove/${partita.id}' />" >Delete</a></td>
                <td><a href="<c:url value="/home" />" >Lista Quote</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>
