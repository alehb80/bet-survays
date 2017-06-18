<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserisci le tue credenziali</title>
</head>
<body>
<form:form method="POST" action="loginadmin" modelAttribute="admin">
    <table>
        <tr>
            <td><form:label path="email">Email:</form:label></td>
            <td><form:input path="email" /></td>
        </tr>
        <tr>
            <td><form:label path="pwd">Password:</form:label></td>
            <td><form:input path="pwd" /></td>
        </tr>

        <tr>
            <td><input type="submit" value="Submit" /></td>
        </tr>
    </table>
</form:form>

</body>
</html>